public abstract class Operacao {
    int numeroConta;
    protected BaseDeDados baseDados;

    public Operacao(int numeroConta, BaseDeDados baseDados) {
        this.numeroConta = numeroConta;
        this.baseDados = baseDados;
    }

    public abstract void executar();
}
