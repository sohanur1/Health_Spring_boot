package com.example.health.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="master_medicine")
public class MasterMedicine {
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

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getDosage_brand_strength_old() {
        return dosage_brand_strength_old;
    }

    public void setDosage_brand_strength_old(String dosage_brand_strength_old) {
        this.dosage_brand_strength_old = dosage_brand_strength_old;
    }

    public String getDosage_description() {
        return dosage_description;
    }

    public void setDosage_description(String dosage_description) {
        this.dosage_description = dosage_description;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getStrength_name() {
        return strength_name;
    }

    public void setStrength_name(String strength_name) {
        this.strength_name = strength_name;
    }

    public String getDosage_brand_strength() {
        return dosage_brand_strength;
    }

    public void setDosage_brand_strength(String dosage_brand_strength) {
        this.dosage_brand_strength = dosage_brand_strength;
    }

    public String getBrand_name_old() {
        return brand_name_old;
    }

    public void setBrand_name_old(String brand_name_old) {
        this.brand_name_old = brand_name_old;
    }

    public String getGeneric_name() {
        return generic_name;
    }

    public void setGeneric_name(String generic_name) {
        this.generic_name = generic_name;
    }

    public String getStrength_old() {
        return strength_old;
    }

    public void setStrength_old(String strength_old) {
        this.strength_old = strength_old;
    }

    public String getDoases_description_old() {
        return doases_description_old;
    }

    public void setDoases_description_old(String doases_description_old) {
        this.doases_description_old = doases_description_old;
    }

    public String getUsefor() {
        return usefor;
    }

    public void setUsefor(String usefor) {
        this.usefor = usefor;
    }

    public String getDar() {
        return dar;
    }

    public void setDar(String dar) {
        this.dar = dar;
    }
}
