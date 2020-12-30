package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.PlanningRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;

@Service
public class PlanningServiceImpl implements PlanningService{
	
	@Autowired
	PlanningRepository planningRepository;
	
	@Override
	public List<Planning> findAll() {
		return planningRepository.findAll();
	}

	@Override
	public Planning findById(Long theId) {
		Optional<Planning> result = planningRepository.findById(theId);
		
		Planning planning = null;
		
		if (result.isPresent()) {
			planning = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return planning;
	}

	@Override
	public Planning save(Planning planning) {
		return planningRepository.save(planning);
	}

	@Override
	public void deleteById(Long theId) {
		planningRepository.deleteById(theId);
	}

}
