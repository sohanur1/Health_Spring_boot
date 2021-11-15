package com.example.health.repository;

import com.example.health.model.MasterMedicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterMedicineRepository extends JpaRepository<MasterMedicine,Long> {
    @Query(value = "SELECT drugs_category.category_name FROM demo.master_medicine " +
            " left join demo.drugs_category " +
            "on demo.master_medicine.catagory=demo.drugs_category.id",nativeQuery = true)
    List<Object[]> medi();


}
