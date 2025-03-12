# bertoti
17/02/2025

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

ATIVIDADE 21/02 

CÓDIGO JAVA COM TDD 

1. Código Main (menu do caixa)

```java
   import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControleDeCaixa controle = new ControleDeCaixa();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1 - Entrada de caixa");
            System.out.println("2 - Saída de caixa");
            System.out.println("3 - Exibir saldo");
            System.out.println("4 - Sair");
            System.out.print("Digite a opção desejada: ");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor a ser adicionado ao caixa: ");
                    int entrada = scanner.nextInt();
                    controle.aumentarSaldo(entrada);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser retirado do caixa: ");
                    int saida = scanner.nextInt();
                    controle.saidaSaldo(saida);
                    break;
                case 3:
                    controle.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Saindo do programa!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
```

2. Código Controle de Caixa

   ```java
   import java.util.ArrayList;
   import java.util.List;

   public class ControleDeCaixa {
    private double saldo;
    private List<String> registro;

    public ControleDeCaixa() {
        this.saldo = 0.0;
        this.registro = new ArrayList<>();
    }

    public void aumentarSaldo(double valor) {
        this.saldo += valor;
        this.registro.add("{tipo: 'entrada', valor: " + valor + "}");
    }

    public boolean saidaSaldo(double valor) {
        if (this.saldo < valor) {
            System.out.println("Não é possível retirar " + valor + ", pois o saldo é de: " + this.saldo);
            return false;
        } else {
            this.saldo -= valor;
            this.registro.add("{tipo: 'saida', valor: " + valor + "}");
            return true;
        }
    }

    public double exibirSaldo() {
        System.out.printf("Saldo atual: R$%.2f%n", this.saldo);
        return this.saldo;
    }

    public double fecharCaixa() {
        System.out.println("Fechando caixa!");
        return this.saldo;
    }

    public static void main(String[] args) {
        ControleDeCaixa caixa = new ControleDeCaixa(); //metodo main q cria uma instancia de ControleDeCaixa 
        
        caixa.aumentarSaldo(500.0);
        caixa.exibirSaldo();
        
        caixa.saidaSaldo(200.0);
        caixa.exibirSaldo();
        
        caixa.saidaSaldo(400.0);
        caixa.exibirSaldo();
        
        caixa.fecharCaixa();
    }
}
```

3. Teste TDD

   ```java
   import org.junit.jupiter.api.Test;
   import static org.junit.jupiter.api.Assertions.*;

   class ControleDeCaixaTest {

    @Test
    void testeSaldoInicial() {
        ControleDeCaixa caixaTeste = new ControleDeCaixa();
        assertEquals(0.0, caixaTeste.getSaldo(), "O saldo inicial deve ser 0.0");
    }

    @Test
    void testeAumentoSaldo() {
        ControleDeCaixa caixaTeste = new ControleDeCaixa();
        caixaTeste.aumentarSaldo(100.0);
        caixaTeste.aumentarSaldo(50.0);
        assertEquals(150.0, caixaTeste.getSaldo(), "O saldo deve ser 150.0 após os depósitos");
    }

    @Test
    void testeSaidaSaldo() {
        ControleDeCaixa caixaTeste = new ControleDeCaixa();
        caixaTeste.aumentarSaldo(100.0);

        boolean primeiraSaida = caixaTeste.saidaSaldo(50.0); // Deve ser true
        boolean segundaSaida = caixaTeste.saidaSaldo(60.0); // Deve ser false (saldo insuficiente)

        assertTrue(primeiraSaida, "A primeira retirada de 50.0 deve ser bem-sucedida");
        assertFalse(segundaSaida, "A segunda retirada de 60.0 deve falhar devido ao saldo insuficiente");
        assertEquals(50.0, caixaTeste.getSaldo(), "O saldo final deve ser 50.0 após a retirada válida");
    }
}

```

4. CLASSE UML: A UML possui diversos diagramas que servem para representar artefatos de sistemas orientados a objetos.

o sinal de + representa um atributo, que por sua vez armazena um estado de objeto e define as informções que o objeto mantém.

o sinal de - representa um método, que são funções ou procedimento que definem seu comportamento

![image](https://github.com/user-attachments/assets/8153a18d-e7ea-4ba5-aae7-bd677d171674)

código ControleDeCaixa
![cod1](https://github.com/user-attachments/assets/06e9d60e-e2f9-43bb-b260-11ffe7ea39b9)


