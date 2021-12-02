package com.example.health.controller;

import com.example.health.model.MedicineSubCategory;
import com.example.health.repository.MedicineSubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController

  /*sohanur islam
  12/11/2021
  12:20 PM*/
public class MedicineSubCategoryController {
    @Autowired
    private MedicineSubCategoryRepository medicineSubCategoryRepository;

    //create  get API for master sub category
    @GetMapping("/medicine_sub_category")
    public List<MedicineSubCategory> fetchByMedicineSubCategory(){
        return medicineSubCategoryRepository.findAll();

    }
}
