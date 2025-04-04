package org.example;

public class SalaAulaTest {
    public static void main(String[] args) {
        SalaAula sala = new SalaAula();

        SalaAula.criarTabela();

        String aluno = "João";

        sala.addAluno(aluno);

        assert sala.alunoExiste(aluno) : "Erro: o aluno não foi encontrado no banco!";

        System.out.println("Deu certo: aluno foi inserido com sucesso.");
    }
}
