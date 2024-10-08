package example.behaviouralDesignPatterns.memento;

public class MainApp
{

    public static void main(String[] args)
    {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator(5, 2);
        ConfigurationMemento configurationMemento = originator.createMemento();
        careTaker.addMemento(configurationMemento);
        originator.setHeight(9);
        originator.setWidth(6);
        ConfigurationMemento configurationMemento2 = originator.createMemento();
        careTaker.addMemento(configurationMemento2);
        originator.setHeight(16);
        originator.setWidth(12);
        System.out.println("Before restore height: "+originator.getHeight()+ ", width: "+ originator.getWidth());
        ConfigurationMemento configurationMemento3 = careTaker.undo();
        originator.restoreMemento(configurationMemento3);
        System.out.println("After restore height: "+originator.getHeight()+ ", width: "+ originator.getWidth());
    }

}
