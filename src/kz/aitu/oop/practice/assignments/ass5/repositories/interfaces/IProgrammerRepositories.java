package kz.aitu.oop.practice.assignments.ass5.repositories.interfaces;

import kz.aitu.oop.practice.assignments.ass5.entities.Designer;
import kz.aitu.oop.practice.assignments.ass5.entities.Programmer;

import java.util.List;

public interface IProgrammerRepositories {
    List<Programmer> getAllProgrammers();
    List<Programmer> getProgrammerByName(String name, String surname);
    List<Programmer> getProgrammerByStatus(String status);

    List<Designer> getAllDesigners();
    List<Designer> getDesignerByName(String name, String surname);
    List<Designer> getDesignerByStatus(String status);

}
