package com.example.health.repository;

import com.example.health.model.medicine_sub_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineSubCategoryRepository extends JpaRepository<medicine_sub_category,Long> {
}
