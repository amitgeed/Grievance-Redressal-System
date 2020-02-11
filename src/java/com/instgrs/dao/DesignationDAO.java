package com.instgrs.dao;

import com.instgrs.model.Designation;
import com.instgrs.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DesignationDAO {
    public static ArrayList<Designation> getDesignation(){
       ArrayList<Designation> al = new ArrayList<>();
       Connection con = null; 
       try{
           con = GetConnection.getConnection();
           String sql = "select * from designation";
           PreparedStatement ps = con.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           while(rs.next()){
               int id = rs.getInt(1);
               String designation = rs.getString(2);
               al.add(new Designation(id, designation));
           }
       }
       catch(Exception ex){
           ex.printStackTrace();
       }
       finally{
           try {
               con.close();
           } 
           catch (Exception e) {
               e.printStackTrace();
           }
       }
       return al;
    }
}
