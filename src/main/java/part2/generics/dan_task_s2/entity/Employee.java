package part2.generics.dan_task_s2.entity;

public class Employee extends BasicUser {
    private int salary;
    private String position;

    public Employee(int id, String name, String surname, int age, int salary, String position) {
        super(id, name, surname, age);
        setSalary(salary);
        setPosition(position);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
