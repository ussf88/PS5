package com.health.Ehealth.Entities;

import java.util.List;

public class Regime {
	private int id;
	private EquipeNutritionniste equipeNutrtionniste;
	private List<Repas> repas;
	
	public Regime() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EquipeNutritionniste getEquipeNutrtionniste() {
		return equipeNutrtionniste;
	}

	public void setEquipeNutrtionniste(EquipeNutritionniste equipeNutrtionniste) {
		this.equipeNutrtionniste = equipeNutrtionniste;
	}

	public List<Repas> getRepas() {
		return repas;
	}

	public void setRepas(List<Repas> repas) {
		this.repas = repas;
	}

	public Regime(int id, EquipeNutritionniste equipeNutrtionniste, List<Repas> repas) {
		super();
		this.id = id;
		this.equipeNutrtionniste = equipeNutrtionniste;
		this.repas = repas;
	}
	
}
