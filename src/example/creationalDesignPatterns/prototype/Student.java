package example.creationalDesignPatterns.prototype;

public class Student implements Prototype
{
    private int id;
    private String name;
    private int age;
    public Student(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Student() {}
    @Override
    public Prototype clone()
    {
        return  new Student(this.id, this.name, this.age);
    }

}
