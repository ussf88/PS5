package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

import com.health.Ehealth.modal.Role;
import com.health.Ehealth.modal.User;

@Entity
@PrimaryKeyJoinColumn(name = "NutriId")
public class Nutritionniste extends User{

	private String firstName;
	private String lastName;

	
	@OneToMany(mappedBy="nutritionniste",fetch=FetchType.LAZY)
	private List<EquipeNutritionniste> equipe;
	
	public Nutritionniste() {}
	
	public Nutritionniste(String username, String email, String password,Set<Role> roles,String firstName, String lastName, List<EquipeNutritionniste> equipe) {
		 super( username,email,password,roles);
		this.firstName = firstName;
		this.lastName = lastName;
		this.equipe = equipe;
	}
	public Nutritionniste(User user,String firstName, String lastName, List<EquipeNutritionniste> equipe) {
		super(user.getUsername(),user.getEmail(),user.getPassword(),user.getRoles());
		this.firstName = firstName;
		this.lastName = lastName;
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
	public List<EquipeNutritionniste> getEquipe() {
		return equipe;
	}
	public void setEquipe(List<EquipeNutritionniste> equipe) {
		this.equipe = equipe;
	}

	
	
}
