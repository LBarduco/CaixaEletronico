public class Conta {
    private int numero;
    private String cliente;
    private String senha;
    private double saldo;

    public Conta(int numero, String cliente, String senha) {
        this.numero = numero;
        this.cliente = cliente;
        this.senha = senha;
        saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public boolean alterarSenha(String senhaAtual, String senhaNova) {
        if (autenticar(senhaAtual) && !senha.equals(senhaNova)) {
            senha = senhaNova;
            return true;
        }

        return false;
    }
}
