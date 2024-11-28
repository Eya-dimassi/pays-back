package com.eya.pays.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.eya.pays.entities.Classification;
import com.eya.pays.entities.Pays;
@RepositoryRestResource(path = "rest")
public interface PaysRepository extends JpaRepository<Pays, Long> {
	List<Pays> findByNomPays(String nom);
	 List<Pays> findByNomPaysContains(String nom); 
	/* @Query("select p from Pays p where p.nomPays like %?1 and p.population > ?2")
	 List<Pays> findByNomPopulation (String nom, Double population);*/
	 @Query("select p from Pays p where p.nomPays like %:nom and p.population > :population")
	 List<Pays> findByNomPopulation (@Param("nom") String nom,@Param("population") Double population);
	 @Query("select p from Pays p where p.classification.idClass = ?1")
	 List<Pays> findByClassification (Classification classification);
	 List<Pays> findByClassificationIdClass(Long id);
	 List<Pays> findByOrderByNomPaysAsc();
	 @Query("select p from Pays p order by p.nomPays ASC, p.population DESC")
	 List<Pays> trierPaysNomsPopulation ();


}
