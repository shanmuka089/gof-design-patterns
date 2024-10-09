package example.structuralDesignPatterns.adapter;

public class MainApp
{
    public static void main(String[] args)
    {
        Adapter adapter = new ConcreteAdapter();
        double weight = adapter.weightInKgs();
        System.out.println("Weight in kgs: " + weight);
    }

}
