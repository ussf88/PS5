package com.health.Ehealth.Entities;

public class Coach {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private EquipeCoach equipe;
	public Coach() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EquipeCoach getEquipe() {
		return equipe;
	}
	public void setEquipe(EquipeCoach equipe) {
		this.equipe = equipe;
	}
	public Coach(int id, String firstName, String lastName, String email, String password, EquipeCoach equipe) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.equipe = equipe;
	}
	
	
}
