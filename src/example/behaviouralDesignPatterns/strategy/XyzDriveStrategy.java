package example.behaviouralDesignPatterns.strategy;

public class XyzDriveStrategy implements DriveStrategy
{

    @Override
    public void drive()
    {
        System.out.println("new drive strategy!...");
    }

}
