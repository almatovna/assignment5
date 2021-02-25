package kz.aitu.oop.practice.assignments.ass5.controllers;

import kz.aitu.oop.practice.assignments.ass5.entities.Admin;
import kz.aitu.oop.practice.assignments.ass5.entities.Programmer;
import kz.aitu.oop.practice.assignments.ass5.entities.Project;
import kz.aitu.oop.practice.assignments.ass5.entities.TechStaff;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IEmployeeRepositories;

import java.util.List;

public class EmployeeController {
    private final IEmployeeRepositories repo;

    public EmployeeController(IEmployeeRepositories repo) {
        this.repo = repo;
    }

    public String createAdmin(String name, String surname, String hireDate, int salary, String position, String duties){
        Admin admin = new Admin(name, surname, hireDate, salary, position, duties);
        boolean created = repo.createAdmin(admin);
        return (created ? "Admin was created!" : "Admin creation was failed!");
    }
    public String getAdminById(int id){
        Admin admin = repo.getAdminById(id);
        return (admin == null ? "Admin was not found" : admin.toString());
    }
    public String getAdminByName(String name){
        Admin admin = repo.getAdminByName(name);
        return (admin == null ? "Admin was not found" : admin.toString());
    }
    public String getAllAdmins(){
        List<Admin> admins = repo.getAllAdmin();
        return admins.toString();
    }
    public String createProgrammer(String name, String surname, String hireDate, int salary, String position, String duties){
        Programmer programmer = new Programmer(name, surname, hireDate, salary, position, duties);
        boolean created = repo.createProgrammer(programmer);
        return (created ? "Programmer was created!" : "Programmer creation was failed!");
    }
    public String getProgrammerByName(String name){
        Programmer programmer = repo.getProgrammerByName(name);
        return (programmer == null ? "Programmer was not found!" : programmer.toString());
    }
    public String getAllProgrammers(){
        List<Programmer> programmers = repo.getAllProgrammers();
        return programmers.toString();
    }
    public String deleteProgrammerByName(String name){
        boolean deleted = repo.deleteProgrammerByName(name);
        return (deleted ? "Programmer was deleted!" : "Programmer deletion was failed!");
    }
    public String createStaff(String name, String surname, String hireDate, int salary, String position, String duties) {
        TechStaff staff = new TechStaff(name, surname,hireDate, salary,position, duties);
        boolean created = repo.createStaff(staff);
        return (created ? "Tech staff was created!": "Tech staff creation was failed!");
    }
    public String getStaffByName(String name){
        TechStaff staff = repo.getStaffByName(name);
        return (staff == null ? "Staff was not found" : staff.toString());
    }
    public String getAllStaff(){
        List<TechStaff> staffs = repo.getAllStaff();
        return staffs.toString();
    }
    public String getBySalary(int first, int second){
        List<TechStaff> staffs = repo.getBySalary(first, second);
        return staffs.toString();
    }
    public String deleteStaffByName(String name){
        boolean deleted = repo.deleteStaffByName(name);
        return (deleted ? "Tech staff was deleted!" : "Tech staff deletion was failed!");
    }
    public String createProject(String projectName, String name, String surname, String organisation, int price){
        Project project = new Project(projectName, name, surname, organisation, price);
        boolean created = repo.createProject(project);
        return (created ? "Project was created!" : "Project creation was failed!");
    }
    public String getAllProjects(){
        List<Project> projects = repo.getAllProjects();
        return projects.toString();
    }
    public String getProjectByName(String name){
        Project project = repo.getProjectByName(name);
        return (project == null ? "Staff was not found" : project.toString());
    }
    public String deleteProjectByName(String name) {
        boolean deleted = repo.deleteProjectByName(name);
        return (deleted ? "Project was deleted!" : "Project deletion was failed!");
    }
}
