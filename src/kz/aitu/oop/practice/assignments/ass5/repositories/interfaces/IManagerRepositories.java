package kz.aitu.oop.practice.assignments.ass5.repositories.interfaces;

import kz.aitu.oop.practice.assignments.ass5.entities.Manager;

import java.util.List;

public interface IManagerRepositories{
    List<Manager> getAllManagers();
    List<Manager> getManagerByName(String name, String surname);
}
