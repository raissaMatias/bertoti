package org.example;

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