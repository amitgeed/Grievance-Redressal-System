package com.instgrs.model;

public class Designation {
    private int id;
    private String designation;

    public Designation(int id, String designation) {
        this.id = id;
        this.designation = designation;
    }

    public Designation(String designation) {
        this.designation = designation;
    }

    public Designation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    
}
