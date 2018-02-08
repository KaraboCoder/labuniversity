package com.lab.university.enrollment;

import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;
    private int capacity;
    private static int numberOfCourses = 0;

    public Course(String name, int capacity) {
        this.name = name;
        this.students = new ArrayList<Student>();
        this.capacity = capacity;
        numberOfCourses++;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static void setNumberOfCourses(int numberOfCourses) {
        Course.numberOfCourses = numberOfCourses;
    }

    public static int getNumberOfCourses() {
        return numberOfCourses;
    }

    public boolean enrollStudent(Student s){
        if(this.students.size() < this.capacity) {
            return this.students.add(s);
        }else {
            return false;
        }
    }

    public boolean unenrollStudent(Student s){
        return this.students.remove(s);
    }

}