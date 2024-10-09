package example.structuralDesignPatterns.bridge;

public class Fish implements LivingThings
{

    BreathingProcessImplementor breathingProcessImplementor;
    public Fish(BreathingProcessImplementor breathingProcessImplementor) {
        this.breathingProcessImplementor = breathingProcessImplementor;
    }
    @Override
    public void breatheProcess()
    {
        breathingProcessImplementor.breathe();
    }

}
