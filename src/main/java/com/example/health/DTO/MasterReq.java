package com.example.health.DTO;

public class MasterReq {

    int Id;
    String Category;
    String DosageBrandStrength;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getDosageBrandStrength() {
        return DosageBrandStrength;
    }

    public void setDosageBrandStrength(String dosageBrandStrength) {
        DosageBrandStrength = dosageBrandStrength;
    }
}
