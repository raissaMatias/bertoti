package org.example;

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