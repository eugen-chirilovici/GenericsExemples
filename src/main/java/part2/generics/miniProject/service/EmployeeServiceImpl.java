package part2.generics.miniProject.service;

import part2.generics.miniProject.dao.EmployeeDAO;
import part2.generics.miniProject.dao.EmployeeDAOImpl;
import part2.generics.miniProject.entity.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeDAO employeeDAO = new EmployeeDAOImpl();

    @Override
    public List<Employee> getEmployees() {
        return employeeDAO.getEmployee();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(Long l) {
        return (Employee) employeeDAO.getById(l);
    }


}
