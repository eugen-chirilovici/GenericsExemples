package part2.generics.miniProject.entity;

public class Employee extends BaseUser {
    private String BU;
    private String discipline;

    public String getBU() {
        return BU;
    }

    public void setBU(String BU) {
        this.BU = BU;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", BU='" + BU + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
    }
}
