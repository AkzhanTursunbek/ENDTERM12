package repositories.interfaces;

import entities.Mentors;
import entities.Students;

import java.util.ArrayList;

public interface IStudentRep {
    boolean addStudent(Students students);
    String study(Students students);

}
