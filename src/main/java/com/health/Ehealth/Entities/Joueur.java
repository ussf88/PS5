
package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import com.health.Ehealth.modal.ERole;
import com.health.Ehealth.modal.Role;
import com.health.Ehealth.modal.User;

@Entity
@PrimaryKeyJoinColumn(name = "JoueurId")
public class Joueur extends User{
	private String firstName;
	private String lastName;
	@ManyToOne
	@JoinColumn(name="CODE_EC")
	private EquipeCoach equipeCoach;
	
	@ManyToOne
	@JoinColumn(name="CODE_EN")
	private EquipeNutritionniste equipeNutritionniste;
	
	public Joueur(String username, String email, String password, String firstName, String lastName, EquipeCoach equipeCoach,
			EquipeNutritionniste equipeNutrionniste) {
		 super( username,email,password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.equipeCoach = equipeCoach;
		this.equipeNutritionniste = equipeNutrionniste;
	}
	public Joueur(User user , String firstName, String lastName, EquipeCoach equipeCoach,
			EquipeNutritionniste equipeNutrionniste) {
		super(user.getUsername(),user.getEmail(),user.getPassword());
		this.firstName = firstName;
		this.lastName = lastName;
		this.equipeCoach = equipeCoach;
		this.equipeNutritionniste = equipeNutrionniste;
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
	public EquipeNutritionniste getEquipeNutritionniste() {
		return equipeNutritionniste;
	}
	public void setEquipeNutritionniste(EquipeNutritionniste equipeNutritionniste) {
		this.equipeNutritionniste = equipeNutritionniste;
	}
	
	
	
}
