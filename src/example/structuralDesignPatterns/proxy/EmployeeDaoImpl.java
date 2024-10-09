package example.structuralDesignPatterns.proxy;

public class EmployeeDaoImpl implements EmployeeDao
{
    @Override
    public void createEmployee(String userType, String ClientId)
    {
        System.out.println("Employee created Successfully!...");
    }
    @Override
    public void deleteEmployee(String userType, String ClientId)
    {
        System.out.println("Employee deleted Successfully!...");
    }
    @Override
    public void getEmployee(String userType, String ClientId)
    {
        System.out.println("Employees information fetched Successfully!...");
    }
}
