import java.util.Scanner;

public class AlteraSenha extends Operacao {

    public AlteraSenha(int numeroConta, BaseDeDados baseDados) {
        super(numeroConta, baseDados);
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDepósito:\n" +
                "Digite a senha atual.");
        String senhaAtual = scanner.next();

        System.out.println("\nDepósito:\n" +
                "Digite a senha nova.");
        String senhaNova = scanner.next();

        baseDados.alterarSenhaConta(numeroConta, senhaAtual, senhaNova);
    }
}
