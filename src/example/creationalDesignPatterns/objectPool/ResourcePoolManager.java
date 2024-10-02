package example.creationalDesignPatterns.objectPool;

import java.util.ArrayList;
import java.util.List;

public class ResourcePoolManager
{
    private static volatile ResourcePoolManager resourcePoolManager;
    private List<Resource> freeResources = new ArrayList<>();
    private List<Resource> inUseResources = new ArrayList<>();
    private int initialPoolSize = 3;
    private int maxPoolSIze = 6;
    private ResourcePoolManager() {
        if(resourcePoolManager != null) {
            throw new RuntimeException("please access instance through getResourcePool() method");
        }
        for(int i = 0; i < initialPoolSize; i++) {freeResources.add(new Resource(this));}
    }
    public static ResourcePoolManager getResourcePool() {
        if(resourcePoolManager == null) {
            synchronized(ResourcePoolManager.class) {
                if(resourcePoolManager == null) {
                    resourcePoolManager = new ResourcePoolManager();
                }
            }
        }
        return resourcePoolManager;
    }
    public synchronized Resource getResource() {
        if(freeResources.isEmpty() && inUseResources.size() < maxPoolSIze) {
            freeResources.add(new Resource(this));
        } else if(freeResources.isEmpty() && inUseResources.size() >= maxPoolSIze) {
            return null;
        }
        Resource resource = freeResources.remove(0);
        inUseResources.add(resource);
        return resource;
    }
    public synchronized  void releaseResource(Resource resource)
    {

        if(resource != null)
        {
            inUseResources.remove(resource);
            freeResources.add(resource);
        }
    }
}
