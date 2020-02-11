package com.instgrs.dao;

import com.instgrs.model.Courses;
import com.instgrs.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CoursesDAO {
    public static ArrayList<Courses> getCourses(Courses c){
    ArrayList<Courses> al = new ArrayList<>();
    Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select * from courses where institute_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getInstituteId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Courses course = new Courses(id, name, c.getInstituteId());
                al.add(course);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
                con.close();
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
    return al;
    }
}
