package com.lab.university.enrollment;

public class Student {
    private String name;
    private int studentNumber;
    private String dob;

    public Student(String name, int studentNumber, String dob) throws IllegalArgumentException {
        if(name.isEmpty() || dob.isEmpty() || studentNumber == 0)
        {
            throw new IllegalArgumentException("Invalid arguments");
        }
        this.name = name;
        this.studentNumber = studentNumber;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}


//A private String variable named “name” to store the student’s name
//        A private integer variable named “studentNumber” that contains the unique ID number for this student
//        A private String variable named “dob” to store the student’s date of birth
//        A public constructor Student(String name, int studentNumber, String dob)
//        Several public get/set methods for all the properties
//        getName/setName
//        getStudentNumber/setStudentNumber
//        getDob/setDo