package example.behaviouralDesignPatterns.command;

public class AirConditioner
{
    private boolean acOn;
    private int temperature;
    public void turnOnAc() {
        this.acOn = true;
        System.out.println("AirConditioner ON: "+this.acOn);
    }
    public void turnOffAc()
    {
        this.acOn = false;
        System.out.println("AirConditioner ON: "+this.acOn);
    }
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("Room Temperature: "+this.temperature);
    }
}
