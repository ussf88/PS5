package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Seance;

public interface SeanceService {
	
	public List<Seance> findAll();
	
	public Seance findById(Long theId);
	
	public Seance save(Seance seance);
	
	public void deleteById(Long theId);

}
