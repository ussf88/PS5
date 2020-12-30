package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Joueur;

public interface JoueurService {
	
	public List<Joueur> findAll();
	
	public Joueur findById(Long theId);
	
	public Joueur save(Joueur joueur);
	
	public void deleteById(Long theId);

}
