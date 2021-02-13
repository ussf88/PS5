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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Service.CoachService;
import com.health.Ehealth.Service.PlanningService;

@CrossOrigin
@RestController
public class PlanningRest {
	
	@Autowired
	private PlanningService planningService;
	@PostMapping("/planning")
	public Planning savePlanning(@RequestBody Planning planning) {
		System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+planning.toString());
           planning.setId(0l);
		
           return planningService.save(planning);
		
	}
	@GetMapping("/planning")
	public List<Planning> getPlannings() {		
           return planningService.findAll();
		
	}
	@GetMapping("/planning/{theId}")
	public  Planning getPlanningById(@PathVariable Long theId) {		
           return planningService.findById(theId);
		
	}
	

}
