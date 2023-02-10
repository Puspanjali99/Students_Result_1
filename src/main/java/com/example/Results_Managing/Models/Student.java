package com.example.Results_Managing.Models;

import jakarta.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int rollNo;
    private String Name;
    @Enumerated(EnumType.STRING)
    private Branch branch;
    private int marks;
    private int year;

    @ManyToOne
    @JoinColumn
    private HOD hod;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public HOD getHod() {
        return hod;
    }

    public void setHod(HOD hod) {
        this.hod = hod;
    }
    public Student(String branch){
        if(branch.equals(Branch.BT)){
            this.year=2019;
        }
        if(branch.equals(Branch.ME)){
            this.year=2020;

        }
        if(branch.equals(Branch.CSE)){

            this.year=2021;

        }
        if(branch.equals(Branch.IT)){
            this.year=2022;

        }
        if(branch.equals(Branch.EE)){
            this.year=2023;

        }
    }

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

