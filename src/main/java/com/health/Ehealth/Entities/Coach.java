package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.health.Ehealth.modal.Role;
import com.health.Ehealth.modal.User;

@Entity
@PrimaryKeyJoinColumn(name = "CoachId")
public class Coach extends User{
	private String firstName;
	private String lastName;
	
	@JsonManagedReference
	@OneToMany(mappedBy="coach",fetch=FetchType.LAZY)
	private List<EquipeCoach> equipe;
	
	public Coach() {}
	
	public Coach(String username, String email, String password,Set<Role> roles,String firstName, String lastName, List<EquipeCoach> equipe) {
		 super( username,email,password,roles);
		this.firstName = firstName;
		this.lastName = lastName;
		this.equipe = equipe;
	}
	public Coach(User user,String firstName, String lastName, List<EquipeCoach> equipe) {
		super(user.getUsername(),user.getEmail(),user.getPassword(),user.getRoles());
		this.firstName = firstName;
		this.lastName = lastName;
		this.equipe = equipe;
	}

	public List<EquipeCoach> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<EquipeCoach> equipe) {
		this.equipe = equipe;
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

	@Override
	public String toString() {
		return "Coach [firstName=" + firstName + ", lastName=" + lastName + ", equipe=" + equipe + "]";
	}
	
	
}
