package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Nutritionniste;

public interface NutritionnisteService {
	
	public List<Nutritionniste> findAll();
	
	public Nutritionniste findById(Long theId);
	
	public Nutritionniste save(Nutritionniste nutritionniste);
	
	public void deleteById(Long theId);

}
