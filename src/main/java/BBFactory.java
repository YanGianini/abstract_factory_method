public class BBFactory implements AbstractFactory{
    @Override
    public Extrato createExtrato(){
        return new ExtratoBB();
    }
    @Override
    public Fatura createFatura(){
        return new FaturaBB();
    }
}
