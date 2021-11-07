package com.example.health.controller;

import com.example.health.model.medicine_sub_category;
import com.example.health.repository.MedicineSubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
public class MedicineSubCategoryController {
    @Autowired
    private MedicineSubCategoryRepository medicineSubCategoryRepository;
    @GetMapping("/medicine_sub_category")
    public List<medicine_sub_category> fetchByMedicineSubCategory(){
        return medicineSubCategoryRepository.findAll();

    }
}
