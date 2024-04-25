import java.util.*;

public class InserirValoresVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int currentIndex = 0;

        while (true) {
            System.out.println("Digite um valor inteiro para adicionar no vetor: ");

            try {
                int novoValor = scanner.nextInt();
                vetor[currentIndex] = novoValor;
                currentIndex++;

                if (novoValor == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Valor invalido. Garanta que seja um número inteiro!");
                return;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Tamanho máximo do vetor já alcançado. Houve um erro ao tentar adicionar novo " +
                    "valor!");
                return;
            }
        }

        System.out.println("Loop encerrado. Valores: " + Arrays.toString(vetor));
    }
}
