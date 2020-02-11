package com.instgrs.dao;

import com.instgrs.model.User;
import com.instgrs.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterDAO {
    public static boolean registerUser(User u){
        boolean status = false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "insert into user(name,unique_id,email,mobile,institute_id,course_id,branch_id,designation_id,password) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getUniqueId());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getMobile());
            ps.setInt(5, u.getInstituteId());
            ps.setInt(6, u.getCourseId());
            ps.setInt(7, u.getCourseId());
            ps.setInt(8, u.getDesignationId());
            ps.setString(9, u.getPassword());
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
        return status;
    }
}
