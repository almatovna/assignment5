package kz.aitu.oop.practice.assignments.ass5.controllers;

import kz.aitu.oop.practice.assignments.ass5.entities.Designer;
import kz.aitu.oop.practice.assignments.ass5.entities.Programmer;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IProgrammerRepositories;

import java.util.List;

public class ProgrammersController {
    private final IProgrammerRepositories repo;
    public ProgrammersController(IProgrammerRepositories repo) {
        this.repo = repo;
    }

    public String getAllProgrammers(){
        List<Programmer> programmers = repo.getAllProgrammers();
        return programmers == null ? "Not found!" : programmers.toString();
    }

    public String getProgrammerByName(String name, String surname){
        List<Programmer> programmers = repo.getProgrammerByName(name, surname);
        return programmers == null ? "Not found!" : programmers.toString();
    }
    public String getProgrammerByStatus(String status){
        List<Programmer> programmers = repo.getProgrammerByStatus(status);
        return programmers == null ? "Not found!" : programmers.toString();
    }
    public String getAllDesigners(){
        List<Designer> designers = repo.getAllDesigners();
        return designers == null ? "Not found!" : designers.toString();
    }

    public String getDesignerByName(String name, String surname){
        List<Designer> designers = repo.getDesignerByName(name, surname);
        return designers == null ? "Not found!" : designers.toString();
    }
    public String getDesignerByStatus(String status){
        List<Designer> designers = repo.getDesignerByStatus(status);
        return designers == null ? "Not found!" : designers.toString();
    }
}
