package part2.generics.dan_task_s2;

import part2.generics.dan_task_s2.entity.*;
import part2.generics.dan_task_s2.service.EmployeeHandle;
import part2.generics.dan_task_s2.service.InternHandle;
//import part2.generics.dan_task_s2.service.*;


public class Main {
    public static InternHandle<BasicUser> handleIntern = new InternHandle<>();
    public static EmployeeHandle<BasicUser> handleEmployee = new EmployeeHandle<>();
    public static void main(String[] args) {
        Intern in1 = new Intern(1, "Dan", "Luncasu", 21, "AM", "Java");
        Intern in2 = new Intern(2, "Samule", "Pat", 20, "AM", "Java");
        Intern in3 = new Intern(3, "Maximilian", "Piu", 19, "AM", "Java");
        Employee em = new Employee(2, "Mahomed", "Sardarow", 35, 1200, "Dev");
        handleEmployee.addFromEH(em);
        handleIntern.addFromIH(in1);
        handleIntern.addFromIH(in2);
        handleIntern.addFromIH(in3);
        handleIntern.show(2);
    }
}
