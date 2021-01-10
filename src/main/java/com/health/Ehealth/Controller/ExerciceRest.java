package com.health.Ehealth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Exercice;
import com.health.Ehealth.Service.ExerciceService;

@RestController
public class ExerciceRest {
	@Autowired
	private ExerciceService exerciceService;
	@PostMapping("/exercices")
	public Exercice saveCoach(@RequestBody Exercice exercice) {
           exercice.setId(0l);
		
           return exerciceService.save(exercice);
		
	}
	@GetMapping("/exercices/{theId}")
	public Exercice getCoach(@PathVariable Long theId) {
		
		Exercice exercice = exerciceService.findById(theId);
		
		if (exercice == null) {
			throw new RuntimeException("Exercicee id not found - " + theId);
		}
		
		return exercice;
	}
	@PutMapping("/exercice")
	public Exercice updateCoach(@RequestBody Exercice exercice) {
		
		exerciceService.save(exercice);
		
		return exercice;
	}
	@DeleteMapping("/exercices/{eheId}")
	public String deleteCoach(@PathVariable Long theId) {
		
		Exercice exercice = exerciceService.findById(theId);
		
		if (exercice == null) {
			throw new RuntimeException("Exercice id not found - " + theId);
		}
		
		exerciceService.deleteById(theId);
		
		return "Deleted exercice id - " + theId;
	}
}
