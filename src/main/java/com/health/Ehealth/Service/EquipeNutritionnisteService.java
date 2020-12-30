package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.EquipeNutritionniste;
import com.health.Ehealth.Entities.Joueur;

public interface EquipeNutritionnisteService {
	
	public List<EquipeNutritionniste> findAll();
	
	public EquipeNutritionniste findById(Long theId);
	
	public EquipeNutritionniste save(EquipeNutritionniste equipeNutritionniste);
	
	public void deleteById(Long theId);

}
