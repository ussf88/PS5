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
import com.health.Ehealth.Entities.EquipeCoach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Service.CoachService;
import com.health.Ehealth.Service.EquipeCoachService;
import com.health.Ehealth.Service.PlanningService;

@CrossOrigin
@RestController
public class PlanningRest {
	
	@Autowired
	private PlanningService planningService;
	

	@Autowired
	private EquipeCoachService equipeCaochService;
	
	@PostMapping("/planning/{Equipeid}")
	public Planning savePlanning(@RequestBody Planning planning,@PathVariable Long Equipeid ) {
		EquipeCoach original =equipeCaochService.findById(Equipeid);
		  planning.setId(0l);
		original.setPlanning(planning);
		
           equipeCaochService.save(original);
           return planning;
		
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
