package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Seance{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String jour;
	
	private String description;
	@ManyToOne
	@JoinColumn(name="CODE_PLA")
	 @JsonIgnore
	private Planning planning;
	
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="seance")
	private List<Exercice> exercises;
	public Seance(){}
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
	public String toString() {
		return this.jour+this.description;
	}
	
	
	public String getJour() {
		return jour;
	}
	public void setJour(String jour) {
		this.jour = jour;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setExercises(List<Exercice> exercises) {
		this.exercises = exercises;
		for (Exercice e :exercises) {
		    e.setSeance(this);
		}
	}
	
}
