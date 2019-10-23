package part2.generics.dan_task_s2.entity;

public class BasicUser {
    private int id;
    private String name;
    private String surname;
    private int age;

    public BasicUser() {
        setName("Undefined");
        setSurname("Unedfined");
        setId(200);
        setAge(0);
    }

    public BasicUser(int id, String name, String surname, int age) {
        setAge(age);
        setId(id);
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
