package com.instgrs.model;

public class User {
 private int id;
 private String name;
 private String uniqueId;
 private String email;
 private String mobile;
 private int instituteId;
 private int courseId;
 private int branchId;
 private int designationId;
 private String password;

    public User(int id, String name, String uniqueId, String email, String mobile, int instituteId, int courseId, int branchId, int designationId, String password) {
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
        this.mobile = mobile;
        this.instituteId = instituteId;
        this.courseId = courseId;
        this.branchId = branchId;
        this.designationId = designationId;
        this.password = password;
    }

    public User(String name, String uniqueId, String email, String mobile, int instituteId, int courseId, int branchId, int designationId, String password) {
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
        this.mobile = mobile;
        this.instituteId = instituteId;
        this.courseId = courseId;
        this.branchId = branchId;
        this.designationId = designationId;
        this.password = password;
    }

    public User() {
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

    public int getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public int getDesignationId() {
        return designationId;
    }

    public void setDesignationId(int designationId) {
        this.designationId = designationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
}
