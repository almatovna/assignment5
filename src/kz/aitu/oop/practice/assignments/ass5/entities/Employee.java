package kz.aitu.oop.practice.assignments.ass5.entities;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private String status;
    private String hireDate;

    public Employee(String name, String surname){
        setName(name);
        setSurname(surname);
    }
    public Employee(String name, String surname, String status, String hireDate){
        setName(name);
        setSurname(surname);
        setStatus(status);
        setHireDate(hireDate);
    }
    public Employee(int id, String name, String surname, String status, String hireDate) {
        setId(id);
        setName(name);
        setSurname(surname);
        setStatus(status);
        setHireDate(hireDate);
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
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public void getEmpInfo(){
        System.out.println("Employee: " + getName() + " " + getSurname() + " with id " + getId());
        System.out.println("Status: " + getStatus());
        System.out.println("Hired date: " + getHireDate());
    }
}
