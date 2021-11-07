package com.example.health.controller;

import com.example.health.model.master_medicine;
import com.example.health.repository.MasterMedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
public class MasterMedicineController {
    @Autowired
    private MasterMedicineRepository masterMedicineRepository;
    @GetMapping("/master_medicine")
    public List<master_medicine> fetchByMasterMedicine(){
        return masterMedicineRepository.findAll();

    }
}
