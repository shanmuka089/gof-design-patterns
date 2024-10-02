package example.abstractFactory;

public class GasolineCar implements Vehicle
{

    @Override
    public void moveVehicle()
    {
        System.out.println("Gasoline car is moving!...");
    }

}
