package example.behaviouralDesignPatterns.observer;

public interface WsSubject
{
    void add(Observer observer);
    void remove(Observer observer);
    void notifyObservers();
    void setData(int temp);
    int getData();
}
