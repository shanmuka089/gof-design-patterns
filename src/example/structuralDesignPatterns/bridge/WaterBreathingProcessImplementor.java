package example.structuralDesignPatterns.bridge;

public class WaterBreathingProcessImplementor implements BreathingProcessImplementor
{
    @Override
    public void breathe()
    {
        System.out.println("breathe through crux");
        System.out.println("inhale oxygen");
        System.out.println("exhale carbon dioxide");
    }
}
