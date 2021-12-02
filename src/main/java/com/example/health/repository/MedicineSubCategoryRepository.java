package com.example.health.repository;

import com.example.health.model.MedicineSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*sohanur islam
12/11/2021*/
@Repository
public interface MedicineSubCategoryRepository extends JpaRepository<MedicineSubCategory,Long> {
}
