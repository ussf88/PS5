package com.health.Ehealth.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.health.Ehealth.Entities.EquipeNutritionniste;

public interface EquipeNutritionnisteRepository 
extends JpaRepository<EquipeNutritionniste, Long>{
	
	@Query("SELECT equipeNutritionniste FROM EquipeNutritionniste equipeNutritionniste WHERE equipeNutritionniste.nutritionniste.id = ?1")
	List<EquipeNutritionniste> findByCoach(Long nutriId);

}
