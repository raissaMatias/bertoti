# código Main

```java
package org.example;

import org.example.SalaAula;

import java.sql.DriverManager;
import java.sql.SQLException;

import static org.example.SalaAula.conectar;

public class Main {

    static SalaAula sala = new SalaAula();

    public static void connect() {
        // connection string
        var url = "jdbc:sqlite:c:/sqlite/db/chinook.db";

        try (var conn = DriverManager.getConnection(url)) {
            System.out.println("Connection to SQLite has been established.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        //sala.criarTabela();
        sala.addAluno("name");
        conectar();
    }
}
```
# código SalaDeAula

```java
package org.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SalaAula {

    public static void conectar(){
        String url = "jdbc:sqlite:my.db";

        try (var conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                var meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void criarTabela() {
        // SQLite connection string
        var url = "jdbc:sqlite:my.db";

        // SQL statement for creating a new table
        var sql = "CREATE TABLE sala ("
                + "	id INTEGER PRIMARY KEY,"
                + "	name text NOT NULL,"
                + ");";

        try (var conn = DriverManager.getConnection(url);
             var stmt = conn.createStatement()) {
            // create a new table
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addAluno(String name) {
        String url = "jdbc:sqlite:my.db";

        var names = new String[]{"Joao"};

        String sql = "INSERT INTO sala(name) VALUES('Joao')";

        try (var conn = DriverManager.getConnection(url);
             var pstmt = conn.prepareStatement(sql)) {

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }
}
```
