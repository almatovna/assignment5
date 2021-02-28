package kz.aitu.oop.practice.assignments.ass5.repositories.interfaces;

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
}
