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
import com.health.Ehealth.Entities.Nutritionniste;
import com.health.Ehealth.Service.NutritionnisteService;

@RestController
public class NutritionnisteRest {
	@Autowired
	private NutritionnisteService nutritionnisteSrvice;
	@PostMapping("/nutritionnistes")
	public Nutritionniste saveNutritionniste(@RequestBody Nutritionniste nutritionniste) {
		   nutritionniste.setId(0l);
		
           return nutritionnisteSrvice.save(nutritionniste);
		
	}
	@GetMapping("/nutritionnistes")
	public List<Nutritionniste> listNutritionniste(){
		return nutritionnisteSrvice.findAll();
	}
	
	@GetMapping("/nutritionnistes/{theId}")
	public Nutritionniste getNutritionniste(@PathVariable Long theId) {
		
		Nutritionniste nutritionniste = nutritionnisteSrvice.findById(theId);
		
		if (nutritionniste == null) {
			throw new RuntimeException("Employee id not found - " + theId);
		}
		
		return nutritionniste;
	}
	
	@PutMapping("/nutritionnistes")
	public Nutritionniste updateNutritionniste(@RequestBody Nutritionniste nutritionniste) {
		
		nutritionnisteSrvice.save(nutritionniste);
		
		return nutritionniste;
	}
	
	
	@DeleteMapping("/nutritionnistes/{theId}")
	public String deleteNutritionniste(@PathVariable Long theId) {
		
		Nutritionniste nutritionniste = nutritionnisteSrvice.findById(theId);
		
		if (nutritionniste == null) {
			throw new RuntimeException("Employee id not found - " + theId);
		}
		
		nutritionnisteSrvice.deleteById(theId);
		
		return "Deleted employee id - " + theId;
	}

}
