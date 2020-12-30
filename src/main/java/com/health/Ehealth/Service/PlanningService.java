package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;

public interface PlanningService {
	
	public List<Planning> findAll();
	
	public Planning findById(Long theId);
	
	public Planning save(Planning planning);
	
	public void deleteById(Long theId);

}
