package com.health.Ehealth.Entities;

public class Repas {
	private int id;
	private Regime regime;
	private String contenu;
	public Repas() {
		
	}
	public Repas(int id, Regime regime, String contenu) {
		super();
		this.id = id;
		this.regime = regime;
		this.contenu = contenu;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Regime getRegime() {
		return regime;
	}
	public void setRegime(Regime regime) {
		this.regime = regime;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
}
