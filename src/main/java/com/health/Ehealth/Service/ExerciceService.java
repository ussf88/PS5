
package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Exercice;

public interface ExerciceService {
	
	public List<Exercice> findAll();
	
	public Exercice findById(Long theId);
	
	public Exercice save(Exercice exercice);
	
	public void deleteById(Long theId);

}
