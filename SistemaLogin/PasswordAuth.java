package SistemaLogin;

public class PasswordAuth implements AuthStrategy{
    @Override
    public boolean login(String user, String password) {
        // Restituisce true solo se l'utente e la password corrispondono ai parametri("user", "1234")

        return "user".equals(user) && "password".equals(password);
    }
}
