package com.health.Ehealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.Ehealth.DAO.CoachRepository;
import com.health.Ehealth.DAO.JoueurRepository;
import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Joueur;

@Service
public class JoueurServiceImpl implements JoueurService{
	
	@Autowired
	JoueurRepository joueurRepository;
	
	@Override
	public List<Joueur> findAll() {
		return joueurRepository.findAll();
	}

	@Override
	public Joueur findById(Long theId) {
		Optional<Joueur> result = joueurRepository.findById(theId);
		
		Joueur joueur = null;
		
		if (result.isPresent()) {
			joueur = result.get();
		}
		else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		
		return joueur;
	}

	@Override
	public Joueur save(Joueur joueur) {
		return joueurRepository.save(joueur);
	}

	@Override
	public void deleteById(Long theId) {
		joueurRepository.deleteById(theId);
	}

}
