import java.text.DecimalFormat;
import java.util.Scanner;

public class Deposito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        while (scanner.hasNextDouble()) {
            double valor = scanner.nextDouble();

            if (valor > 0) {
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("Saldo atual: R$ " + df.format(valor));
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Valor invalido! Digite um valor maior que zero.");
            }
        }

        scanner.close();
    }
}
