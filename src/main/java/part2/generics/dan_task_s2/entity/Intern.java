package part2.generics.dan_task_s2.entity;

public class Intern extends BasicUser{
    private String discipline;
    private String stream;

    public Intern(int id, String name, String surname, int age,String discipline, String stream) {
        super(id, name, surname, age);
        setDiscipline(discipline);
        setStream(stream);
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }
}
