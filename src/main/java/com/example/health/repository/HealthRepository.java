package com.example.health.repository;

import com.example.health.model.drugs_category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HealthRepository extends JpaRepository<drugs_category,Long> {
}
