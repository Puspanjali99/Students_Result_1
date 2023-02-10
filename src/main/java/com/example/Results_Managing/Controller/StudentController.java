package com.example.Results_Managing.Controller;

import com.example.Results_Managing.Models.Student;
import com.example.Results_Managing.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping("/student")
    public class StudentController {
        @Autowired
        StudentService studentService;
        @PostMapping("/add")
        public String addStudent(@RequestBody Student student){
            return studentService.addStudent(student);
        }
        @GetMapping("/get_students")
        public List<Integer> getStudentsByRecentYear(){
            return studentService.getStudentsByRecentYear();
        }
}
