package example.creationalDesignPatterns.abstractFactory;

public class GasolineVehicleFactory implements AbstractVehicleFactory
{

    @Override
    public Vehicle getVehicle(String name)
    {
        switch(name) {
            case "BIKE":
                return new GsolineBike();
            case "CAR":
                return new GasolineCar();
            default:
                return null;
        }
    }

}
