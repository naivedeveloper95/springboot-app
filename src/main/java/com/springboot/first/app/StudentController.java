package com.springboot.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @GetMapping("/student")
    public Student getStudent() {
        return new Student("Ramesh", "Kumar");
    }

    @GetMapping("students")
    public List<Student> getStrudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramesh", "Kumar"));
        students.add(new Student("Somesh", "Kumar"));
        students.add(new Student("Lokesh", "Kumar"));
        students.add(new Student("Sarvesh", "Kumar"));
        students.add(new Student("Nikesh", "Kumar"));
        students.add(new Student("Suresh", "Kumar"));

        return students;
    }

}
