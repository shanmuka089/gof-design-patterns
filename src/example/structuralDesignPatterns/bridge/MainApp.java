package example.structuralDesignPatterns.bridge;

public class MainApp
{
    public static void main(String[] args)
    {
        LivingThings livingThings = new Fish(new WaterBreathingProcessImplementor());
        livingThings.breatheProcess();
    }
}
