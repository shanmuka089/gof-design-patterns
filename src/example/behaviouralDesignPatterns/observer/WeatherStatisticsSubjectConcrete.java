package example.behaviouralDesignPatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStatisticsSubjectConcrete implements WsSubject
{
    List<Observer> observers = new ArrayList<>();
    int data;
    @Override
    public void add(Observer observer) {
        this.observers.add(observer);
    }
    @Override
    public void remove(Observer observer) {
        this.observers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for(Observer obs : observers) {
            obs.update();
        }
    }
    @Override
    public void setData(int temp) {
        this.data = temp;
        notifyObservers();
    }
    @Override
    public int getData() {
        return this.data;
    }
}
