package part2.generics.miniProject;


import part2.generics.miniProject.entity.BaseUser;
import part2.generics.miniProject.entity.Employee;
import part2.generics.miniProject.entity.Intern;
import part2.generics.miniProject.service.*;

import java.util.ArrayList;
import java.util.List;

public class MainController {

    static UserService userService = new UserServiceImpl();
    static EmployeeService employeeService = new EmployeeServiceImpl();
    static InternService internService = new InternServiceImpl();
    static List<BaseUser> listOfUsers = new ArrayList<>();


    static {
        Employee employee = new Employee();
        employee.setId(1233311L);
        employee.setFirstName("Alex");
        employee.setLastName("Smith");
        employee.setBU("UK");
        employee.setDiscipline("Tester");
        listOfUsers.add(employee);

        Intern intern = new Intern();
        intern.setId(121212L);
        intern.setFirstName("Ivan");
        intern.setLastName("Kulinski");
        intern.setAge(100L);
        intern.setDiscipline("AM Java");

        Intern intern2 = new Intern();
        intern2.setId(34343434L);
        intern2.setFirstName("Dan");
        intern2.setLastName("Luncasu");
        intern2.setAge(20L);
        intern2.setDiscipline("AM Java");

        Intern intern3 = new Intern();
        intern3.setId(56565656L);
        intern3.setFirstName("Constantin");
        intern3.setLastName("Castravet");
        intern3.setAge(18L);
        intern3.setDiscipline("AM Java");

        listOfUsers.add(intern);
        listOfUsers.add(intern2);
        listOfUsers.add(intern3);
    }

    public static void main(String[] args) {
        userService.saveUsers(listOfUsers);
        internService.getInterns();

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
