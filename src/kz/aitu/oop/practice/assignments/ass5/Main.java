package kz.aitu.oop.practice.assignments.ass5;

import kz.aitu.oop.practice.assignments.ass5.controllers.EmployeeController;
import kz.aitu.oop.practice.assignments.ass5.data.PostgresDB;
import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;
import kz.aitu.oop.practice.assignments.ass5.repositories.EmployeeRepositories;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IEmployeeRepositories;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IEmployeeRepositories repo = new EmployeeRepositories(db);
        EmployeeController controller = new EmployeeController(repo);
        MyApplication app = new MyApplication(controller);
        app.start();
    }
}
