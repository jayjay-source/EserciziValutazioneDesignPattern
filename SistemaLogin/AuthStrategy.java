package SistemaLogin;

public interface AuthStrategy {
    boolean login(String user, String credential);
}
