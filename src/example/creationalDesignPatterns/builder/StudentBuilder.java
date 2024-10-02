package example.creationalDesignPatterns.builder;

public class StudentBuilder
{
    private int roll_number;
    private String name;
    private int age;
    private String city;
    private String postalCode;
    public StudentBuilder setRollNumber(int roll_number) {
        this.roll_number = roll_number;
        return this;
    }
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }
    public StudentBuilder setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public Student build() {
        return new Student(this);
    }


    public int getRoll_number()
    {

        return roll_number;
    }

    public String getName()
    {

        return name;
    }

    public int getAge()
    {

        return age;
    }

    public String getCity()
    {

        return city;
    }

    public String getPostalCode()
    {

        return postalCode;
    }

}
