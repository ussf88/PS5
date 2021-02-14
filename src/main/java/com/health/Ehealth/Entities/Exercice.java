package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Exercice implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private int duration;
	
	private String contenu;
	
	
	@ManyToOne
	@JoinColumn(name="CODE_SEA")
	@JsonIgnore
	private Seance seance;
	
	public Exercice(){}
	public Exercice(Long id, Seance seance) {
		super();
		this.id = id;
		this.seance = seance;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Seance getSeance() {
		return seance;
	}
	public void setSeance(Seance seance) {
		this.seance = seance;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	@Override
	public String toString() {
		return "Exercice [id=" + id + ", duration=" + duration + ", contenu=" + contenu + ", seance=" + seance + "]";
	}
	
	
}
