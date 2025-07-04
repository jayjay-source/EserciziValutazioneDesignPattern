public class UserConcreto extends User {
    public UserConcreto(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " ha ricevuto: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " invia: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void sendPrivate(String message, String receiverName) {
        System.out.println(name + " invia (privato a " + receiverName + "): " + message);
        mediator.sendPrivateMessage(message, this, receiverName);
    }
}
