package com.nutrition.nutrition.Repository;

import com.nutrition.nutrition.Model.Entity.NutritionalTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NutritionalTableRepository extends JpaRepository<NutritionalTable, Integer> {
}
