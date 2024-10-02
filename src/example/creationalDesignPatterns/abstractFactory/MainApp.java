package example.abstractFactory;

public class MainApp
{

    public static void main(String[] args)
    {
         var vehicleFactory = VehicleFactory.getVehicleFactory("ELECTRIC");
         var vehicle = vehicleFactory.getVehicle("CAR");
         vehicle.moveVehicle();
    }
}
