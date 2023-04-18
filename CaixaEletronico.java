import java.util.Scanner;

public class CaixaEletronico {
    private int numeroContaUsuario;
    private boolean usuarioAutenticado;
    private final BaseDeDados baseDados;

    public CaixaEletronico() {
        usuarioAutenticado = false;
        baseDados = new BaseDeDados();
    }

    public void executar() {
        while (!usuarioAutenticado) {
            telaAutenticacao();
        }

        System.out.println("Bem vindo, " + baseDados.clienteConta(numeroContaUsuario));
        telaOperacoes();
    }

    public void telaAutenticacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta.");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite a senha.");
        String senha = scanner.next();

        if (baseDados.autenticarConta(numeroConta, senha)) {
            usuarioAutenticado = true;
            numeroContaUsuario = numeroConta;
        }
    }

    public void telaOperacoes() {
        int numeroOperacao;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha uma operação:\n" +
                    "\t1 - Depósito\n" +
                    "\t2 - Saque\n" +
                    "\t3 - Transferência\n" +
                    "\t4 - Consultar Saldo\n" +
                    "\t5 - Alterar Senha\n" +
                    "\t0 - Sair\n");
            numeroOperacao = scanner.nextInt();
            Operacao operacao;

            switch (numeroOperacao) {
                case 1 -> {
                    operacao = new Deposito(numeroContaUsuario, baseDados);
                    operacao.executar();
                }
                case 2 -> {
                    operacao = new Saque(numeroContaUsuario, baseDados);
                    operacao.executar();
                }
                case 3 -> {
                    operacao = new Transferencia(numeroContaUsuario, baseDados);
                    operacao.executar();
                }
                case 4 -> {
                    operacao = new ConsultaSaldo(numeroContaUsuario, baseDados);
                    operacao.executar();
                }
                case 5 -> {
                    operacao = new AlteraSenha(numeroContaUsuario, baseDados);
                    operacao.executar();
                }
            }
        } while (numeroOperacao != 0);
    }
}
