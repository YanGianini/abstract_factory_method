public class Conta {
    private Extrato extrato;
    private Fatura fatura;

    public Conta(AbstractFactory fabrica) {
        this.extrato = fabrica.createExtrato();
        this.fatura = fabrica.createFatura();
    }

    public String gerarExtrato() {
        return this.extrato.gerar();
    }

    public String gerarFatura() {
        return this.fatura.gerar();
    }
}
