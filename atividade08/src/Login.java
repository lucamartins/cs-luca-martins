import java.util.Objects;

public class Login {
    private final String usuario = "luca";
    private final String senha = "luca@123";

    boolean fazer_login(String usuario, String senha) throws LoginInvalidoException {
        boolean isValidCredentials = Objects.equals(usuario, this.usuario) && Objects.equals(senha, this.senha);

        if (!isValidCredentials) {
            throw new LoginInvalidoException();
        }

        return true;
    }
}
