package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Seance implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CODE_PLA")
	private Planning planning;
	
	
	@OneToMany(mappedBy="seance",fetch=FetchType.LAZY)
	private List<Exercice> exercises;
	
	public Seance(Long id, Planning planning, List<Exercice> exercises) {
		super();
		this.id = id;
		this.planning = planning;
		this.exercises = exercises;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Planning getPlanning() {
		return planning;
	}
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	public List<Exercice> getExercises() {
		return exercises;
	}
	public void setExercises(List<Exercice> exercises) {
		this.exercises = exercises;
	}
	
}
