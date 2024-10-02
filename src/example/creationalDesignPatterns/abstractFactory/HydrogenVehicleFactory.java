package example.abstractFactory;

public class HydrogenVehicleFactory implements AbstractVehicleFactory
{

    @Override
    public Vehicle getVehicle(String name)
    {

        switch(name) {
            case "CAR":
                return new HydrogenCar();
            default:
                return null;
        }
    }

}
