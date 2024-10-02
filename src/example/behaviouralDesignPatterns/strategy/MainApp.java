package example.behaviouralDesignPatterns.strategy;

public class MainApp
{

    public static void main(String[] args)
    {
        Vehicle vehicle = new SportsVehicle(new SpecialDriveStrategy());
        vehicle.drive();
        vehicle.speed();

        Vehicle vehicle2 = new PassengersVehicle(new NormalDriveStrategy());
        vehicle2.drive();
        vehicle2.speed();
    }
}
