package example.behaviouralDesignPatterns.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker
{
    List<ConfigurationMemento> mementos;
    public CareTaker() {
        mementos = new ArrayList<>();
    }
    public void addMemento(ConfigurationMemento configurationMemento) {
        mementos.add(configurationMemento);
    }
    public ConfigurationMemento undo() {
        if(mementos.size() != 0) {
            int x = mementos.size()-1;
            return mementos.remove(x);
        }
        return null;
    }
}
