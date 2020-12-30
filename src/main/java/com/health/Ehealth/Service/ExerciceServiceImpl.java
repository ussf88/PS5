package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.PlanningRepository;
import com.health.Ehealth.DAO.ExerciceRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Exercice;

@Service
public class ExerciceServiceImpl implements ExerciceService{
	
	@Autowired
	ExerciceRepository exerciceRepository;
	
	@Override
	public List<Exercice> findAll() {
		return exerciceRepository.findAll();
	}

	@Override
	public Exercice findById(Long theId) {
		Optional<Exercice> result = exerciceRepository.findById(theId);
		
		Exercice exercice = null;
		
		if (result.isPresent()) {
			exercice = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return exercice;
	}

	@Override
	public Exercice save(Exercice exercice) {
		return exerciceRepository.save(exercice);
	}

	@Override
	public void deleteById(Long theId) {
		exerciceRepository.deleteById(theId);
	}

}
