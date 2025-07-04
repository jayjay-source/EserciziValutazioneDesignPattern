import java.util.ArrayList;
import java.util.List;

public class AppleSensor implements AppleDevice{

    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (Observer o : observers) {
            o.update("AppleSensor: " + message);
        }
    }

    @Override
    public void changeState(String newState) {
        this.state = newState;
        System.out.println("Sensore apple: lo stato è cambiato a " + newState);
        notifyObserver(newState);
    }   

}
