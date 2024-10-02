package example.creationalDesignPatterns.abstractFactory;

public class ElectricBike implements Vehicle
{

    @Override
    public void moveVehicle()
    {
        System.out.println("Electric Bike is moving");
    }

}
