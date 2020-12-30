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
public class Regime implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "regime_id")
	private Long id;
	
	@OneToMany(mappedBy="regime",fetch=FetchType.LAZY)
	private List<Repas> repas;
	
	
	public Regime(Long id, EquipeNutritionniste equipeNutrtionniste, List<Repas> repas) {
		super();
		this.id = id;
		this.repas = repas;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Repas> getRepas() {
		return repas;
	}
	public void setRepas(List<Repas> repas) {
		this.repas = repas;
	}
	
}
