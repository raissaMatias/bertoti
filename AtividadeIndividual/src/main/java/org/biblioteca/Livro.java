package org.biblioteca;

public class Livro {
    private String titulo;
    private String isbn;

    //faz mais sentido armazenar como texto, pois pode iniciar com zero ou
    //conter hifens na sequencia

    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    @Override
    public String toString() {
        return titulo + " - " + isbn;
    }
}