package example.builder;

public class MainApp
{

    public static void main(String[] args)
    {
        Student st =new StudentBuilder()
                .setName("Shanu")
                .setAge(24)
                .setCity("Bglr")
                .build();
        System.out.println(st);
    }
}
