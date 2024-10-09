package example.structuralDesignPatterns.proxy;

public class EmployeeDaoProxy2 implements EmployeeDao
{
    private EmployeeDao employeeDao;
    public EmployeeDaoProxy2() {
        employeeDao = new EmployeeDaoImpl();
    }
    @Override
    public void createEmployee(String userType, String ClientId) {
        if(userType.equals("ADMIN")) {
            employeeDao.createEmployee(userType, ClientId);
        } else {
            throw new RuntimeException("Access Denied!...");
        }
    }
    @Override
    public void deleteEmployee(String userType, String ClientId) {
        if(userType.equals("ADMIN")) {
            employeeDao.deleteEmployee(userType, ClientId);
        } else {
            throw new RuntimeException("Access Denied!...");
        }
    }
    @Override
    public void getEmployee(String userType, String ClientId) {
        if(userType.equals("ADMIN") || userType.equals("USER")) {
            employeeDao.getEmployee(userType, ClientId);
        } else {
            throw new RuntimeException("Access Denied!...");
        }

    }
}
