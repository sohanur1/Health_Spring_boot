package com.example.health.repository;

import com.example.health.DTO.MasterMedi;
import com.example.health.DTO.MasterReq;
import com.example.health.model.MasterMedicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import java.util.List;

/*sohanur islam
16/11/2021
10:00 AM*/
@Repository
public interface MasterMedicineRepository extends JpaRepository<MasterMedicine,Long> {
    // implement native query for get data from master medicine table
    @Query(value = "SELECT      demo.master_medicine.id as id,\n" +
            "            demo.master_medicine.manufacturer as manufacturer,\n" +
            "            demo.master_medicine.catagory as category,\n" +
            "            demo.master_medicine.dosage_brand_strength_old as dosageBrandStrengthOld,\n" +
            "            demo.master_medicine.dosage_description as dosageDescription,\n" +
            "            demo.master_medicine.brand_name as brandName,\n" +
            "            demo.master_medicine.strength_name as strengthName, \n" +
            "            demo.master_medicine.dosage_brand_strength as dosageBrandStrength,\n" +
            "            demo.master_medicine.brand_name_old as brandNameOld,\n" +
            "            demo.master_medicine.generic_name as genericName,\n" +
            "            demo.master_medicine.strength_old as strengthOld,\n" +
            "            demo.master_medicine.doases_description_old as doasesDescriptionOld,\n" +
            "            demo.master_medicine.usefor as useFor,\n" +
            "            demo.master_medicine.dar as dar,\n" +
            "            demo.drugs_category.category_name as categoryName \n" +
            "            FROM demo.master_medicine \n" +
            "             left join demo.drugs_category \n" +
            "            on demo.master_medicine.catagory=demo.drugs_category.id",nativeQuery = true)
    List<MasterMedi> medi();

    //implement native query for update data from master medicine
    @Modifying
    @Query(value = "update master_medicine" +
            " set master_medicine.catagory= :categoryId" +
            " where id = :id",nativeQuery = true)
    void medic(@Param("id") int id, @Param("categoryId") String categoryId);


}
