import java.util.Scanner;

public class ConsultaSaldo extends Operacao {

    public ConsultaSaldo(int numeroConta, BaseDeDados baseDados) {
        super(numeroConta, baseDados);
    }

    @Override
    public void executar() {
        System.out.println("\nSaldo: R$" + baseDados.saldoConta(numeroConta));
    }
}
