package com.lab.university.enrollment;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class testStudent {

    Student student1, student2, student3;
    Course course1, course2;

    @Before
    public void init(){
        student1 = new Student("Karabo Slim", 100, "25-06-92");
        student2 = new Student("Node Chromy", 101, "25-05-91");
        student3 = new Student("Jason Mongo", 102, "25-06-92");

        course1 = new Course("Mongo DB", 15);
        course2 = new Course("Slim", 1);
    }

    @Test
    public void testStudentWithInavlidParameters(){
        Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
            Student newStudent = new Student("", 0, "");
        });
        assertEquals("Invalid arguments", exception.getMessage());
    }

    @Test
    public void testStudentWithValidParameters(){
        Student student = new Student("Karabo Ngwato", 1234, "25-06-92");
        assertEquals(Student.class, student.getClass());
    }

    @Test
    public void testStudentProperties(){
        assertEquals("Karabo Slim", student1.getName());
        student1.setName("Long Man");
        assertEquals("Long Man", student1.getName());
        assertEquals(100, student1.getStudentNumber());
    }

    @Test
    public void testCoursesAndStudentEnrollment(){
        assertEquals("Mongo DB", course1.getName());
        assertEquals(0, course1.getStudents().size());
        assertEquals(2, Course.getNumberOfCourses());
        assertTrue(course1.enrollStudent(student1));
        assertEquals(1, course1.getStudents().size());
        course1.setCapacity(2);
        assertTrue(course1.enrollStudent(student2));
        assertFalse(course1.enrollStudent(student3));
        assertTrue(course1.unenrollStudent(student1));
    }

}
