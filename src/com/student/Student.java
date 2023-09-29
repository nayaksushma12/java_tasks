package com.student;

public class Student {
    private int id;
    private String name;
    private int rollNo;

    public Student(int id, String name, int rollNo) {
        this.id = id;
        this.name = name;
        this.rollNo = rollNo;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name= " + name +
                ", rollNo=" + rollNo;
    }

    public void changeName(String newName){
        this.name = newName;
    }

}
