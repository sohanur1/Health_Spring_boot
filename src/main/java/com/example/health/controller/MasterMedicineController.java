package com.example.health.controller;

import com.example.health.DTO.MasterMedi;
import com.example.health.DTO.MasterReq;
import com.example.health.model.MasterMedicine;

import com.example.health.repository.MasterMedicineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(maxAge = 3600)
@RestController
public class MasterMedicineController {

    @Autowired
    private MasterMedicineRepository masterMedicineRepository;

    public MasterMedicineController(MasterMedicineRepository masterMedicineRepository) {
        this.masterMedicineRepository = masterMedicineRepository;
    }

    @GetMapping("/api/master_medicine/join")
    public List<MasterMedi> fetchByMasterMedicine(){

        return masterMedicineRepository.medi();






//        List<MasterMedicine> medicineList = new ArrayList<>();
//        System.out.println("Get Controller");
//        try{
//            medicineList = masterMedicineRepository.findAll();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return medicineList;
    }
    @PostMapping("/api/master_medicine")
    public MasterMedicine saveMasterMedicine(@RequestBody MasterMedicine master){
        System.out.println("save controller");

       return masterMedicineRepository.save(master);

    }

    @PostMapping("/api/update/category")
    public MasterReq updateRequired(@RequestBody MasterReq masterMedicine){
//        Map<String, Object> response = new HashMap<>();

        MasterReq masterReq= new MasterReq();

        try {
            masterReq = masterMedicineRepository.medic(masterMedicine.getId(), masterMedicine.getCategory());
        }catch (Exception e){

        }
        return masterReq;
    }




}
