package com.example.health.DTO;

import java.io.Serializable;

  /*sohanur islam
  17/11/2021
  2:00PM*/
public class MasterReq implements Serializable {

    int id;
    String category;
    String dosageBrandStrength;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDosageBrandStrength() {
        return dosageBrandStrength;
    }

    public void setDosageBrandStrength(String dosageBrandStrength) {
        this.dosageBrandStrength = dosageBrandStrength;
    }
}
