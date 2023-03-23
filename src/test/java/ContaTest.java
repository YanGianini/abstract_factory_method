import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTest {
    @Test
    void deveGerarBoletoItau() {
        AbstractFactory fabrica = new ItauFactory();
        Conta conta = new Conta(fabrica);
        assertEquals("Fatura Itau", conta.gerarFatura());
    }

    @Test
    void deveGerarExtratoItau() {
        AbstractFactory fabrica = new ItauFactory();
        Conta conta = new Conta(fabrica);
        assertEquals("Extrato Itau", conta.gerarExtrato());
    }

    @Test
    void deveGerarBoletoBB() {
        AbstractFactory fabrica = new BBFactory();
        Conta conta = new Conta(fabrica);
        assertEquals("Fatura BB", conta.gerarFatura());
    }

    @Test
    void deveGerarExtratoBB() {
        AbstractFactory fabrica = new BBFactory();
        Conta conta = new Conta(fabrica);
        assertEquals("Extrato BB", conta.gerarExtrato());
    }
}
