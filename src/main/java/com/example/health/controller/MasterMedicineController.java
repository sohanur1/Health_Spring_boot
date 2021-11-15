package com.example.health.controller;

import com.example.health.model.MasterMedicine;
import com.example.health.repository.MasterMedicineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(maxAge = 3600)
@RestController
public class MasterMedicineController {

    @Autowired
    private MasterMedicineRepository masterMedicineRepository;

    public MasterMedicineController(MasterMedicineRepository masterMedicineRepository) {
        this.masterMedicineRepository = masterMedicineRepository;
    }

    @GetMapping("/master_medicine")
    public List<MasterMedicine> fetchByMasterMedicine(){
        List<MasterMedicine> medicineList = new ArrayList<>();
        System.out.println("Get Controller");
        try{
            medicineList = masterMedicineRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }

        return medicineList;
    }
    @PostMapping("/master_medicine")
    private MasterMedicine saveMasterMedicine(@RequestBody MasterMedicine master){
        System.out.println("save controller");

       return masterMedicineRepository.save(master);

    }
    @GetMapping("/master_medicine/user")
    public List<Object[]>  getMed(){
        return masterMedicineRepository.medi();
    }

}
