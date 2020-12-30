package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.SeanceRepository;
import com.health.Ehealth.Entities.Seance;

@Service
public class SeanceServiceImpl implements SeanceService{
	
	@Autowired
	SeanceRepository seanceRepository;
	
	@Override
	public List<Seance> findAll() {
		return seanceRepository.findAll();
	}

	@Override
	public Seance findById(Long theId) {
		Optional<Seance> result = seanceRepository.findById(theId);
		
		Seance seance = null;
		
		if (result.isPresent()) {
			seance = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return seance;
	}

	@Override
	public Seance save(Seance seance) {
		return seanceRepository.save(seance);
	}

	@Override
	public void deleteById(Long theId) {
		seanceRepository.deleteById(theId);
	}

}
