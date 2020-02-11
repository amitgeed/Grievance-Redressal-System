package com.instgrs.model;

public class Institute {
    private int id;
    private String institute;

    public Institute(int id, String institute) {
        this.id = id;
        this.institute = institute;
    }

    public Institute(String institute) {
        this.institute = institute;
    }

    public Institute() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
    }
    
}
