public class ItauFactory implements AbstractFactory{
    @Override
    public Extrato createExtrato() {
        return new ExtratoItau();
    }
    @Override
    public Fatura createFatura() {
        return new FaturaItau();
    }
}
