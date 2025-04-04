package org.example;

import java.sql.*;

public class SalaAula {
    private static final String DB_URL = "jdbc:sqlite:my.db";

    public static void conectar() {
        try (var conn = DriverManager.getConnection(DB_URL)) {
            if (conn != null) {
                var meta = conn.getMetaData();
                System.out.println("Conectado com driver: " + meta.getDriverName());
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar: " + e.getMessage());
        }
    }

    public static void criarTabela() {
        String sql = """
                CREATE TABLE IF NOT EXISTS sala (
                    id INTEGER PRIMARY KEY AUTOINCREMENT,
                    name TEXT NOT NULL
                );
                """;

        try (var conn = DriverManager.getConnection(DB_URL);
             var stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void addAluno(String name) {
        String sql = "INSERT INTO sala(name) VALUES(?)";

        try (var conn = DriverManager.getConnection(DB_URL);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, name);
            pstmt.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erro ao adicionar aluno: " + e.getMessage());
        }
    }

    public boolean alunoExiste(String nome) {
        String sql = "SELECT COUNT(*) FROM sala WHERE name = ?";
        try (var conn = DriverManager.getConnection(DB_URL);
             var pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, nome);
            var rs = pstmt.executeQuery();
            return rs.getInt(1) > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao verificar aluno: " + e.getMessage());
            return false;
        }
    }
}