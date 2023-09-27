import java.text.DecimalFormat;
import java.util.Scanner;

public class Deposito {    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        while (true) {
            // Solicita ao usuário que insira o valor do depósito
            System.out.print("Digite o valor do depósito (ou 0 para encerrar): ");
            double valor = scanner.nextDouble();

            if (valor > 0) {
                System.out.println("Depósito realizado com sucesso!");
                System.out.println("Saldo atual: R$ " + df.format(valor));
            } else if (valor == 0) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Valor inválido! Digite um valor maior que zero.");
            }
        }

        scanner.close();
    }
}

