package com.example.Results_Managing.Service;

import com.example.Results_Managing.Models.HOD;
import com.example.Results_Managing.Models.Student;
import com.example.Results_Managing.Repository.HODRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HODService {
    @Autowired
    HODRepository hodRepository;

    public String addHod(HOD hod) {
        hodRepository.save(hod);
        return "HOD added successfully";
    }

    public String getHodMobile() {
        String hodMob = "";
        List<HOD> hodList = hodRepository.findAll();
        int maxCountOfPassingStudents = 0;
        for (HOD hod : hodList) {
            int countOfPassingStudents = 0;
            for (Student student : hod.getStudentList()) {
                if (student.getMarks() >= 40) {
                    countOfPassingStudents++;
                }
            }
            if (countOfPassingStudents > maxCountOfPassingStudents) {
                maxCountOfPassingStudents = countOfPassingStudents;
                hodMob = hod.getMobile();
            }
        }
        return hodMob;
    }
}

