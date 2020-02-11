package com.instgrs.model;

public class Branch {
    private int id;
    private String branch;
    private int courseId;

    public Branch(int id, String branch, int courseId) {
        this.id = id;
        this.branch = branch;
        this.courseId = courseId;
    }

    public Branch(String branch, int courseId) {
        this.branch = branch;
        this.courseId = courseId;
    }

    public Branch() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    
}
