package kz.aitu.oop.practice.assignments.ass5.repositories.interfaces;

import kz.aitu.oop.practice.assignments.ass5.entities.Admin;
import kz.aitu.oop.practice.assignments.ass5.entities.Programmer;
import kz.aitu.oop.practice.assignments.ass5.entities.Project;
import kz.aitu.oop.practice.assignments.ass5.entities.TechStaff;

import java.util.List;

public interface IEmployeeRepositories {
    boolean createAdmin(Admin admin);
    Admin getAdminById(int id);
    Admin getAdminByName(String name);
    List<Admin> getAllAdmin();

    boolean createProgrammer(Programmer programmer);
    Programmer getProgrammerByName(String name);
    List<Programmer> getAllProgrammers();
    boolean deleteProgrammerByName(String name);

    boolean createStaff(TechStaff staff);
    TechStaff getStaffByName(String name);
    List<TechStaff> getAllStaff();
    List<TechStaff> getBySalary(int first, int second);
    boolean deleteStaffByName(String name);

    boolean createProject(Project project);
    List<Project> getAllProjects();
    Project getProjectByName(String projectName);
    boolean deleteProjectByName(String projectName);
}
