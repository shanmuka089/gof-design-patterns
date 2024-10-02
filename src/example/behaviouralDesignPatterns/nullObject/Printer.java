package example.behaviouralDesignPatterns.nullObject;

public class Printer
{
    public static void printStudent(Student student) {
        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}
