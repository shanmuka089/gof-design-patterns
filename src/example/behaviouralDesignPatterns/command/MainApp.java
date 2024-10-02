package example.behaviouralDesignPatterns.command;

public class MainApp
{

    public static void main(String[] args)
    {
        AirConditioner airConditioner = new AirConditioner();

        IcCommand onCommand = new TurnOnAcCommand(airConditioner);

        IcCommand offCommand = new TurnOffAcCommand(airConditioner);

        Invoker invoker = new Invoker(onCommand);

        invoker.pressButton();
        invoker.redo();
        invoker.undo();

        Invoker invoker2 = new Invoker(onCommand);
        invoker2.pressButton();
        invoker2.undo();
    }
}
