package com.instgrs.dao;

import com.instgrs.model.User;
import com.instgrs.service.GetConnection;
import com.instgrs.service.SendMailSSL;
import com.instgrs.service.UpdatePassword;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserDAO {

    public static boolean registerUser(User u) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "insert into user(name,unique_id,email,mobile,institute_id,course_id,branch_id,designation_id,password) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getName());
            ps.setString(2, u.getUniqueId());
            ps.setString(3, u.getEmail());
            ps.setString(4, u.getMobile());
            ps.setInt(5, u.getInstituteId());
            ps.setInt(6, u.getCourseId());
            ps.setInt(7, u.getBranchId());
            ps.setInt(8, u.getDesignationId());
            ps.setString(9, u.getPassword());
            if (ps.executeUpdate() != 0) {
                status = true;
                SendMailSSL.sendEmail(u.getEmail());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return status;
    }

    public static boolean verifyUser(User u) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "update user set verify=1 where email = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getEmail());
            if (ps.executeUpdate() != 0) {
                status = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return status;
    }
    public static boolean updatePassword(User u){
        boolean status = false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "update user set password = ?,verify=0 where email = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, u.getPassword());
            ps.setString(2, u.getEmail());
            if (ps.executeUpdate() != 0) {
                status = true;
                UpdatePassword.sendEmail(u.getEmail());
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
        return status;
    }
}
