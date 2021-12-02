package com.example.health.controller;

import com.example.health.model.DrugsCategory;
import com.example.health.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController

/** sohanur islam
 * 12/11/2021
 * 10:30 AM*/
public class DrugsCategoryController {
    @Autowired
    private HealthRepository healthRepository;

    //Fetch drugs category

    @GetMapping("/drug_category")
    public List<DrugsCategory> fetchByDrugCategory(){
        return healthRepository.findAll();
    }

}
