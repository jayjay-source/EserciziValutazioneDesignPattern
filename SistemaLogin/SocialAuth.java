package SistemaLogin;

public class SocialAuth implements AuthStrategy{
    @Override
    public boolean login(String user, String socialAccount) {
        return "user".equals(user) && "social_user@gmail.com".equals(socialAccount);
    }
}
