package com.health.Ehealth.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Service.CoachService;

@RestController
public class CoachRest {
	@Autowired
	private CoachService coachService;
	@PostMapping("/coachs")
	public Coach saveCoach(@RequestBody Coach coach) {
           coach.setId(0l);
		
           return coachService.save(coach);
		
	}
	@GetMapping("/coachs")
	public List<Coach> listCoach(){
		return coachService.findAll();
	}
	
	@GetMapping("/coachs/{coachId}")
	public Coach getCoach(@PathVariable Long coachId) {
		
		Coach coach = coachService.findById(coachId);
		
		if (coach == null) {
			throw new RuntimeException("Employee id not found - " + coachId);
		}
		
		return coach;
	}
	
	@PutMapping("/coachs")
	public Coach updateCoach(@RequestBody Coach coach) {
		
		coachService.save(coach);
		
		return coach;
	}
	
	
	@DeleteMapping("/coachs/{coachId}")
	public String deleteCoach(@PathVariable Long coachId) {
		
		Coach coach = coachService.findById(coachId);
		
		if (coach == null) {
			throw new RuntimeException("Employee id not found - " + coachId);
		}
		
		coachService.deleteById(coachId);
		
		return "Deleted employee id - " + coachId;
	}
}
