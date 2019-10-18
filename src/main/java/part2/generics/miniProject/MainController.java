package part2.generics.miniProject;


import part2.generics.miniProject.entity.BaseUser;
import part2.generics.miniProject.entity.Employee;
import part2.generics.miniProject.entity.Intern;
import part2.generics.miniProject.service.EmployeeService;
import part2.generics.miniProject.service.EmployeeServiceImpl;
import part2.generics.miniProject.service.UserService;
import part2.generics.miniProject.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    static UserService userService = new UserServiceImpl();

    static EmployeeService employeeService = new EmployeeServiceImpl();

    static List<BaseUser> listOfUsers = new ArrayList<>();

    static {
        Employee employee = new Employee();
        employee.setId(1233311L);
        employee.setFirstName("Alex");
        employee.setLastName("Smith");
        employee.setBU("UK");
        employee.setDiscipline("Tester");
        listOfUsers.add(employee);
    }

    public static void main(String[] args) {
        userService.saveUsers(listOfUsers);

//        System.out.println(userService.getListOfUsers());
//
//        System.out.println();
//        System.out.println(userService.getUserById(1233311L));
//

//        employeeService.saveEmployee(getIntern());
        System.out.println(employeeService.getEmployeeById(1233311L));
//
//        System.out.println("\nGet list of employee");
//        System.out.println(employeeService.getUsers());

//        System.out.println(employeeService.getEmployees());
//        System.out.println();
//        System.out.println(userService.getListOfUsers());
    }

    static Intern getIntern(){
        Intern intern = new Intern();
        intern.setId(2243312L);
        intern.setFirstName("Mihai");
        intern.setLastName("Sugar");
        intern.setAge(20L);
        intern.setDiscipline("AM");
        return intern;
    }

}
