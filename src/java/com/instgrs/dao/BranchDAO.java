package com.instgrs.dao;

import com.instgrs.model.Branch;
import com.instgrs.service.GetConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BranchDAO {
    public static ArrayList<Branch> getBranch(Branch branch){
        ArrayList<Branch> al = new ArrayList<>();
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "select * from branch where course_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, branch.getCourseId());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Branch b = new Branch(id, name, branch.getCourseId());
                al.add(b);
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
