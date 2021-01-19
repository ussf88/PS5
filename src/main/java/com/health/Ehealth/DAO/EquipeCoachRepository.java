package com.health.Ehealth.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.health.Ehealth.Entities.EquipeCoach;

public interface EquipeCoachRepository extends JpaRepository<EquipeCoach, Long>{
	
	@Query("SELECT equipeCoach FROM EquipeCoach equipeCoach WHERE equipeCoach.coach.id = ?1")
	 List<EquipeCoach> findByCoach( Long coachId);
}
