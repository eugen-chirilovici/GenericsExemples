package part2.generics.miniProject.db;

import part2.generics.miniProject.entity.BaseUser;
import part2.generics.miniProject.entity.Employee;
import part2.generics.miniProject.entity.Intern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyDataBase<T extends BaseUser> {
    private static final List<BaseUser> usersList = new ArrayList<>();

    static {
        Employee employee = new Employee();
        employee.setId(1233311L);
        employee.setFirstName("Iwan");
        employee.setLastName("Emin");
        employee.setBU("MDD");
        employee.setDiscipline("AM");

        Intern intern = new Intern();
        intern.setId(2243312L);
        intern.setFirstName("Mihai");
        intern.setLastName("Sugar");
        intern.setAge(20L);
        intern.setDiscipline("AM");

        usersList.add(employee);
        usersList.add(intern);
    }

    public List<T> getUsers(){
        return new ArrayList<>((Collection<? extends T>) usersList);
    }

    public void addUser(T t){
        usersList.add(t);
    }
}
