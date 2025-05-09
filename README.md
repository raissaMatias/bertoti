# 17/02/2025

Resumo dos trechos do livro: Software Engineering at Google, Oreilly

1) Os engenheiros de software são profissionais que criam aplicações que serão usadas no cotidiano usando conhecimentos teóricos, assim como engenheiros de outros setores. Tais aplicações são "menos tangíveis", porém não menos intergradas ao nosso cotidiano. 

2) O que difere a engenharia de software de outras engenharias é a suas aplicações serem menos tangíveis. Um programador e um engenheiro de software possuem ênfases diferentes em suas atuações. A segunda profissão requer conhecimento teórico prévio necessário em relação a primeira. Um programador geralmente limita-se ao conhecimento de uma deterninada linguagem. A relação entre tempo, escala e tradeoffs (escolha entre duas ou mais opções, onde cada uma tem vantagens e desvantagens).

Exemplos de tradeoffs: 

1) em relação a linguagem de programação:

Python vs. Java
Python
✅ Sintaxe simples e produtividade alta.
❌ Menor desempenho para aplicações críticas de CPU.

Java
✅ Melhor desempenho e robustez em aplicações empresariais.
❌ Mais verboso e curva de aprendizado maior.

2) em relação a banco de dados:

SQL (ex: PostgreSQL, MySQL)
✅ Suporte a transações ACID e ideal para dados estruturados.
❌ Escalabilidade horizontal pode ser mais complexa.

NoSQL (ex: MongoDB, Cassandra)
✅ Melhor para dados não estruturados e escalabilidade horizontal.
❌ Não possui suporte completo a transações como um banco relacional.

3) em relção a arquitetura de software: 

Monólito vs. Microsserviços
Monólito
✅ Mais fácil de desenvolver, testar e implantar no início.
❌ Dificuldade de escalar componentes independentemente e maior acoplamento.

Microsserviços
✅ Escalabilidade independente e maior flexibilidade tecnológica.
❌ Complexidade na comunicação entre serviços e necessidade de gerenciar deploys distribuídos.
////////////////////////////////////////////////////////////////////////////////////////////////


# ATIVIDADE 21/02 

# atividade individual 1 ao 6 (pasta AtividadeIndividual)

# Atividade 4 - CLASSE UML 
Biblioteca possui uma relação com Livros pois possui uma lista de livros List<Livro>, um caso de associação fraca pois livros pode existir sem a bibliteca.

![image](https://github.com/user-attachments/assets/aaf72f27-7c9e-4e4e-b384-294053dfe15d)

# Biblioteca.java

```
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
```
# Livro.java

```
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
```
# Biblioteca.java

```
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
```
