package com.instgrs.dao;

import com.instgrs.model.Admin;
import com.instgrs.service.GetConnection;
import com.instgrs.service.UpdatePassword;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDAO {
    public static boolean updatePassword(Admin u){
        boolean status = false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "update admin set password = ?, verify = 0 where email = ?";
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
