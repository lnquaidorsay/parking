package com.lnyaka.parking.dao.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FieldsEntity {
	@JsonProperty(value = "id_pr")
	private String idObj;

	@JsonProperty(value = "nom")
	private String grpNom;

	@JsonProperty(value = "commune")
	private String grpCommune;

	@JsonProperty(value = "nature")
	private String grpNature;

	@JsonProperty(value = "street")
	private String grpAdresse;

	@JsonProperty(value = "nb_places_totales")
	private int grpNbPlacesTotal;

	public String getIdObj() {
		return idObj;
	}

	public void setIdObj(String idObj) {
		this.idObj = idObj;
	}

	public String getGrpNom() {
		return grpNom;
	}

	public void setGrpNom(String grpNom) {
		this.grpNom = grpNom;
	}

	public String getGrpCommune() {
		return grpCommune;
	}

	public void setGrpCommune(String grpCommune) {
		this.grpCommune = grpCommune;
	}

	public String getGrpNature() {
		return grpNature;
	}

	public void setGrpNature(String grpNature) {
		this.grpNature = grpNature;
	}

	public String getGrpAdresse() {
		return grpAdresse;
	}

	public void setGrpAdresse(String grpAdresse) {
		this.grpAdresse = grpAdresse;
	}

	public int getGrpNbPlacesTotal() {
		return grpNbPlacesTotal;
	}

	public void setGrpNbPlacesTotal(int grpNbPlacesTotal) {
		this.grpNbPlacesTotal = grpNbPlacesTotal;
	}

}
