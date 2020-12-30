
package com.health.Ehealth.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Joueur implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	@ManyToOne
	@JoinColumn(name="CODE_EC")
	private EquipeCoach equipeCoach;
	
	@ManyToOne
	@JoinColumn(name="CODE_EN")
	private EquipeNutritionniste equipeNutritionniste;
	
	public Joueur(Long id, String firstName, String lastName, String email, String password, EquipeCoach equipeCoach,
			EquipeNutritionniste equipeNutrionniste) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.equipeCoach = equipeCoach;
		this.equipeNutritionniste = equipeNutrionniste;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public EquipeCoach getEquipeCoach() {
		return equipeCoach;
	}
	public void setEquipeCoach(EquipeCoach equipeCoach) {
		this.equipeCoach = equipeCoach;
	}
	public EquipeNutritionniste getEquipeNutrionniste() {
		return equipeNutritionniste;
	}
	public void setEquipeNutrionniste(EquipeNutritionniste equipeNutrionniste) {
		this.equipeNutritionniste = equipeNutrionniste;
	}
	
	
	
}
