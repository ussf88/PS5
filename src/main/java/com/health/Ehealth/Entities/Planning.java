package com.health.Ehealth.Entities;

import java.util.List;

public class Planning {
	private int id;
	private EquipeCoach equipeCaoch;
	private List<Seance> seances;
	
	public Planning() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public EquipeCoach getEquipeCaoch() {
		return equipeCaoch;
	}

	public void setEquipeCaoch(EquipeCoach equipeCaoch) {
		this.equipeCaoch = equipeCaoch;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public Planning(int id, EquipeCoach equipeCaoch, List<Seance> seances) {
		super();
		this.id = id;
		this.equipeCaoch = equipeCaoch;
		this.seances = seances;
	}
	
}
