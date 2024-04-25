public class LoginInvalidoException extends Exception {
    public LoginInvalidoException() {
        super("Acesso não autorizado: credenciais de acesso incorretas.");
    }
}
