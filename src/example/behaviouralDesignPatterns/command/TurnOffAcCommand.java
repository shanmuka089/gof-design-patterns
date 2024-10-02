package example.behaviouralDesignPatterns.command;

public class TurnOffAcCommand implements IcCommand
{

    private AirConditioner airConditioner;
    public TurnOffAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute()
    {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo()
    {
        airConditioner.turnOnAc();
    }

}
