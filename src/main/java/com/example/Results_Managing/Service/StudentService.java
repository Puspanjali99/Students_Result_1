package com.example.Results_Managing.Service;

import com.example.Results_Managing.Models.HOD;
import com.example.Results_Managing.Models.Student;
import com.example.Results_Managing.Repository.HODRepository;
import com.example.Results_Managing.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    HODRepository hodRepository;
    public String addStudent(Student student){
        String branch= String.valueOf(student.getBranch());
        HOD hod=hodRepository.findByBranch(branch);
        List<Student> studentsList=hod.getStudentList();
        studentsList.add(student);
        hod.setStudentList(studentsList);
        student.setHod(hod);
        hodRepository.save(hod);
        return "student saved";
    }
    public List<Integer> getStudentsByRecentYear(){
        List<Integer> rollNos=new ArrayList<>();
        List<Student> studentsList=studentRepository.findAll();
        for(Student student : studentsList){
            if(student.getYear()==2020){
                rollNos.add(student.getRollNo());
            }
        }
        return rollNos;
    }
}
