package com.health.Ehealth.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Seance;
import com.health.Ehealth.Service.PlanningService;
import com.health.Ehealth.Service.SeanceService;

@CrossOrigin
@RestController
public class SeanceRest {
	
	@Autowired
	private SeanceService seanceService;
	@Autowired
	private PlanningService planningService;
	
	@PostMapping("/planning/{theId}/seances")
	public Seance saveSeance(@RequestBody Seance s,@PathVariable Long theId) {
		System.out.println("seance++++++"+s);
		Planning p=planningService.findById(theId);
		List<Seance> ls=new ArrayList<Seance>();
		ls.add(s);
		p.setSeances(ls);
		planningService.save(p);
		return s;
	}
	
	@PutMapping("/planning/{theId}/seances")
	public Seance updateSeance(@RequestBody Seance seance,@PathVariable Long theId) {
		Seance s=seanceService.findById(theId);
		s.setJour(seance.getJour());
		s.setDescription(seance.getDescription());
		seanceService.save(s);
		return s;
	}
	@DeleteMapping("/planning/{theId}/seances")
	public String deleteSeance(@PathVariable Long theId) {
		
		Seance seance = seanceService.findById(theId);
		
		if (seance == null) {
			throw new RuntimeException("Employee id not found - " + seance);
		}
		
		seanceService.deleteById(theId);
		
		return "Deleted employee id - " + theId;
	}
}
