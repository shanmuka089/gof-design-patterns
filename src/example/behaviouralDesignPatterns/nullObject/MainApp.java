package example.behaviouralDesignPatterns.nullObject;

public class MainApp
{

    public static void main(String[] args)
    {
        StudentFactory studentFactory = new StudentFactory();
        Student student= studentFactory.getStudent("Engineering");
        Printer.printStudent(student);
        Student student2 = studentFactory.getStudent("Medical");
        Printer.printStudent(student2);
    }
}
