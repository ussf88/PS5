package com.health.Ehealth.Entities;

import java.util.List;

public class EquipeNutritionniste {
	private int id;
	private Nutritionniste nutritionniste;
	private List<Joueur> Joueurs;
	private Regime regime;
	
	public EquipeNutritionniste() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Nutritionniste getNutritionniste() {
		return nutritionniste;
	}

	public void setNutritionniste(Nutritionniste nutritionniste) {
		this.nutritionniste = nutritionniste;
	}

	public List<Joueur> getJoueurs() {
		return Joueurs;
	}

	public void setJoueurs(List<Joueur> joueurs) {
		Joueurs = joueurs;
	}

	public Regime getRegime() {
		return regime;
	}

	public void setRegime(Regime regime) {
		this.regime = regime;
	}

	public EquipeNutritionniste(int id, Nutritionniste nutritionniste, List<Joueur> joueurs, Regime regime) {
		super();
		this.id = id;
		this.nutritionniste = nutritionniste;
		Joueurs = joueurs;
		this.regime = regime;
	}
	
}
