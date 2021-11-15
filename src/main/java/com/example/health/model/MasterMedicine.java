package com.example.health.model;



import javax.persistence.*;

@Entity
@Table(name="master_medicine")
public class MasterMedicine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(name = "manufacturer")
    private String Manufacturer;
    @Column(name = "catagory")
    private String Category;
    @Column(name = "dosage_brand_strength_old")
    private String DosageBrandStrengthOld;
    @Column(name = "dosage_description")
    private  String DosageDescription;
    @Column(name = "brand_name")
    private String BrandName;
    @Column(name = "strength_name")
    private  String StrengthName;
    @Column(name = "dosage_brand_strength")
    private String DosageBrandStrength;
    @Column(name = "brand_name_old")
    private String BrandNameOld;
    @Column(name = "generic_name")
    private String GenericName;
    @Column(name = "strength_old")
    private String StrengthOld;
    @Column(name = "doases_description_old")
    private String DosagesDescriptionOld;
    @Column(name = "usefor")
    private  String UseFor;
    @Column(name = "dar")
    private String Dar;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDosageBrandStrengthOld() {
        return DosageBrandStrengthOld;
    }

    public void setDosageBrandStrengthOld(String dosageBrandStrengthOld) {
        DosageBrandStrengthOld = dosageBrandStrengthOld;
    }

    public String getDosageDescription() {
        return DosageDescription;
    }

    public void setDosageDescription(String dosageDescription) {
        DosageDescription = dosageDescription;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String brandName) {
        BrandName = brandName;
    }

    public String getStrengthName() {
        return StrengthName;
    }

    public void setStrengthName(String strengthName) {
        StrengthName = strengthName;
    }

    public String getDosageBrandStrength() {
        return DosageBrandStrength;
    }

    public void setDosageBrandStrength(String dosageBrandStrength) {
        DosageBrandStrength = dosageBrandStrength;
    }

    public String getBrandNameOld() {
        return BrandNameOld;
    }

    public void setBrandNameOld(String brandNameOld) {
        BrandNameOld = brandNameOld;
    }

    public String getGenericName() {
        return GenericName;
    }

    public void setGenericName(String genericName) {
        GenericName = genericName;
    }

    public String getStrengthOld() {
        return StrengthOld;
    }

    public void setStrengthOld(String strengthOld) {
        StrengthOld = strengthOld;
    }

    public String getDosagesDescriptionOld() {
        return DosagesDescriptionOld;
    }

    public void setDosagesDescriptionOld(String dosagesDescriptionOld) {
        DosagesDescriptionOld = dosagesDescriptionOld;
    }

    public String getUseFor() {
        return UseFor;
    }

    public void setUseFor(String useFor) {
        UseFor = useFor;
    }

    public String getDar() {
        return Dar;
    }

    public void setDar(String dar) {
        Dar = dar;
    }
}
