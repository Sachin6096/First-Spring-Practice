package com.example.firsproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo)
    {
        return studentService.getStudent(regNo);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student)
    {
       return studentService.addStudent(student);

    }

    @GetMapping("/getByPath/{id}")
    public Student getBypath(@PathVariable("id") int regNo)
    {
        return studentService.getByPath(regNo);
    }

    @PutMapping("/update-age")
    public Student updateage(@RequestParam("q") int regNo,@RequestParam("age") int newAge)
    {
        return studentService.updateage(regNo,newAge);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("q") int regNo)
    {
        return studentService.delete(regNo);
    }

    @DeleteMapping("/deletepath/{id}")
    public String deletebypath(@PathVariable("id") int regNo)
    {

        return studentService.deletebypath(regNo);
    }

    @PutMapping("/updateCourse")
    public Student updatecourse(@RequestParam("q") int regNo, @RequestParam("c") String newCourse)
    {
        return studentService.updatecourse(regNo,newCourse);
    }

    @PutMapping("/updateCourseByPath/{q}/{c}")
    public Student updateCourseByPath(@PathVariable("q") int regNo, @PathVariable("c") String newCourse)
    {
        return studentService.updatecourseByPath(regNo,newCourse);
    }

    @PutMapping("/changeCourse/{q}")
    public Student changeCourse(@PathVariable("q")int regNo, @RequestParam("c") String newCourse)
    {
        return studentService.changeCourse(regNo,newCourse);
    }

    @PutMapping("/changeCourseWithBody")
    public Student changeCourseWithBody(@RequestParam("q") int regNo, @RequestBody Student s)
    {
        return studentService.changeCourseWithBody(regNo,s);
    }
}
