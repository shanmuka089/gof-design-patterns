package example.structuralDesignPatterns.bridge;

public class Human implements LivingThings
{
    BreathingProcessImplementor breathingProcessImplementor;
    public Human(BreathingProcessImplementor breathingProcessImplementor) {
        this.breathingProcessImplementor = breathingProcessImplementor;
    }
    @Override
    public void breatheProcess()
    {
        breathingProcessImplementor.breathe();
    }
}
