import java.util.ArrayList;
import java.util.List;

public class BaseDeDados {
    private final List<Conta> contas;

    public BaseDeDados() {
        contas = new ArrayList<>();
        contas.add(new Conta(1, "Ana", "1234"));
        contas.add(new Conta(2, "João", "senha"));
        contas.add(new Conta(3, "Lucas", "123456"));
    }

    public boolean consultarConta(int numero) {
        return buscarConta(numero) != null;
    }

    public boolean autenticarConta(int numero, String senha) {
        Conta conta = buscarConta(numero);
        return conta != null && conta.autenticar(senha);
    }

    public String clienteConta(int numero) {
        Conta conta = buscarConta(numero);

        if (conta == null) {
            return null;
        }

        return conta.getCliente();
    }

    public void debitarConta(int numero, double valor) {
        Conta conta = buscarConta(numero);

        if (conta != null) {
            conta.debitar(valor);
        }
    }

    public void creditarConta(int numero, double valor) {
        Conta conta = buscarConta(numero);

        if (conta != null) {
            conta.creditar(valor);
        }
    }

    public double saldoConta(int numero) {
        Conta conta = buscarConta(numero);

        if (conta != null) {
            return conta.getSaldo();
        }

        return 0;
    }

    public boolean alterarSenhaConta(int numero, String senhaAtual, String senhaNova) {
        Conta conta = buscarConta(numero);

        if (conta != null) {
            return conta.alterarSenha(senhaAtual, senhaNova);
        }

        return false;
    }

    private Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }

        return null;
    }
}
