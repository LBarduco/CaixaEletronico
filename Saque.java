import java.util.Scanner;

public class Saque extends Operacao {

    public Saque(int numeroConta, BaseDeDados baseDados) {
        super(numeroConta, baseDados);
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDepósito:\n" +
                "Digite a quantia a ser sacada.");
        double valor = scanner.nextDouble();

        if (valor > 0 && baseDados.saldoConta(numeroConta) >= valor) {
            baseDados.debitarConta(numeroConta, valor);
        }
    }
}
