package kz.aitu.oop.practice.assignments.ass5;

import kz.aitu.oop.practice.assignments.ass5.controllers.EmployeeController;
import kz.aitu.oop.practice.assignments.ass5.controllers.ManagerController;
import kz.aitu.oop.practice.assignments.ass5.controllers.ProgrammersController;
import kz.aitu.oop.practice.assignments.ass5.entities.Manager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final EmployeeController controller;
    private final ManagerController managerController;
    private final ProgrammersController programmersController;
    private final Scanner scanner;
    public MyApplication(EmployeeController controller, ManagerController managerController, ProgrammersController programmersController) {
        this.controller = controller;
        this.managerController = managerController;
        this.programmersController = programmersController;
        scanner = new Scanner(System.in);
    }
    public void start(){
        while (true){
            System.out.println("Welcome to My Application!");
            System.out.println("Select option: (1-4)");
            System.out.println("1. Manager");
            System.out.println("2. Programmer");
            System.out.println("3. Designer");
            System.out.println("4. Total expenditure");
            System.out.println("0. Exit");
            try {
                System.out.println("Enter the option: (1-4)");
                int option = scanner.nextInt();
                if(option==1){
                    manage();
                }
                if(option==2){
                    program();
                }
                if(option==3){
                    design();
                }
                if(option==4){
                    total();
                }
                else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("**************************");
        }

        }
    public void manage(){
        while (true){
            System.out.println("Select option: (1-2)");
            System.out.println("1. Get all managers");
            System.out.println("2. Get manager by name");
            System.out.println("0. Exit");
            try {
                System.out.println("Enter the option: ");
                int option = scanner.nextInt();
                if(option==1){
                    getAllManagersMenu();
                }
                if(option==2){
                    getManagerByName();
                }
                if(option==0){
                    start();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void program(){
        while (true){
            System.out.println("Select option: (1-3)");
            System.out.println("1. Get all programmers");
            System.out.println("2. Get programmer by name");
            System.out.println("3. Get programmer by status");
            System.out.println("0. Exit");
            try {
                System.out.println("Enter the option: ");
                int option = scanner.nextInt();
                if(option==1){
                    getAllProgrammersMenu();
                }
                if(option==2){
                    getProgrammerByName();
                }
                if(option==3){
                    getProgrammerByStatus();
                }
                if(option==0){
                    start();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public void design(){
        while (true){
            System.out.println("Select option: (1-3)");
            System.out.println("1. Get all designers");
            System.out.println("2. Get designer by name");
            System.out.println("3. Get designer by status");
            System.out.println("0. Exit");
            try {
                System.out.println("Enter the option: ");
                int option = scanner.nextInt();
                if(option==1){
                    getAllDesignersMenu();
                }
                if(option==2){
                    getDesignerByName();
                }
                if(option==3){
                    getDesignerByStatus();
                }
                if(option==0){
                    start();
                }
            } catch (InputMismatchException e) {
                System.out.println("Input must be integer!");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
    public void total(){
        String response = controller.totalCost();
        System.out.println(response);
    }
    public void getAllManagersMenu(){
        String response = managerController.getAllManagers();
        System.out.println(response);
    }
    public void getManagerByName(){
        String response = managerController.getManagerByName("Marcie", "Mogg");
        System.out.println(response);
        response = managerController.getManagerByName("Harald", "Godmer");
        System.out.println(response);
    }
    public void getAllProgrammersMenu(){
        String response = programmersController.getAllProgrammers();
        System.out.println(response);
    }
    public void getProgrammerByName(){
        String response = programmersController.getProgrammerByName("Cary", "Vuitton");
        System.out.println(response);
        response = programmersController.getProgrammerByName("Cindelyn", "Scutter");
        System.out.println(response);
    }
    public void getProgrammerByStatus(){
        String response = programmersController.getProgrammerByStatus("Software Engineer III");
        System.out.println(response);
        response = programmersController.getProgrammerByStatus("Software Test Engineer II");
        System.out.println(response);
    }
    public void getAllDesignersMenu() {
        String response = programmersController.getAllDesigners();
        System.out.println(response);
    }
    public void getDesignerByName() {
        String response = programmersController.getDesignerByName("Minta", "Veschi");
        System.out.println(response);
        response = programmersController.getDesignerByName("Lorain", "Drayn");
        System.out.println(response);
    }
    public void getDesignerByStatus() {
        String response = programmersController.getProgrammerByStatus("Editor");
        System.out.println(response);
        response = programmersController.getDesignerByStatus("Programmer III");
        System.out.println(response);
    }

}
