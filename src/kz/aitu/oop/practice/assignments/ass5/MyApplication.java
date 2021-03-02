package kz.aitu.oop.practice.assignments.ass5;

import kz.aitu.oop.practice.assignments.ass5.controllers.EmployeeController;
import kz.aitu.oop.practice.assignments.ass5.controllers.ManagerController;
import kz.aitu.oop.practice.assignments.ass5.controllers.ProgrammersController;

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
            System.out.println("Select option: (1-5)");
            System.out.println("1. Get all managers");
            System.out.println("2. Get manager by name");
            System.out.println("3. Set deadline");
            System.out.println("4. Set penalty");
            System.out.println("5. Set bonus");
            try {
                System.out.println("Enter the option: ");
                int option = scanner.nextInt();
                if(option==1){
                    getAllManagersMenu();
                }
                if(option==2){
                    getManagerByName();
                }
                if(option==3){

                }
                if(option==1){

                }
                if(option==1){

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
    }
    public void design(){
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
        System.out.println("Please enter name:");
        String name = scanner.next();
        System.out.println("Please enter surname:");
        String surname = scanner.next();
        String response = managerController.getManagerByName(name, surname);
        System.out.println(response);
    }
    public void setDeadline(){
        System.out.println("Please enter day");
        int day = scanner.nextInt();

    }
}
