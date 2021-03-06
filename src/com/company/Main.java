package com.company;

import controllers.CentreController;
import data.DBManager;
import data.IDBManager;
import repositories.StudentRep;
import repositories.interfaces.IStudentRep;

public class Main {

    public static void main(String[] args) {
            IDBManager dbManager = new DBManager();
            IStudentRep studentRep = new StudentRep(dbManager);
            CentreController centreController = new CentreController(studentRep);
            Application application = new Application(centreController);
            application.start();


        }
    }




