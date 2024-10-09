package example.structuralDesignPatterns.bridge;

public class LandBreathingProcessImplementor implements BreathingProcessImplementor
{
    @Override
    public void breathe()
    {
        System.out.println("breathe through nose");
        System.out.println("inhale oxygen");
        System.out.println("exhale carbon dioxide");
    }

}
