package example.creationalDesignPatterns.abstractFactory;

public class VehicleFactory
{
    public static AbstractVehicleFactory getVehicleFactory(String name) {
        switch(name) {
            case "HYDROGEN":
                return new HydrogenVehicleFactory();
            case "ELECTRIC":
                return new ElectricVehicleFactory();
            case "GASOLINE":
                return new GasolineVehicleFactory();
            default:
                return null;
        }
    }
}
