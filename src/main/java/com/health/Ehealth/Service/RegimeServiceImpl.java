package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.PlanningRepository;
import com.health.Ehealth.DAO.RegimeRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Regime;

@Service
public class RegimeServiceImpl implements RegimeService{
	
	@Autowired
	RegimeRepository regimeRepository;
	
	@Override
	public List<Regime> findAll() {
		return regimeRepository.findAll();
	}

	@Override
	public Regime findById(Long theId) {
		Optional<Regime> result = regimeRepository.findById(theId);
		
		Regime regime = null;
		
		if (result.isPresent()) {
			regime = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return regime;
	}

	@Override
	public Regime save(Regime Regime) {
		return regimeRepository.save(Regime);
	}

	@Override
	public void deleteById(Long theId) {
		regimeRepository.deleteById(theId);
	}

}
