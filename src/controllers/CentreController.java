package controllers;

import entities.Students;
import repositories.interfaces.IStudentRep;

public class CentreController {
    private final IStudentRep studentRep;

    public CentreController(IStudentRep studentRep) {
        this.studentRep = studentRep;
    }

    public String addStudent(int id,String first_name,String last_name,int age,int score,String email,int group_id) {

        Students students = new Students(id,first_name,last_name,age,score,email,group_id);
        boolean added = studentRep.addStudent(students);

        if (added) {
            return "Student was added!";
        }

        return "Student was not added!";

    }


    public String study(Students students){
        Students students1= new Students(students);
        boolean studies = Boolean.parseBoolean(studentRep.study(students1));

        if (studies) {
            return "Student was added!";
        }

        return "Student was not added!";
    }




}

