package com.example.firsproject;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepo {

    HashMap<Integer,Student> db = new HashMap<>();

    public Student getStudent(int regNo) {
        return db.get(regNo);
    }

    public Student updateage(int regNo, int newAge) {
        db.get(regNo).setAge(newAge);
        return db.get(regNo);
    }

    public void addStudent(Student student) {
        db.put(student.getRegNo(), student);
    }

    public void delete(int regNo) {
        db.remove(regNo);
    }

    public void deletebypath(int regNo) {
        db.remove(regNo);
    }

    public Student updatecourse(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student getByPath(int regNo) {
        return db.get(regNo);

    }

    public Student changeCourseWithBody(int regNo, Student s) {
        db.get(regNo).setCourse(s.getCourse());
        return db.get(regNo);
    }

    public Student updatecourseByPath(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }

    public Student changeCourse(int regNo, String newCourse) {
        db.get(regNo).setCourse(newCourse);
        return db.get(regNo);
    }
}
