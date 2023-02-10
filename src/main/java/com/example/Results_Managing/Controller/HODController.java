package com.example.Results_Managing.Controller;

import com.example.Results_Managing.Models.HOD;
import com.example.Results_Managing.Service.HODService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class HODController {
    @Autowired
    HODService hodService;

    @PostMapping("/add")
    public String addHod(@RequestBody HOD hod){
        return hodService.addHod(hod);
    }
    @GetMapping("hod_having_max_passing_students")
    public String getHodMob(){
        return hodService.getHodMobile();
    }
}
