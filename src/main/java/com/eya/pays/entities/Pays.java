package com.eya.pays.entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
@Entity

public class Pays {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idPays; 
	private String nomPays; 
	private Double population; 
	private String continent;
	private String email;
	private Date independenceDate; 
	@ManyToOne
	private Classification classification;
	public Pays() {
		super();
	}
	public Pays(String nomPays, Double population, String continent, Date independenceDate) {
		super();
		this.nomPays = nomPays;
		this.population = population;
		this.continent = continent;
		this.independenceDate = independenceDate;
	}
	public Long getIdPays() {
		return idPays;
	}
	public void setIdPays(Long idPays) {
		this.idPays = idPays;
	}
	public String getNomPays() {
		return nomPays;
	}
	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}
	public Double getPopulation() {
		return population;
	}
	public void setPopulation(Double population) {
		this.population = population;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public Date getIndependenceDate() {
		return independenceDate;
	}
	public void setIndependenceDate(Date independenceDate) {
		this.independenceDate = independenceDate;
	}
	@Override
	public String toString() {
		return "Pays [idPays=" + idPays + ", nomPays=" + nomPays + ", population=" + population + ", continent="
				+ continent + ", independenceDate=" + independenceDate + ", email="+email+"]";
	}
	public Classification getClassification() {
		return classification;
	}
	public void setClassification(Classification classification) {
		this.classification = classification;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
