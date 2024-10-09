package example.structuralDesignPatterns.adapter;

public class ConcreteLegacyWeigher implements LegacyWeigher
{

    @Override
    public int getWeighInPounds()
    {
        return 100;
    }

}
