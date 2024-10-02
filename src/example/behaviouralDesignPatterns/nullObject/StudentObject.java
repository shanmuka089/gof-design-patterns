package example.behaviouralDesignPatterns.nullObject;

public class StudentObject extends Student
{

    private int id;
    private String name;

    public int getId()
    {

        return this.id;
    }

    public String getName()
    {

        return this.name;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public StudentObject(int id, String name)
    {

        this.id = id;
        this.name = name;
    }
}
