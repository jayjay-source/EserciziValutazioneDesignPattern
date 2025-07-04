package SistemaLogin;

public class TokenAuth implements AuthStrategy {
    @Override
    public boolean login(String user, String token) {
        return "user".equals(user) && "TOKEN".equals(token);
    }
}
