package com.health.Ehealth.Entities;

import java.util.List;

public class Exercise {
	private int id;
	private Seance seance;
	
	public Exercise() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Seance getSeance() {
		return seance;
	}

	public void setSeance(Seance seance) {
		this.seance = seance;
	}

	public Exercise(int id, Seance seance) {
		super();
		this.id = id;
		this.seance = seance;
	}
	
}
