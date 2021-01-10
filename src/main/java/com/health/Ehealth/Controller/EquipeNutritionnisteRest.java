package com.health.Ehealth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.EquipeNutritionniste;
import com.health.Ehealth.Service.EquipeNutritionnisteService;

@RestController
public class EquipeNutritionnisteRest {
	@Autowired
	private EquipeNutritionnisteService equipeNutritionnisteService;
	
	@PostMapping("/equipeNutritionnistes")
	public EquipeNutritionniste saveEquipeNutritionniste(@RequestBody EquipeNutritionniste equipeNutritionniste) {
		equipeNutritionniste.setId(0l);
		
           return equipeNutritionnisteService.save(equipeNutritionniste);
		
	}
	@GetMapping("/equipeNutritionnistes")
	public List<EquipeNutritionniste> listEquipeNutritionniste(){
		return equipeNutritionnisteService.findAll();
	}
	@GetMapping("/equipeNutristionniste/{theId}")
	public EquipeNutritionniste getEquipeNutritionniste(@PathVariable Long theId) {
		
		EquipeNutritionniste equipeNutritionniste = equipeNutritionnisteService.findById(theId);
		
		if (equipeNutritionniste == null) {
			throw new RuntimeException("Equipe nutritionniste id not found - " + theId);
		}
		
		return equipeNutritionniste;
	}
	@PutMapping("/equipeNutritionnistes")
	public EquipeNutritionniste updateEquipeNutritionniste(@RequestBody EquipeNutritionniste equipeNutritionniste) {
		
		equipeNutritionnisteService.save(equipeNutritionniste);
		
		return equipeNutritionniste;
	}
	@DeleteMapping("/equipeNutritionniste/{theId}")
	public String deleteEquipeNutritionniste(@PathVariable Long theId) {
		
		EquipeNutritionniste equipeNutritionniste = equipeNutritionnisteService.findById(theId);
		
		if (equipeNutritionniste == null) {
			throw new RuntimeException("Equipe Nutritionniste id not found - " + theId);
		}
		
		equipeNutritionnisteService.deleteById(theId);
		
		return "Deleted equipe id - " + theId;
	}
}
