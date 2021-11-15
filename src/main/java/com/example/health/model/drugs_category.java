package com.example.health.model;

import javax.persistence.*;

@Entity

@Table(name = "drugs_category")
public class drugs_category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String category_name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }
}
