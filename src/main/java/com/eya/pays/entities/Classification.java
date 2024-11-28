package com.eya.pays.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Classification {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idClass;
	private String nomClass;
	private String descriptionClass;
	
	
	@OneToMany (mappedBy="classification")
	@JsonIgnore
	private List<Pays> pays;
	public Long getIdClass() {
	    return idClass;
	}

	public void setIdClass(Long idClass) {
	    this.idClass = idClass;
	}

	public String getNomClass() {
	    return nomClass;
	}

	public void setNomClass(String nomClass) {
	    this.nomClass = nomClass;
	}

	public String getDescriptionClass() {
	    return descriptionClass;
	}

	public void setDescriptionClass(String descriptionClass) {
	    this.descriptionClass = descriptionClass;
	}

	public List<Pays> getPays() {
	    return pays;
	}

	public void setPays(List<Pays> pays) {
	    this.pays = pays;
	}
	
	
	


}
