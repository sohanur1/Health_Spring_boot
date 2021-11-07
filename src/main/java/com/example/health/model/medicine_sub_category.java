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
@Table(name = "medicine_sub_category")
public class medicine_sub_category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String category_id;
    private String sub_category_name;
}
