package com.health.Ehealth.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.DAO.JoueurRepository;
import com.health.Ehealth.Entities.Joueur;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class JoueurRest {	

	@Autowired
	JoueurRepository joueurRepository;
	
	@GetMapping("/users")
	public List<Joueur> GetUsers() {
		return joueurRepository.findAll();
		
	}
	@PostMapping("/adduser")
	public List<Joueur> AddUsers(@RequestBody final Joueur joueur ){
		joueurRepository.save(joueur);
		return joueurRepository.findAll();
	}

}
