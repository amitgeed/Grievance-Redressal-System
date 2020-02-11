package com.instgrs.model;

public class Admin {
        private int id;
        private String username;
        private String uniqueId;
        private String email;
        private String mobile;
        private int instituteId;
        private String designationId;
        private String password;
        private int verify;

    public Admin(int id, String username, String uniqueId, String email, String mobile, int instituteId, String designationId, String password, int verify) {
        this.id = id;
        this.username = username;
        this.uniqueId = uniqueId;
        this.email = email;
        this.mobile = mobile;
        this.instituteId = instituteId;
        this.designationId = designationId;
        this.password = password;
        this.verify = verify;
    }

    public Admin(String username, String uniqueId, String email, String mobile, int instituteId, String designationId, String password) {
        this.username = username;
        this.uniqueId = uniqueId;
        this.email = email;
        this.mobile = mobile;
        this.instituteId = instituteId;
        this.designationId = designationId;
        this.password = password;
    }

    public Admin() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getDesignationId() {
        return designationId;
    }

    public void setDesignationId(String designationId) {
        this.designationId = designationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getVerify() {
        return verify;
    }

    public void setVerify(int verify) {
        this.verify = verify;
    }

    
}
