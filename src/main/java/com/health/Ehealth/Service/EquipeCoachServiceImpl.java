package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.EquipeCoachRepository;
import com.health.Ehealth.DAO.JoueurRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.Joueur;

@Service
public class EquipeCoachServiceImpl implements EquipeCoachService{
	
	@Autowired
	EquipeCoachRepository equipeCoachRepository;
	
	@Override
	public List<EquipeCoach> findAll() {
		return equipeCoachRepository.findAll();
	}

	@Override
	public EquipeCoach findById(Long theId) {
		Optional<EquipeCoach> result = equipeCoachRepository.findById(theId);
		
		EquipeCoach equipeCoach = null;
		
		if (result.isPresent()) {
			equipeCoach = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return equipeCoach;
	}

	@Override
	public EquipeCoach save(EquipeCoach equipeCoach) {
		return equipeCoachRepository.save(equipeCoach);
	}

	@Override
	public void deleteById(Long theId) {
		equipeCoachRepository.deleteById(theId);
	}

}
