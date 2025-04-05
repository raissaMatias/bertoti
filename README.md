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

# Projeto Java com JUnit testes

```java
// importação das bibliotecas utilizadas 
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
// definição da classe do livro
public class Livro {
    // atributos da classe
    private String titulo;
    private String isbn;

    // construtor da classe
    public Livro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
    }

    // métodos para acessar o atributo da classe por fora da classe
    public String getTitulo() {
        return this.titulo;
    }

    // método usado para obter ou retornar um ISBN, q é um identificador único para livros
    public String getIsbn() {
        return this.isbn;
    }
}
// import das classes utilitárias
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

// definição da classe teste
class BibliotecaTeste {
    // decorator do teste
    @Test
    void testAdicionarDoisLivros() {
        // instancia uma biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // instancia livros
        Livro livro1 = new Livro("O profeta", "1234567890");
        Livro livro2 = new Livro("Cartas a um jovem poeta", "0987654321");

        // adiciona os livros na biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // verifica se a biblioteca tem os dois livros cadastrados
        assertEquals(biblioteca.getLivros().size(), 2);
    }

    @Test
    void testTrazPrimeiroLivroDaLista() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Prozac Nation", "123");
        Livro livro2 = new Livro("Zonas Úmidas", "321");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        // associa todos os livros da biblioteca em uma variável
        List<Livro> todosLivros = biblioteca.getLivros();

        // verifica se o primeiro livro é o primeiro livro cadastrado
        assertEquals(todosLivros.get(0).getIsbn(), livro1.getIsbn());
    }

    @Test
    void testLivrosSaoDiferentes() {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("Garota Interrompida", "456");
        Livro livro2 = new Livro("Coração de Tinta", "654");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        List<Livro> todosLivros = biblioteca.getLivros();
        // verifica se os dois livros são diferentes
        assertNotEquals(todosLivros.get(0).getTitulo(), todosLivros.get(1).getTitulo());
    }
}
```

# Atividade 4 - CLASSE UML 
A UML possui diversos diagramas que servem para representar artefatos de sistemas orientados a objetos.

o sinal de + representa um atributo, que por sua vez armazena um estado de objeto e define as informções que o objeto mantém.

o sinal de - representa um método, que são funções ou procedimento que definem seu comportamento

