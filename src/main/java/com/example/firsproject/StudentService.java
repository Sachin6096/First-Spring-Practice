package com.example.firsproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {


    @Autowired
    StudentRepo studentRepo;



    public Student getStudent(int regNo) {

        return studentRepo.getStudent(regNo);
    }

    public Student updateage(int regNo, int newAge) {
        return studentRepo.updateage(regNo,newAge);
    }

    public Student getByPath(int regNo) {
        return studentRepo.getByPath(regNo);
    }

    public String addStudent(Student student) {
        studentRepo.addStudent(student);
        return "Student added successfully!!";
    }

    public String delete(int regNo) {
        studentRepo.delete(regNo);
        return "Student has been removed";
    }

    public String deletebypath(int regNo) {
        studentRepo.deletebypath(regNo);
        return "Student has been removed successfully";
    }

    public Student updatecourse(int regNo, String newCourse) {
        return studentRepo.updatecourse(regNo,newCourse);
    }

    public Student updatecourseByPath(int regNo, String newCourse) {
        return studentRepo.updatecourseByPath(regNo,newCourse);
    }

    public Student changeCourse(int regNo, String newCourse) {
        return studentRepo.changeCourse(regNo,newCourse);
    }

    public Student changeCourseWithBody(int regNo, Student s) {
        return studentRepo.changeCourseWithBody(regNo,s);
    }
}
