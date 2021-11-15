package com.example.health.repository;

import com.example.health.model.MasterMedicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterMedicineRepository extends JpaRepository<MasterMedicine,Long> {
}
