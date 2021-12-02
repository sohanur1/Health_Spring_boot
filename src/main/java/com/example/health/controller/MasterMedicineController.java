package com.example.health.controller;

import com.example.health.DTO.MasterMedi;
import com.example.health.DTO.MasterReq;
import com.example.health.model.MasterMedicine;

import com.example.health.repository.MasterMedicineRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(maxAge = 3600)
@RestController

    /*sohanur islam
    12/11/2021
    11:30 AM*/
public class MasterMedicineController {

    @Autowired
    private MasterMedicineRepository masterMedicineRepository;

    public MasterMedicineController(MasterMedicineRepository masterMedicineRepository) {
        this.masterMedicineRepository = masterMedicineRepository;
    }

    // fetch master medicine
    @GetMapping("/api/master_medicine/join")
    public List<MasterMedi> fetchByMasterMedicine(){

        return masterMedicineRepository.medi();


    }
    // save master medicine
    @PostMapping("/api/master_medicine")
    public MasterMedicine saveMasterMedicine(@RequestBody MasterMedicine master){
        System.out.println("save controller");

       return masterMedicineRepository.save(master);

    }

    // update master medicine category
    @Transactional
    @PostMapping("/api/update/category")
    public Map<String, Object> updateRequired(@RequestBody MasterReq masterReq){
        Map<String, Object> response = new HashMap<>();

        try {
            masterMedicineRepository.medic(masterReq.getId(), masterReq.getCategory());
            response.put("success", true);
        }catch (Exception e){
            e.printStackTrace();
            response.put("success", false);
        }
        return response;
    }




}
