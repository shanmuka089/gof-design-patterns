package example.structuralDesignPatterns.bridge;

public class TreeBreathingProcessImplementor implements BreathingProcessImplementor
{

    @Override
    public void breathe()
    {
        System.out.println("breathe through leaves");
        System.out.println("inhale carbon diaoxide");
        System.out.println("exhale oxygen");
    }

}
