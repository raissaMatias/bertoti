package org.example;

public class Main {
    static SalaAula sala = new SalaAula();

    public static void main(String[] args) {

        sala.criarTabela();

        sala.addAluno("Raissa");

        System.out.println("Aluno adicionado com sucesso.");
    }
}
