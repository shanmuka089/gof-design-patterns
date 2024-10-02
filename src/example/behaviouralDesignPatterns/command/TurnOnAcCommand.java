package example.behaviouralDesignPatterns.command;

public class TurnOnAcCommand implements IcCommand
{

    private AirConditioner airConditioner;
    public TurnOnAcCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute()
    {
        airConditioner.turnOnAc();;
    }

    @Override
    public void undo()
    {
        airConditioner.turnOffAc();
    }

}
