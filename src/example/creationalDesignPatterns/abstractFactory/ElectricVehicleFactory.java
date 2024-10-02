package example.abstractFactory;

public class ElectricVehicleFactory implements AbstractVehicleFactory
{


    @Override
    public Vehicle getVehicle(String name)
    {
        switch(name) {
            case "BIKE":
                return new ElectricBike();
            case "CAR":
                return new ElectricCar();
            default:
                return null;
        }
    }

}
