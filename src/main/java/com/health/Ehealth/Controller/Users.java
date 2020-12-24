package com.health.Ehealth.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.EquipeNutritionniste;
import com.health.Ehealth.Entities.Joueur;
import com.health.Ehealth.Repositories.UserRepository;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Users {	

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/users")
	public List<Joueur> GetUsers() {
		return userRepository.findAll();
		
	}
	
	@PostMapping("/adduser")
	public List<Joueur> AddUsers(@RequestBody final Joueur joueur ){
		userRepository.save(joueur);
		return userRepository.findAll();
	}

}
