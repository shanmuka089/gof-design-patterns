package example.creationalDesignPatterns.builder;

public class Student
{
    private int roll_number;
    private String name;
    private String father_name;
    private String mother_name;
    private int age;
    private String city;
    private String postalCode;
    public Student(StudentBuilder studentBuilder) {
        this.roll_number = studentBuilder.getRoll_number();
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.postalCode = studentBuilder.getPostalCode();
    }
}
