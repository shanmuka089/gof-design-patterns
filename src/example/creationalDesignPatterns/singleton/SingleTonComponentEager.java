package example.singleton;

import java.io.Serializable;

public class SingleTonComponentEager implements Serializable
{
    private static boolean instanceCreated = false;
    private static volatile SingleTonComponentEager singleTonComponentEager = new SingleTonComponentEager();
    private SingleTonComponentEager(){
        if(instanceCreated) {
            throw new RuntimeException("please use getInstance method to access the instance of this class.");
        }
        instanceCreated = true;
    }
    public static SingleTonComponentEager getInstance() {
        return singleTonComponentEager;
    }

    //Avoid create new object through constructor
    @Override
    protected SingleTonComponentEager clone() throws CloneNotSupportedException
    {
        return singleTonComponentEager;
    }
    //Avoid creating object while deserializing
    protected Object readResolve() {
        return getInstance();
    }
}
