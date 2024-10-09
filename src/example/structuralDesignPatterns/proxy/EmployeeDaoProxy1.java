package example.structuralDesignPatterns.proxy;

import java.time.Instant;

public class EmployeeDaoProxy1 implements EmployeeDao
{
    private EmployeeDao employeeDao;
    public EmployeeDaoProxy1() {
        employeeDao = new EmployeeDaoProxy2();
    }
    @Override
    public void createEmployee(String userType, String ClientId) {
        System.out.println(ClientId + ", making a create request at: "+ Instant.now().toString());
        employeeDao.createEmployee(userType, ClientId);
    }
    @Override
    public void deleteEmployee(String userType, String ClientId) {
        System.out.println(ClientId + ", making a delete request at: "+ Instant.now().toString());
        employeeDao.deleteEmployee(userType, ClientId);
    }
    @Override
    public void getEmployee(String userType, String ClientId) {
        System.out.println(ClientId + ", making a get request at: "+ Instant.now().toString());
        employeeDao.getEmployee(userType, ClientId);
    }

}
