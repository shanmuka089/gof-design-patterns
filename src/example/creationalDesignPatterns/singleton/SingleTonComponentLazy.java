package example.singleton;

public class SingleTonComponentLazy
{
    private static volatile SingleTonComponentLazy singleTonComponentLazy;

    private SingleTonComponentLazy() {
        if(singleTonComponentLazy != null) {
            throw new RuntimeException("please use get Instance method to create instance");
        }
    }

    public static SingleTonComponentLazy getInstance() {
        if(singleTonComponentLazy == null) {
            synchronized(SingleTonComponentLazy.class) {
                if(singleTonComponentLazy == null) {
                    singleTonComponentLazy = new SingleTonComponentLazy();
                }
            }
        }
        return singleTonComponentLazy;
    }
}
