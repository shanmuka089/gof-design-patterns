package example.creationalDesignPatterns.objectPool;

public class Resource
{
    private final ResourcePoolManager resourcePoolManager;
    private String url;
    private String userName;
    private String password;
    public Resource(String url, String userName, String password, ResourcePoolManager resourcePoolManager)
    {
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.resourcePoolManager = resourcePoolManager;
    }
    public Resource(ResourcePoolManager resourcePoolManager) {
        this("defaultUrl", "defaultUser", "defaultPassword", resourcePoolManager);
    }
    public void close() {
        this.resourcePoolManager.releaseResource(this);
    }
}
