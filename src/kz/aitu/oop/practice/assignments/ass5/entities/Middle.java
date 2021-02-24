package kz.aitu.oop.practice.assignments.ass5.entities;

public class Middle extends Employee {
    private String position;
    private String duties;
    private String project;

    public Middle(String name, String surname, String hireDate, int salary, String position, String duties, String project) {
        super(name, surname, hireDate, salary);
        setPosition(position);
        setDuties(duties);
        setProject(project);
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDuties() {
        return duties;
    }
    public void setDuties(String duties) {
        this.duties = duties;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Middle {" +
                "name='" + super.getName() + '\'' +
                "surname='" + super.getSurname() + '\'' +
                "hire date='" + super.getHireDate() + '\'' +
                "salary='" + super.getSalary() + '\'' +
                "position='" + position + '\'' +
                ", duties='" + duties + '\'' +
                ", project='" + project + '\'' +
                '}';
    }
}
