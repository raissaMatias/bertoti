package org.biblioteca;

import java.util.List;
import java.util.LinkedList;

// definição da classe da biblioteca
public class Biblioteca {
    // atributo da classe
    private List<Livro> livros = new LinkedList<Livro>();

    // métodos para acessar o atributo da classe por fora da classe
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }
    //
    public List<Livro> getLivros() {
        return this.livros;
    }
}
