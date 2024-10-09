package example.structuralDesignPatterns.adapter;

public class ConcreteAdapter implements Adapter
{
    private LegacyWeigher legacyWeigher;
    public ConcreteAdapter() {
         this.legacyWeigher = new ConcreteLegacyWeigher();
    }
    @Override
    public double weightInKgs()
    {
        int weightPounds = legacyWeigher.getWeighInPounds();
        System.out.println("Weight in pounds: "+weightPounds );
        return weightPounds * 0.45;
    }

}
