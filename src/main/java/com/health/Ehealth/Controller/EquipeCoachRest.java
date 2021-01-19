package com.health.Ehealth.Controller;

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
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Service.EquipeCoachService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class EquipeCoachRest {
	@Autowired
	private EquipeCoachService equipeCoachService;
	
	@PostMapping("/equipeCoachs")
	public EquipeCoach saveEquipecoach(@RequestBody EquipeCoach equipeCoach) {
		equipeCoach.setId(0l);
		
           return equipeCoachService.save(equipeCoach);
		
	}
	@GetMapping("/equipeCoachs")
	public List<EquipeCoach> listEquipeCoach(){
		return equipeCoachService.findAll();
	}
	@GetMapping("/equipeCoachs/coach/{coachId}")
	public List<EquipeCoach> listEquipeCoachByCaoch(@PathVariable Long coachId){
		return equipeCoachService.findByCoach(coachId);
	}
	@GetMapping("/equipeCoachs/{theId}")
	public EquipeCoach getEquipeCoach(@PathVariable Long theId) {
		
		EquipeCoach equipeCoach = equipeCoachService.findById(theId);
		
		if (equipeCoach == null) {
			throw new RuntimeException("Employee id not found - " + theId);
		}
		
		return equipeCoach;
	}
	@PutMapping("/equipeCoachs")
	public EquipeCoach updateEquipeCoach(@RequestBody EquipeCoach equipeCoach) {
		
		equipeCoachService.save(equipeCoach);
		
		return equipeCoach;
	}
	@DeleteMapping("/equipeCoachs/{theId}")
	public String deleteEquipeCoach(@PathVariable Long theId) {
		
		EquipeCoach equipeCoach = equipeCoachService.findById(theId);
		
		if (equipeCoach == null) {
			throw new RuntimeException("Equipe id not found - " + theId);
		}
		
		equipeCoachService.deleteById(theId);
		
		return "Deleted equipe id - " + theId;
	}
}
