package com.instgrs.model;

public class Courses {
    private int id;
    private String course;
    private int instituteId;

    public Courses(int id, String course, int instituteId) {
        this.id = id;
        this.course = course;
        this.instituteId = instituteId;
    }

    public Courses(String course, int instituteId) {
        this.course = course;
        this.instituteId = instituteId;
    }

    public Courses() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getInstituteId() {
        return instituteId;
    }

    public void setInstituteId(int instituteId) {
        this.instituteId = instituteId;
    }
    
}
