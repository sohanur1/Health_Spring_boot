package com.example.health.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="master_medicine")
public class master_medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;

    private String manufacturer;
    private String catagory;
    private String dosage_brand_strength_old;
    private  String dosage_description;
    private String brand_name;
    private  String strength_name;
    private String dosage_brand_strength;
    private String brand_name_old;
    private String generic_name;
    private String strength_old;
    private String doases_description_old;
    private  String usefor;
    private String dar;

}
