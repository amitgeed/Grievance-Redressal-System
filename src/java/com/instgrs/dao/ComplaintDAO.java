package com.instgrs.dao;
import com.instgrs.model.Complaint;
import com.instgrs.service.GetConnection;
import com.instgrs.service.ComplaintInfo;
import com.instgrs.service.SolvedComplaint;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import javax.servlet.SessionTrackingMode;
import javax.servlet.http.HttpSession;

public class ComplaintDAO {
    public static boolean registerComplaint(Complaint c){
        boolean status = false;
        Connection con = null;
        try{
            long time = System.currentTimeMillis();
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String date = sd.format(new java.util.Date(time));
            con = GetConnection.getConnection();
            String sql = "insert into complaint(name,unique_id,email,mobile,institute,course,branch,designation,domain,problem,complaint_date) values(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getName());
            ps.setString(2, c.getUniqueId());
            ps.setString(3, c.getEmail());
            ps.setString(4, c.getMobile());
            ps.setString(5, c.getInstitute());
            ps.setString(6, c.getCourse());
            ps.setString(7, c.getBranch());
            ps.setString(8, c.getDesignation());
            ps.setString(9, c.getDomain());
            ps.setString(10, c.getProblem());
            ps.setString(11, date);
            if(ps.executeUpdate()!=0){
                status = true;
                ComplaintInfo.sendEmail(c.getEmail(),c.getDomain(),date,c.getProblem());
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
    public static ArrayList<Complaint> getComplaint(HttpSession session){
        ArrayList<Complaint> al = new ArrayList<>();
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = null;
            if(session.getAttribute("designation").equals("Admin")){
            sql = "select * from complaint where institute = ?";    
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, session.getAttribute("institute").toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String uniqueId = rs.getString(3);
                String email = rs.getString(4);
                String mobile = rs.getString(5);
                String institute = rs.getString(6);
                String course = rs.getString(7);
                String branch = rs.getString(8);
                String designation = rs.getString(9);
                String domain = rs.getString(10);
                String problem = rs.getString(11);
                String status = rs.getString(12);
                String complaintDate = rs.getString(13);
                String solveDate = rs.getString(14);
                al.add(new Complaint(id, name, uniqueId, email, mobile, institute, course, branch, designation, domain, problem,status,complaintDate,solveDate));
            }
            }
            else if(session.getAttribute("designation").equals("Principal") || session.getAttribute("designation").equals("Registrar") || session.getAttribute("designation").equals("Server_Room") || session.getAttribute("designation").equals("Maintainance") || session.getAttribute("designation").equals("Transport_Incharge")){
            sql = "select * from complaint where institute = ? and domain = ?";    
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, session.getAttribute("institute").toString());
            ps.setString(2, session.getAttribute("designation").toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String uniqueId = rs.getString(3);
                String email = rs.getString(4);
                String mobile = rs.getString(5);
                String institute = rs.getString(6);
                String course = rs.getString(7);
                String branch = rs.getString(8);
                String designation = rs.getString(9);
                String domain = rs.getString(10);
                String problem = rs.getString(11);
                String status = rs.getString(12);
                String complaintDate = rs.getString(13);
                String solveDate = rs.getString(14);
                al.add(new Complaint(id, name, uniqueId, email, mobile, institute, course, branch, designation, domain, problem,status,complaintDate,solveDate));
            }
            }
            else if(session.getAttribute("designation").equals("Student") ||session.getAttribute("designation").equals("Staff")){
                sql = "select * from complaint where email = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,session.getAttribute("email").toString());
            
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String uniqueId = rs.getString(3);
                String email = rs.getString(4);
                String mobile = rs.getString(5);
                String institute = rs.getString(6);
                String course = rs.getString(7);
                String branch = rs.getString(8);
                String designation = rs.getString(9);
                String domain = rs.getString(10);
                String problem = rs.getString(11);
                String status = rs.getString(12);
                String complaintDate = rs.getString(13);
                String solveDate = rs.getString(14);
                al.add(new Complaint(id, name, uniqueId, email, mobile, institute, course, branch, designation, domain, problem,status,complaintDate,solveDate));
            }
            }
            else if(session.getAttribute("designation").equals("HOD")){
                sql = "select * from complaint where institute = ?  and branch = ? and domain = ?";    
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, session.getAttribute("institute").toString());
            ps.setString(2, session.getAttribute("branch").toString());
            ps.setString(3, session.getAttribute("designation").toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String uniqueId = rs.getString(3);
                String email = rs.getString(4);
                String mobile = rs.getString(5);
                String institute = rs.getString(6);
                String course = rs.getString(7);
                String branch = rs.getString(8);
                String designation = rs.getString(9);
                String domain = rs.getString(10);
                String problem = rs.getString(11);
                String status = rs.getString(12);
                String complaintDate = rs.getString(13);
                String solveDate = rs.getString(14);
                al.add(new Complaint(id, name, uniqueId, email, mobile, institute, course, branch, designation, domain, problem,status,complaintDate,solveDate));
            }
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
    public static boolean acceptComplaint(Complaint c){
        boolean status =false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "update complaint set status = 'Accepted' where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId());
            if(ps.executeUpdate()!=0){
                status = true;
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
    public static boolean solveComplaint(Complaint c){
        boolean status =false;
        Connection con = null;
        try{
            long time = System.currentTimeMillis();
            SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            String date = sd.format(new java.util.Date(time));
            con = GetConnection.getConnection();
            String sql = "update complaint set status = 'Solved', solve_date =? where id = ?";
            String sqll = "select * from complaint where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            PreparedStatement pss = con.prepareCall(sqll);
            pss.setInt(1, c.getId());
            ps.setString(1, date);
            ps.setInt(2, c.getId());
            ResultSet rs = pss.executeQuery();
            String email = null;
            String domain = null;
            String problem = null;
            while(rs.next()){
                email = rs.getString("email");
                domain = rs.getString("domain");
                problem = rs.getString("problem");
            }
            if(ps.executeUpdate()!=0){
                status = true;
                SolvedComplaint.sendEmail(email,c.getId(),domain,date,problem);
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
    public static boolean removeComplaint(Complaint c){
        boolean status =false;
        Connection con = null;
        try{
            con = GetConnection.getConnection();
            String sql = "update complaint set status = 'Removed' where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getId());
            if(ps.executeUpdate()!=0){
                status = true;
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
