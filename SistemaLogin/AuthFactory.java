package SistemaLogin;

public class AuthFactory {
    public static AuthStrategy createAuth(String tipo){
        return switch (tipo.toLowerCase()) {
            case "password" -> new PasswordAuth();
            case "token" -> new TokenAuth();
            case "social" -> new SocialAuth();
            default -> throw new IllegalArgumentException("Tipo di login non supportato");
        };
    }
}
