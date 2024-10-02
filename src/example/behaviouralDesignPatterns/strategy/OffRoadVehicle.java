package example.behaviouralDesignPatterns.strategy;

public class OffRoadVehicle extends Vehicle
{

    public OffRoadVehicle(DriveStrategy driveStrategy)
    {
        super(driveStrategy);
    }

    @Override
    void speed()
    {
        System.out.println("200Kmph");
    }

}
