package com.health.Ehealth.Entities;

import java.util.List;

public class EquipeCoach {
	private int id;
	private Coach coach;
	private List<Joueur> Joueurs;
	private Planning planning;
	
	public EquipeCoach() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public EquipeCoach(int id, Coach coach, List<Joueur> joueurs, Planning planning) {
		super();
		this.id = id;
		this.coach = coach;
		Joueurs = joueurs;
		this.planning = planning;
	}
	
	
}
