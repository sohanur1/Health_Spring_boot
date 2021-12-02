package com.example.health.repository;

import com.example.health.model.DrugsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*sohanur islam
13/11/2021*/
@Repository
public interface HealthRepository extends JpaRepository<DrugsCategory,Long> {
}
