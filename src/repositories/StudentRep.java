package repositories;

import data.IDBManager;
import entities.Mentors;
import entities.Students;
import repositories.interfaces.IStudentRep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class StudentRep implements IStudentRep {
    private final IDBManager dbManager;


    public StudentRep(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public boolean addStudent(Students students) {
        Connection con = null;
        try {
            con = dbManager.getConnection();
            String sql = "INSERT INTO students(id,first_name,last_name,age,score,email,group_id) VALUES(?,?,?,?,?,?)";
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, students.getID());
            st.setString(2, students.getFirst_name());
            st.setString(3, students.getLast_name());
            st.setInt(4, students.getAge());
            st.setString(5, students.getEmail());
            st.setInt(6,students.getGroupID());
            st.execute();
            return true;
        } catch ( SQLException throwables ) {
            throwables.printStackTrace();
        } catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public String study(Students students) {
        return (students.getFirst_name()+  students.getLast_name() + "study in SE-2015 group");
    }



}
