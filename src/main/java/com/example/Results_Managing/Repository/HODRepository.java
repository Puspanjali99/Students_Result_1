package com.example.Results_Managing.Repository;

import com.example.Results_Managing.Models.HOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface HODRepository extends JpaRepository<HOD,Integer> {

    @Query(value = "select * from hod b where b.branch =:branch", nativeQuery = true)
    HOD findByBranch(String branch);
}
