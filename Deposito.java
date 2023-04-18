import java.util.Scanner;

public class Deposito extends Operacao {

    public Deposito(int numeroConta, BaseDeDados baseDados) {
        super(numeroConta, baseDados);
    }

    @Override
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nDepósito:\n" +
                "Digite a quantia a ser depositada.");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            baseDados.creditarConta(numeroConta, valor);
        }
    }
}
