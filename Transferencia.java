import java.util.Scanner;

public class Transferencia extends Operacao {

    public Transferencia(int numeroConta, BaseDeDados baseDados) {
        super(numeroConta, baseDados);
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDepósito:\n" +
                "Digite o número da conta de destino.");
        int contaDestino = scanner.nextInt();

        System.out.println("\nDigite a quantia a ser transferida.");
        double valor = scanner.nextDouble();

        if (valor > 0 && baseDados.saldoConta(numeroConta) >= valor && baseDados.consultarConta(contaDestino)) {
            baseDados.debitarConta(numeroConta, valor);
            baseDados.creditarConta(contaDestino, valor);
        }
    }
}
