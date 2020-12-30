package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;

public interface CoachService {
	
	public List<Coach> findAll();
	
	public Coach findById(Long theId);
	
	public Coach save(Coach coach);
	
	public void deleteById(Long theId);

}
