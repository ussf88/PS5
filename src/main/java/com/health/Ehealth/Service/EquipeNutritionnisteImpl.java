package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.EquipeCoachRepository;
import com.health.Ehealth.DAO.EquipeNutritionnisteRepository;
import com.health.Ehealth.DAO.JoueurRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.EquipeNutritionniste;
import com.health.Ehealth.Entities.Joueur;

@Service
public class EquipeNutritionnisteImpl implements EquipeNutritionnisteService{
	
	@Autowired
	EquipeNutritionnisteRepository equipeNutritionnisteRepository;
	
	@Override
	public List<EquipeNutritionniste> findAll() {
		return equipeNutritionnisteRepository.findAll();
	}

	@Override
	public EquipeNutritionniste findById(Long theId) {
		Optional<EquipeNutritionniste> result = equipeNutritionnisteRepository.findById(theId);
		
		EquipeNutritionniste equipeNutritionniste = null;
		
		if (result.isPresent()) {
			equipeNutritionniste = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return equipeNutritionniste;
	}

	@Override
	public EquipeNutritionniste save(EquipeNutritionniste equipeNutritionniste) {
		return equipeNutritionnisteRepository.save(equipeNutritionniste);
	}

	@Override
	public void deleteById(Long theId) {
		equipeNutritionnisteRepository.deleteById(theId);
	}

	@Override
	public List<EquipeNutritionniste> findByNutri(Long nutriId) {
		return equipeNutritionnisteRepository.findByCoach(nutriId);
	}

}
