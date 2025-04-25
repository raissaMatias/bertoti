package org.biblioteca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;
import java.util.List;


public class BibliotecaTeste {

    @Test
    void testAdicionarDoisLivros() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O profeta", "1234567890");
        Livro livro2 = new Livro("Cartas a um jovem poeta", "0987654321");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        assertEquals(2, biblioteca.getLivros().size());
    }

    @Test
    void testTrazPrimeiroLivroDaLista() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Prozac Nation", "123");
        Livro livro2 = new Livro("Zonas Úmidas", "321");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        List<Livro> todosLivros = biblioteca.getLivros();
        assertEquals(livro1.getIsbn(), todosLivros.get(0).getIsbn());;
    }

    @Test
    void testLivrosSaoDiferentes() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Garota Interrompida", "456");
        Livro livro2 = new Livro("Coração de Tinta", "654");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        List<Livro> todosLivros = biblioteca.getLivros();
        assertNotEquals(todosLivros.get(0).getTitulo(), todosLivros.get(1).getTitulo());
    }
}
