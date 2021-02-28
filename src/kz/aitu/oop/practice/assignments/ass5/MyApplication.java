package kz.aitu.oop.practice.assignments.ass5;

import kz.aitu.oop.practice.assignments.ass5.controllers.EmployeeController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyApplication {
    private final EmployeeController controller;
    private final Scanner scanner;
    public MyApplication(EmployeeController controller) {
        this.controller = controller;
        scanner = new Scanner(System.in);
    }
    public void start(){
        while (true){
            System.out.println("Welcome to My Application!");
            System.out.println("Select option: (1-3)");
            System.out.println("1. Admin");
            System.out.println("2. Programmer");
            System.out.println("3. Tech staff");
            System.out.println("0. Exit");
            try {
                System.out.println("Enter the option: (1-3)");
                int option = scanner.nextInt();
                if(option==1){
                    while (true){
                        System.out.println("Select option: ");
                        System.out.println("1. Get all admins");
                        System.out.println("2. Add admin");
                        System.out.println("3. Add programmer");
                        System.out.println("4. Get all programmers");
                        System.out.println("5. Delete programmer");
                        System.out.println("6. Create tech staff");
                        System.out.println("7. Get all staff");
                        System.out.println("8. Delete staff by name");
                        System.out.println("0. Exit");
                        try {
                            System.out.println("Enter option: (1-8)");
                            int option2 = scanner.nextInt();
                            if(option2 == 1){
                                getAllAdminsMenu();
                            }
                            if(option2 == 2){
                                createAdminMenu();
                            }
                            if(option2 == 3){
                                createProgrammerMenu();
                            }
                            if (option2 == 4){
                                getAllProgrammersMenu();
                            }
                            if(option2 == 5){
                                removeProgrammerMenu();
                            }
                            if(option2 == 6){
                                createTechStaffMenu();
                            }
                        } catch (InputMismatchException exception) {
                            System.out.println("Input must be integer!");
                            scanner.nextLine();
                        } catch (Exception exception) {
                            System.out.println(exception.getMessage());
                        }
                        System.out.println("**************************");
                        }

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
    public void getAllAdminsMenu(){
        String response = controller.getAllAdmins();
        System.out.println(response);
    }
    public void createAdminMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter hired date");
        String hireDate = scanner.next();
        System.out.println("Please enter salary");
        int salary = scanner.nextInt();
        System.out.println("Please enter position");
        String position = scanner.next();
        System.out.println("Please enter duties");
        String duties = scanner.next();
        String response = controller.createAdmin(name, surname, hireDate, salary, position, duties);
        System.out.println(response);
    }
    public void createProgrammerMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter hired date");
        String hireDate = scanner.next();
        System.out.println("Please enter salary");
        int salary = scanner.nextInt();
        System.out.println("Please enter position");
        String position = scanner.next();
        System.out.println("Please enter duties");
        String duties = scanner.next();
        String response = controller.createProgrammer(name, surname, hireDate, salary, position, duties);
        System.out.println(response);
    }
    public void getAllProgrammersMenu(){
        String response = controller.getAllProgrammers();
        System.out.println(response);
    }
    public void removeProgrammerMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        String response = controller.deleteProgrammerByName(name);
        System.out.println(response);
    }
    public void createTechStaffMenu(){
        System.out.println("Please enter name");
        String name = scanner.next();
        System.out.println("Please enter surname");
        String surname = scanner.next();
        System.out.println("Please enter hired date");
        String hireDate = scanner.next();
        System.out.println("Please enter salary");
        int salary = scanner.nextInt();
        System.out.println("Please enter position");
        String position = scanner.next();
        System.out.println("Please enter duties");
        String duties = scanner.next();
        String response = controller.createStaff(name, surname, hireDate, salary, position, duties);
        System.out.println(response);
    }
}
