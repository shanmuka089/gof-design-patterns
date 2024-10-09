package example.structuralDesignPatterns.proxy;

public class MainApp
{
    public static void main(String[] args)
    {
        EmployeeDao employeeDao = new EmployeeDaoProxy1();
        employeeDao.getEmployee("USER", "shane234");
        employeeDao.createEmployee("ADMIN", "kdh736");
        employeeDao.deleteEmployee("ADMIN", "kdh8652");
        employeeDao.createEmployee("USER", "shan1234");
    }
}
