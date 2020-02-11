package com.instgrs.model;

public class Complaint {

    public static void sendEmail(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int id;
    private String name;
    private String uniqueId;
    private String email;
    private String mobile;
    private String institute;
    private String course;
    private String branch;
    private String designation;
    private String domain;
    private String problem;
    private String status;
    private String complaintDate;
    private String solveDate;

    public Complaint(int id, String name, String uniqueId, String email, String mobile, String institute, String course, String branch, String designation, String domain, String problem, String status, String complaintDate, String solveDate) {
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
        this.mobile = mobile;
        this.institute = institute;
        this.course = course;
        this.branch = branch;
        this.designation = designation;
        this.domain = domain;
        this.problem = problem;
        this.status = status;
        this.complaintDate = complaintDate;
        this.solveDate = solveDate;
    }

    public Complaint(String name, String uniqueId, String email, String mobile, String institute, String course, String branch, String designation, String domain, String problem, String status, String complaintDate, String solveDate) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
        this.mobile = mobile;
        this.institute = institute;
        this.course = course;
        this.branch = branch;
        this.designation = designation;
        this.domain = domain;
        this.problem = problem;
        this.status = status;
        this.complaintDate = complaintDate;
        this.solveDate = solveDate;
    }

    public Complaint() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComplaintDate() {
        return complaintDate;
    }

    public void setComplaintDate(String complaintDate) {
        this.complaintDate = complaintDate;
    }

    public String getSolveDate() {
        return solveDate;
    }

    public void setSolveDate(String solveDate) {
        this.solveDate = solveDate;
    }
    
    
}
