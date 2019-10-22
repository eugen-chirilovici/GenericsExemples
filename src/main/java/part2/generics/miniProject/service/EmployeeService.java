package part2.generics.miniProject.service;

import part2.generics.miniProject.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long l);
}
