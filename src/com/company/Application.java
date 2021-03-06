package com.company;

import controllers.CentreController;
import entities.Students;
import repositories.interfaces.IStudentRep;

import java.util.Scanner;

public class Application {
    private final CentreController centreController;
    private final Scanner scanner;
    private Students students;

    public Application(CentreController centreController) {
        this.centreController = centreController;
        scanner = new Scanner(System.in);
    }


    public void start() {
        while (true) {
            System.out.println("Choose one option:\n 1) Add new student \n " + "2) Study \n " + "0) Exit\n");
            int choice = scanner.nextInt();

            if (choice == 1) {
                addStudent();
            }
            else if(choice==2){
                study();
                }
            else {
                break;
            }

            System.out.println("____________________________");
        }
    }


    public void addStudent(){
        System.out.println("Student's id");
        int id = scanner.nextInt();
        System.out.println("Write Student's first name");
        String first_name = scanner.next();
        System.out.println("Write Student's last name");
        String last_name = scanner.next();
        System.out.println("Write Student's age!");
        int age = scanner.nextInt();
        System.out.println("Write Student's score");
        int score = scanner.nextInt();
        System.out.println("Write Student email");
        String email = scanner.next();
        System.out.println("Write Student's group id");
        int group_id = scanner.nextInt();

        String result;
        result = centreController.addStudent(id,first_name,last_name,age,score,email,group_id);

        System.out.println(result);
    }
    public void study(){
        System.out.println("Student's id");
        int id = scanner.nextInt();
        String result;
        Students students1 = new Students(students);
        result = centreController.study(students1);
        System.out.println(result);
    }




}
