package example.creationalDesignPatterns.prototype;

public class MainApp
{

    public static void main(String[] args)
    {
        Student student = new Student(20, "Shanu", 24);
        Student clonedStudent = (Student) student.clone();
        System.out.println(student);
        System.out.println(clonedStudent);
    }
}
