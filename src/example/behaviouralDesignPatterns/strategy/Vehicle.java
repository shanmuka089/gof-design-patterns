package example.behaviouralDesignPatterns.strategy;

public abstract class Vehicle
{
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }

    abstract void speed();
}
