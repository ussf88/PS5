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
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
public class EquipeCoach implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@JsonBackReference
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CODE_COA")
	private Coach coach;
	
	
	@OneToMany(mappedBy="equipeCoach",fetch=FetchType.LAZY)
	private List<Joueur> Joueurs;
	
	@OneToOne
	@JoinColumn(name="planning_id")
	private Planning planning;
	
	public EquipeCoach() {
		
	}
	public EquipeCoach(Long id, Coach coach, List<Joueur> joueurs, Planning planning) {
		super();
		this.id = id;
		this.coach = coach;
		Joueurs = joueurs;
		this.planning = planning;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Coach getCoach() {
		return coach;
	}
	public void setCoach(Coach coach) {
		this.coach = coach;
	}
	public List<Joueur> getJoueurs() {
		return Joueurs;
	}
	public void setJoueurs(List<Joueur> joueurs) {
		Joueurs = joueurs;
	}
	public Planning getPlanning() {
		return planning;
	}
	public void setPlanning(Planning planning) {
		this.planning = planning;
	}
	
	
}
