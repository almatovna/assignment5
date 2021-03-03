package kz.aitu.oop.practice.assignments.ass5.entities;

import kz.aitu.oop.practice.assignments.ass5.entities.interfaces.INonProgrammer;

public class Manager extends Employee implements INonProgrammer {
    private int salary;
    public Manager(int id, String name, String surname, String status, String hireDate, int salary) {
        super(id, name, surname, status, hireDate);
        setSalary(salary);
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }


    public String work(){
        return super.getName() + " " + super.getSurname() + " works as manager";
    }
    public String salary(){
        return "Manager gets salary " + getSalary() + "$ per month";
    }
    public void ManagerInfo(){
        System.out.println(work());
        System.out.println(salary());
    }

    @Override
    public void setDeadLine(int day) {
        Programmer.deadline = day;
        Designer.deadline = day;
    }

    @Override
    public void setPenalty(int penalty) {
        Programmer.penalty = penalty;
        Designer.penalty = penalty;
    }

    @Override
    public void setBonus(int bonus) {
        Programmer.bonus = bonus;
        Designer.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name = " + super.getName() + " " +
                "surname = " + super.getSurname() +
                ", hired date = " + super.getHireDate() +
                ", status = " + super.getStatus() +
                ", salary=" + salary +
                '}';
    }
}
