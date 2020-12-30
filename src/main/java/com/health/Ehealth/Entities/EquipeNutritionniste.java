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

@Entity
public class EquipeNutritionniste implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="CODE_NUTR")
	private Nutritionniste nutritionniste;
	
	@OneToMany(mappedBy="equipeNutritionniste",fetch=FetchType.LAZY)
	private List<Joueur> Joueurs;
	
	@OneToOne
	@JoinColumn(name="regime_id")
	private Regime regime;
	
	
	public EquipeNutritionniste(Long id, Nutritionniste nutritionniste, List<Joueur> joueurs, Regime regime) {
		super();
		this.id = id;
		this.nutritionniste = nutritionniste;
		Joueurs = joueurs;
		this.regime = regime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
}
