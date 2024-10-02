package example.behaviouralDesignPatterns.nullObject;

public class NullObject extends Student
{

    @Override
    public int getId()
    {
        return 0;
    }

    @Override
    public String getName()
    {

        return null;
    }

}
