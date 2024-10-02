package example.behaviouralDesignPatterns.strategy;

public class PassengersVehicle extends Vehicle
{

    public PassengersVehicle(DriveStrategy driveStrategy)
    {
        super(driveStrategy);
    }

    @Override
    void speed()
    {
        System.out.println("80Kmph");
    }

}
