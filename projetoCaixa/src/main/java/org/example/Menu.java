package org.example;

import java.util.Scanner;

public class Menu {
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