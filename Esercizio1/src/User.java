public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void receive(String message);
    public abstract void send(String message);
    public String getName() {
        return name;
    }

    public void sendPrivate(String s, String luca) {
    }
}
