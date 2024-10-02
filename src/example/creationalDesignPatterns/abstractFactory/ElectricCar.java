package example.abstractFactory;

public class ElectricCar implements Vehicle
{

    @Override
    public void moveVehicle()
    {
        System.out.println("Electric car is moving silently!...");
    }

}
