package kz.aitu.oop.practice.assignments.ass5.controllers;

import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IEmployeeRepositories;

import java.util.List;

public class EmployeeController {
    private final IEmployeeRepositories repo;
    public EmployeeController(IEmployeeRepositories repo) {
        this.repo = repo;
    }

    public String totalCost(){
        int total = repo.totalCost();
        return total == 0 ? "Failed!" : "Total salary for all employees " + total + "$!";
    }
}
