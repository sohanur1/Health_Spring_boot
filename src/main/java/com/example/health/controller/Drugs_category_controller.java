package com.example.health.controller;

import com.example.health.model.drugs_category;
import com.example.health.repository.HealthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
public class Drugs_category_controller {
    @Autowired
    private HealthRepository healthRepository;

    @GetMapping("/drug_category")
    public List<drugs_category> fetchByDrugCategory(){
        return healthRepository.findAll();
    }

}
