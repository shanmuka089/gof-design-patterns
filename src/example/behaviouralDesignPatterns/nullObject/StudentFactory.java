package example.behaviouralDesignPatterns.nullObject;

public class StudentFactory
{
    public Student getStudent(String domain) {

        if("Engineering".equals(domain))
        {
            return new StudentObject(2, "Shanu");
        }
        return new NullObject();
    }
}
