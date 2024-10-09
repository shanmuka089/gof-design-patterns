package example.structuralDesignPatterns.bridge;

public class Tree implements LivingThings
{
    BreathingProcessImplementor breathingProcessImplementor;
    public Tree(BreathingProcessImplementor breathingProcessImplementor) {
        this.breathingProcessImplementor = breathingProcessImplementor;
    }
    @Override
    public void breatheProcess()
    {
        breathingProcessImplementor.breathe();
    }
}
