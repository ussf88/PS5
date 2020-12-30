package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.NutritionnisteRepository;
import com.health.Ehealth.Entities.Nutritionniste;

@Service
public class NutritionnisteServiceImpl implements NutritionnisteService{
	
	@Autowired
	NutritionnisteRepository nutritionnisteRepository;
	
	@Override
	public List<Nutritionniste> findAll() {
		return nutritionnisteRepository.findAll();
	}

	@Override
	public Nutritionniste findById(Long theId) {
		Optional<Nutritionniste> result = nutritionnisteRepository.findById(theId);
		
		Nutritionniste nutritionniste = null;
		
		if (result.isPresent()) {
			nutritionniste = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return nutritionniste;
	}

	@Override
	public Nutritionniste save(Nutritionniste nutritionniste) {
		return nutritionnisteRepository.save(nutritionniste);
	}

	@Override
	public void deleteById(Long theId) {
		nutritionnisteRepository.deleteById(theId);
	}

}
