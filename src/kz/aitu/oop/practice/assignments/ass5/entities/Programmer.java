package kz.aitu.oop.practice.assignments.ass5.entities;

import kz.aitu.oop.practice.assignments.ass5.entities.interfaces.IProgrammer;

public class Programmer extends Employee implements IProgrammer {
    public static int deadline;
    public static int bonus;
    public static int penalty;

    private int time;
    private int salary;
    private String project;

    public Programmer(int id, String name, String surname, String status, String hireDate, int time, int salary, String project) {
        super(id, name, surname, status, hireDate);
        setTime(time);
        setSalary(salary);
        setProject(project);
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }

    public static void setBonus(int bonus) {
        Programmer.bonus = bonus;
    }
    public static void setDeadline(int deadline) {
        Programmer.deadline = deadline;
    }
    public static void setPenalty(int penalty) {
        Programmer.penalty = penalty;
    }

    public String work(){
        return super.getName() + " " + super.getSurname() + " works as Developer";
    }
    public String salary() {
        return "Salary is " + getSalary() + "$ per month";
    }

    public String check() {
        if(deadline<time){
            return "Programmer got bonus " + getBonus() + "$ for early done.";
        } else {
            return "Programmer got penalty " + getPenalty() + "$ for late.";
        }
    }
    public void ProgrammerInfo(){
        System.out.println(work());
        System.out.println(salary());
        System.out.println(check());
    }

    @Override
    public String toString() {
        return "Programmer {" +
                "name = " + super.getName() + " " +
                "surname = " + super.getSurname() +
                ", hired date = " + super.getHireDate() +
                ", status = " + super.getStatus() +
                ", project = " + project +
                ", time = " + time +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int getDeadline() {
        return deadline;
    }

    @Override
    public int getBonus() {
        return bonus;
    }

    @Override
    public int getPenalty() {
        return penalty;
    }
}