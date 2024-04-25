import java.util.InputMismatchException;
import java.util.Scanner;

public class TestarContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        while (true) {
            try {
                System.out.println();
                System.out.println("Digite a operação que deseja realizar");
                System.out.println("  1, para depositar");
                System.out.println("  2, para sacar");
                System.out.println("  0, para SAIR");
                System.out.print("Operação: ");

                int operation = scanner.nextInt();

                if (operation == 0) {
                    break;
                }

                System.out.print("Digite o valor: ");
                double valor = scanner.nextDouble();

                switch (operation) {
                    case 1:
                        contaBancaria.depositar(valor);
                        System.out.println("Depósito realizado com sucesso! Novo saldo: " + contaBancaria.getSaldo());
                        break;
                    case 2:
                        contaBancaria.sacar(valor);
                        System.out.println("Saque realizado com sucesso! Novo saldo: " + contaBancaria.getSaldo());
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada de dados incorreta.");
                return;
            } catch (SaldoInsuficienteException e) {
                System.out.println("Saldo insuficiente para realizar saque.");
            }
        }
    }
}
