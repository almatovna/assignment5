package kz.aitu.oop.practice.assignments.ass5;

import kz.aitu.oop.practice.assignments.ass5.controllers.EmployeeController;
import kz.aitu.oop.practice.assignments.ass5.controllers.ManagerController;
import kz.aitu.oop.practice.assignments.ass5.controllers.ProgrammersController;
import kz.aitu.oop.practice.assignments.ass5.data.PostgresDB;
import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;
import kz.aitu.oop.practice.assignments.ass5.repositories.EmployeeRepositories;
import kz.aitu.oop.practice.assignments.ass5.repositories.ManagerRepositories;
import kz.aitu.oop.practice.assignments.ass5.repositories.ProgrammerRepositories;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IEmployeeRepositories;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IManagerRepositories;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IProgrammerRepositories;

public class Main {

    public static void main(String[] args) {
        IDB db = new PostgresDB();
        IEmployeeRepositories repo = new EmployeeRepositories(db);
        IManagerRepositories repo1 = new ManagerRepositories(db);
        IProgrammerRepositories repo2 = new ProgrammerRepositories(db);
        EmployeeController controller = new EmployeeController(repo);
        ManagerController managerController = new ManagerController(repo1);
        ProgrammersController programmersController = new ProgrammersController(repo2);
        MyApplication app = new MyApplication(controller, managerController, programmersController);
        app.start();
    }
}
