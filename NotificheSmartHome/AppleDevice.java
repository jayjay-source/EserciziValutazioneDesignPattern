public interface AppleDevice {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver(String message);
    void changeState(String newState);
}
