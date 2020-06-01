package pattern.observer;


public interface Subject {
    /**
     * @param observer
     */
    public void registerObserver(Observer observer);

    public void removeObserver(Observer observer);
    public void notifyObservers();
}
