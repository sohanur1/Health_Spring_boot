package com.example.health.repository;

import com.example.health.model.master_medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterMedicineRepository extends JpaRepository<master_medicine,Long> {
}
