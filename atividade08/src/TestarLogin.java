import java.util.Scanner;

public class TestarLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite o senha: ");
        String senha = scanner.nextLine();

        try {
            Login loginController = new Login();

            loginController.fazer_login(usuario, senha);

            System.out.println("Login realizado com sucesso.");
        } catch (LoginInvalidoException e) {
            System.out.println("Credenciais de acesso incorretas.");
        }
    }
}
