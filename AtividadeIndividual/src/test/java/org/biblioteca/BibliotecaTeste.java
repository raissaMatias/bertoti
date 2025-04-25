package org.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import java.util.List;


public class BibliotecaTeste {

    @Test
    void testAdicionarDoisLivros() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O profeta", "0978-85-01-00001-4");
        Livro livro2 = new Livro("Cartas a um jovem poeta", "0978-85-01-00001-2");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        System.out.println("Livros adicionados:");
        for (Livro l : biblioteca.getLivros()) {
            System.out.println(l);
        }

        assertEquals(2, biblioteca.getLivros().size());
    }

    @Test
    void testTrazPrimeiroLivroDaLista() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Prozac Nation", "0-123");
        Livro livro2 = new Livro("Zonas Úmidas", "0-321");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        List<Livro> todosLivros = biblioteca.getLivros();

        System.out.println("Primeiro livro:");
        System.out.println(todosLivros.get(0));


        assertEquals(livro1.getIsbn(), todosLivros.get(0).getIsbn());;
    }

    @Test
    void testLivrosSaoDiferentes() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Garota Interrompida", "00-456");
        Livro livro2 = new Livro("Coração de Tinta", "00-654");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        List<Livro> todosLivros = biblioteca.getLivros();

        System.out.println("Comparando livros:");
        for (Livro l : todosLivros) {
            System.out.println(l);
        }

        assertNotEquals(todosLivros.get(0).getTitulo(), todosLivros.get(1).getTitulo());
    }
}
