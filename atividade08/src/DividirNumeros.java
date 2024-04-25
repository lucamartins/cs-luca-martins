import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo: ");
            double dividendo = scanner.nextDouble();

            System.out.print("Digite o divisor: ");
            double divisor = scanner.nextDouble();

            if (divisor == 0) {
                // É necessário dar THROW nessa exceção já que a divisão por 0 no Java retorna Infinity
                throw new ArithmeticException();
            }

            double resultadoDivisao = dividendo / divisor;

            System.out.println("O resultado da divisão é: " + resultadoDivisao);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Garanta que os valores informados sejam números.");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Garanta a consistência da divisão. Verifique se os valores informados permite uma divisão.");
        }
    }
}
