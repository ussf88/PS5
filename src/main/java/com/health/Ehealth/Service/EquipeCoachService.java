package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.Joueur;

public interface EquipeCoachService {
	
	public List<EquipeCoach> findAll();
	
	public List<EquipeCoach> findByCoach(Long coachId);
	public EquipeCoach findById(Long theId);
	
	public EquipeCoach save(EquipeCoach equipeCoach);
	
	public void deleteById(Long theId);

}
