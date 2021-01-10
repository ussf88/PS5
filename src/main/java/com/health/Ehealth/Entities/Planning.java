package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Planning implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	
	@OneToMany(mappedBy="planning",fetch=FetchType.LAZY)
	private List<Seance> seances;
	
	
	public Planning(Long id, EquipeCoach equipeCaoch, List<Seance> seances) {
		super();
		this.id = id;
		this.seances = seances;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Seance> getSeances() {
		return seances;
	}
	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	
}
