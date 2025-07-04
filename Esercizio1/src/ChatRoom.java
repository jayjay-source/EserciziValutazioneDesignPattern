import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(sender.getName() + ": " + message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendPrivateMessage(String message, User sender, String receiverName) {
        for (User user : users) {
            if (user.name.equalsIgnoreCase(receiverName)) {
                user.receive("(Privato da " + sender.name + "): " + message);
                return;
            }
        }
        sender.receive("Utente '" + receiverName + "' non trovato.");
    }
}
