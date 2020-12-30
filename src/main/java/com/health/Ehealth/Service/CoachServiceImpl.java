package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.Entities.Coach;

@Service
public class CoachServiceImpl implements CoachService{
	
	@Autowired
	CoachRepository coachRepository;
	
	@Override
	public List<Coach> findAll() {
		return coachRepository.findAll();
	}

	@Override
	public Coach findById(Long theId) {
		Optional<Coach> result = coachRepository.findById(theId);
		
		Coach coach = null;
		
		if (result.isPresent()) {
			coach = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return coach;
	}

	@Override
	public Coach save(Coach coach) {
		return coachRepository.save(coach);
	}

	@Override
	public void deleteById(Long theId) {
		coachRepository.deleteById(theId);
	}

}
