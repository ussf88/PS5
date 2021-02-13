package com.health.Ehealth.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Planning implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Long id;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date week;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="planning")
	private List<Seance> seances;
	
	public Planning(){}
	public Planning(Long id, EquipeCoach equipeCaoch, List<Seance> seances) {
		super();
		this.id = id;
		this.seances = seances;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public List<Seance> getSeances() {
		return seances;
	}
	
	
	public Date getWeek() {
		return week;
	}
	public void setWeek(Date week) {
		this.week = week;
	}
	@Override
	public String toString() {
		return "Planning [id=" + id + ", week=" + week + ", seances=" + seances + "]";
	}
	public void setSeances(List<Seance> seances) {
		this.seances=seances;
		for (Seance s :seances) {
		    s.setPlanning(this);
		    System.out.println("=====================================>"+s.toString());
		}
	}
	
}
