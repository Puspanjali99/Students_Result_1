package com.example.Results_Managing.Repository;

import com.example.Results_Managing.Models.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
@Transactional
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
