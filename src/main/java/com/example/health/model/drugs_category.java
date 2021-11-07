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
@Table(name = "drugs_category")
public class drugs_category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String category_name;
}
