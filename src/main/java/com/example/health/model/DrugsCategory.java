package com.example.health.model;

import javax.persistence.*;

@Entity
@Table(name = "drugs_category")

/*sohanur islam
12/11/2021
9:00 AM*/
public class DrugsCategory {
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
