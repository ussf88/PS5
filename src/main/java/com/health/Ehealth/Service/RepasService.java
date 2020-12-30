package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Repas;

public interface RepasService {
	
	public List<Repas> findAll();
	
	public Repas findById(Long theId);
	
	public Repas save(Repas repas);
	
	public void deleteById(Long theId);

}
