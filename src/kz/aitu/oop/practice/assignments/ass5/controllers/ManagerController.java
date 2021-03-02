package kz.aitu.oop.practice.assignments.ass5.controllers;

import kz.aitu.oop.practice.assignments.ass5.entities.Manager;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IManagerRepositories;

import java.util.List;

public class ManagerController {
    private final IManagerRepositories repo;
    public ManagerController(IManagerRepositories repo) {
        this.repo = repo;
    }

    public String getAllManagers(){
        List<Manager> managers = repo.getAllManagers();
        return managers == null ? "Not Found!" : managers.toString();
    }
    public String getManagerByName(String name, String surname){
        List<Manager> managers = repo.getManagerByName(name, surname);
        return managers == null ? "Not Found!" : managers.toString();
    }
}
