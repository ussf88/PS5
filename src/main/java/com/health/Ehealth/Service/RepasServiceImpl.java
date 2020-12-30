package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.PlanningRepository;
import com.health.Ehealth.DAO.RepasRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Repas;

@Service
public class RepasServiceImpl implements RepasService{
	
	@Autowired
	RepasRepository repasRepository;
	
	@Override
	public List<Repas> findAll() {
		return repasRepository.findAll();
	}

	@Override
	public Repas findById(Long theId) {
		Optional<Repas> result = repasRepository.findById(theId);
		
		Repas repas = null;
		
		if (result.isPresent()) {
			repas = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return repas;
	}

	@Override
	public Repas save(Repas repas) {
		return repasRepository.save(repas);
	}

	@Override
	public void deleteById(Long theId) {
		repasRepository.deleteById(theId);
	}

}
