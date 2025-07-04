package SistemaLogin;

public class LoginFacade {
    public boolean eseguiLogin(String tipo, String user, String credential) {
        AuthStrategy strategia = AuthFactory.createAuth(tipo);
        return strategia.login(user, credential);
    }
}
