package part2.generics.miniProject.entity;

public class Intern extends BaseUser {
    private Long age;
    private String discipline;

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getAge() {
        return age;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
