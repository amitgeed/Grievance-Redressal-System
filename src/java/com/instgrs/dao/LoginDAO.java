package com.instgrs.dao;

import com.instgrs.model.Admin;
import com.instgrs.model.User;
import com.instgrs.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

public class LoginDAO {

    public static boolean authenticateUser(User u, HttpSession session) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql ="select user.id, user.name,user.unique_id,user.email,user.mobile,institutes.institute,courses.course,branch.branch,designation.designation from user inner join branch on user.branch_id = branch.id inner join courses on branch.course_id = courses.id inner join institutes on courses.institute_id = institutes.id inner join designation on user.designation_id = designation.id where email = ? and password = ? and verify = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, u.getEmail());
            ps.setString(2, u.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                status = true;
                session.setAttribute("name", rs.getString("name"));
                session.setAttribute("uniqueId", rs.getString("unique_id"));
                session.setAttribute("mobile", rs.getString("mobile"));
                session.setAttribute("email", u.getEmail());
                session.setAttribute("designation", rs.getString("designation"));
                session.setAttribute("institute", rs.getString("institute"));
                session.setAttribute("course", rs.getString("course"));
                session.setAttribute("branch", rs.getString("branch"));
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

    public static boolean authenticateAdmin(Admin a, HttpSession session) {
        boolean status = false;
        Connection con = null;
        try {
            con = GetConnection.getConnection();
            String sql = "select admin.id, admin.username,admin.unique_id,admin.email,admin.mobile,institutes.institute,designation.designation from admin inner join institutes on admin.institute_id = institutes.id inner join designation on admin.designation_id = designation.id where email = ? and password = ? and verify = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, a.getEmail());
            ps.setString(2, a.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                status = true;
                session.setAttribute("name", rs.getString("username"));
                session.setAttribute("uniqueId", rs.getString("unique_id"));
                session.setAttribute("email", a.getEmail());
                session.setAttribute("mobile", rs.getString("mobile"));
                session.setAttribute("institute", rs.getString("institute"));
                session.setAttribute("designation", rs.getString("designation"));
                
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

}
