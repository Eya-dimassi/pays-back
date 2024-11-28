package com.eya.pays.service;

import java.util.List;

import com.eya.pays.entities.Classification;
import com.eya.pays.entities.Pays;

public interface PaysService {
	Pays savePays(Pays p);
	Pays updatePays(Pays p);
	void deletePays(Pays p);
	void deletePaysById(Long id);
	 Pays getPays(Long id);
	List<Pays> getAllPays();
	List<Pays> findByNomPays(String nom);
	List<Pays> findByNomPaysContains(String nom);
	List<Pays> findByNomPopulation (String nom, Double population);
	List<Pays> findByClassification (Classification classification);
	List<Pays> findByClassificationIdClass(Long id);
	List<Pays> findByOrderByNomPaysAsc();
	List<Pays> trierPaysNomsPopulation();

}
