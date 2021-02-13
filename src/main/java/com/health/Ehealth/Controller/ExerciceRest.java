package com.health.Ehealth.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Exercice;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Seance;
import com.health.Ehealth.Service.ExerciceService;
import com.health.Ehealth.Service.SeanceService;

@RestController
@CrossOrigin
public class ExerciceRest {
	@Autowired
	private ExerciceService exerciceService;
	
	@Autowired
	private SeanceService seanceService;
	
	
	@PostMapping("/seances/{theId}/exercice")
	public Exercice saveseanecExo(@RequestBody Exercice e,@PathVariable Long theId) {
		System.out.println("exo++++++"+e);
		Seance s=seanceService.findById(theId);
		List<Exercice> ls=s.getExercises();
		ls.add(e);
		s.setExercises(ls);
		seanceService.save(s);
		return e;
	}
	@PostMapping("/exercices")
	public Exercice saveExercice(@RequestBody Exercice exercice) {
           exercice.setId(0l);
		
           return exerciceService.save(exercice);
		
	}
	@GetMapping("/exercices/{theId}")
	public Exercice getExercice(@PathVariable Long theId) {
		
		Exercice exercice = exerciceService.findById(theId);
		
		if (exercice == null) {
			throw new RuntimeException("Exercicee id not found - " + theId);
		}
		
		return exercice;
	}
	@PutMapping("/exercice")
	public Exercice updateExercice(@RequestBody Exercice exercice) {
		
		exerciceService.save(exercice);
		
		return exercice;
	}
	@DeleteMapping("/exercices/{theId}")
	public String deleteExercice(@PathVariable Long theId) {
		
		Exercice exercice = exerciceService.findById(theId);
		
		if (exercice == null) {
			throw new RuntimeException("Exercice id not found - " + theId);
		}
		
		exerciceService.deleteById(theId);
		
		return "Deleted exercice id - " + theId;
	}
}
