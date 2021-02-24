package kz.aitu.oop.practice.assignments.ass5.entities;

public class Admin extends Employee {
    private String position;
    private String duties;

    public Admin(String name, String surname, String hireDate, int salary, String position, String duties){
        super(name, surname, hireDate, salary);
        setPosition(position);
        setDuties(duties);
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

    @Override
    public String toString() {
        return "Admin { " +
                "name='" + super.getName() + '\'' +
                "surname='" + super.getSurname() + '\'' +
                "hire date='" + super.getHireDate() + '\'' +
                "salary='" + super.getSalary() + '\'' +
                "position='" + position + '\'' +
                ", duties='" + duties + '\'' +
                '}';
    }
}
