package com.health.Ehealth.Entities;

import java.util.List;

public class Seance {
	private int id;
	private Planning planning;
	private List<Exercise> exercises;
	
	public Seance() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Planning getPlanning() {
		return planning;
	}

	public void setPlanning(Planning planning) {
		this.planning = planning;
	}

	public List<Exercise> getExercises() {
		return exercises;
	}

	public void setExercises(List<Exercise> exercises) {
		this.exercises = exercises;
	}

	public Seance(int id, Planning planning, List<Exercise> exercises) {
		super();
		this.id = id;
		this.planning = planning;
		this.exercises = exercises;
	}
	
}
