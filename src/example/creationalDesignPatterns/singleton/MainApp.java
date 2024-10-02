package example.singleton;

public class MainApp
{

    public static void main(String[] args)
    {
         SingleTonComponentEager singleTonComponentEager = SingleTonComponentEager.getInstance();
         SingleTonComponentLazy singleTonComponentLazy= SingleTonComponentLazy.getInstance();

        SingleTonComponentEager singleTonComponentEager2 = SingleTonComponentEager.getInstance();
        SingleTonComponentLazy singleTonComponentLazy2 = SingleTonComponentLazy.getInstance();

        System.out.println("Eager obji:"+ singleTonComponentEager+", obj2:"+ singleTonComponentEager2);
        System.out.println("Lazy obji:"+ singleTonComponentLazy+", obj2:"+ singleTonComponentLazy2);

    }
}
