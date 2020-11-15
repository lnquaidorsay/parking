package com.lnyaka.parking.models;

public class Parking {
	private String identifiant;
	private String nom;
	private String commune;
	private String nature;
	private String adresse;
	private int nbPlacesTotal;

	public Parking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCommune() {
		return commune;
	}

	public void setCommune(String commune) {
		this.commune = commune;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getNbPlacesTotal() {
		return nbPlacesTotal;
	}

	public void setNbPlacesTotal(int nbPlacesTotal) {
		this.nbPlacesTotal = nbPlacesTotal;
	}

}
