package com.health.Ehealth.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.health.Ehealth.Entities.Coach;
import com.health.Ehealth.Entities.Planning;
import com.health.Ehealth.Entities.Regime;

public interface RegimeService {
	
	public List<Regime> findAll();
	
	public Regime findById(Long theId);
	
	public Regime save(Regime regime);
	
	public void deleteById(Long theId);

}
