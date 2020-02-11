package com.instgrs.dao;

import com.instgrs.model.Institute;
import com.instgrs.service.GetConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class InstituteDAO {
    public static ArrayList<Institute> getInstitutes(){
        ArrayList<Institute> al = new ArrayList<>();
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select * from institutes";
            ResultSet rs = con.prepareStatement(sql).executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String institute = rs.getString(2);
                al.add(new Institute(id, institute));
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
