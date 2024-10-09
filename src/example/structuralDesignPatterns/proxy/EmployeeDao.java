package example.structuralDesignPatterns.proxy;

public interface EmployeeDao
{
    void createEmployee(String userType, String ClientId);

    void deleteEmployee(String userType, String ClientId);

    void getEmployee(String userType, String ClientId);
}
