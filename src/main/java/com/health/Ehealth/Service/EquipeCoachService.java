package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.Joueur;

public interface EquipeCoachService {
	
	public List<EquipeCoach> findAll();
	
	public EquipeCoach findById(Long theId);
	
	public EquipeCoach save(EquipeCoach equipeCoach);
	
	public void deleteById(Long theId);

}
