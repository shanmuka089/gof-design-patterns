package example.behaviouralDesignPatterns.strategy;

public class SportsVehicle extends Vehicle
{

    public SportsVehicle(DriveStrategy driveStrategy)
    {
        super(driveStrategy);
    }

    @Override
    void speed()
    {
        System.out.println("300Kmph");
    }

}
