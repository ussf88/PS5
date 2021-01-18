package com.health.Ehealth.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.health.Ehealth.Entities.EquipeCoach;

public interface EquipeCoachRepository extends JpaRepository<EquipeCoach, Long>{
	
	@Query("SELECT p FROM EquipeCoach p WHERE p.coach.id = ?1")
	 List<EquipeCoach> findByCoach( Long coachId);
	
	@Query("SELECT p FROM EquipeCoach p WHERE p.id = :Id")
	public EquipeCoach findBymyId(@Param("Id") Long Id);
}
