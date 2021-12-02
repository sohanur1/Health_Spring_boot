package com.example.health.model;


import javax.persistence.*;

@Entity
@Table(name = "medicine_sub_category")

/*sohanur islam
13/11/2021
4:23 PM*/
public class MedicineSubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String category_id;
    private String sub_category_name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getSub_category_name() {
        return sub_category_name;
    }

    public void setSub_category_name(String sub_category_name) {
        this.sub_category_name = sub_category_name;
    }
}
