package example.creationalDesignPatterns.objectPool;

public class MainApp
{

    public static void main(String[] args)
    {
         ResourcePoolManager resourcePoolManager = ResourcePoolManager.getResourcePool();
         Resource resource = resourcePoolManager.getResource();
         Resource resource2 = resourcePoolManager.getResource();
         Resource resource3 = resourcePoolManager.getResource();
         Resource resource4 = resourcePoolManager.getResource();
         Resource resource5 = resourcePoolManager.getResource();
         Resource resource6 = resourcePoolManager.getResource();
         Resource resource7 = resourcePoolManager.getResource();

        System.out.println(resource);
        System.out.println(resource2);
        System.out.println(resource3);
        System.out.println(resource4);
        System.out.println(resource5);
        System.out.println(resource6);
        System.out.println(resource7);

        ResourcePoolManager resourcePoolManager2 = ResourcePoolManager.getResourcePool();
        resource2.close();
        resource3.close();
        Resource resource9 = resourcePoolManager.getResource();
        Resource resource10 = resourcePoolManager.getResource();
        Resource resource11 = resourcePoolManager.getResource();
        System.out.println(resource9);
        System.out.println(resource10);
        System.out.println(resource11);


    }
}
