package com.eya.pays;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.eya.pays.entities.Classification;
import com.eya.pays.entities.Pays;
import com.eya.pays.repos.PaysRepository;

@SpringBootTest
class PaysApplicationTests {
	@Autowired
	private PaysRepository paysRepository;
	@Test
	public void testCreatePays() {
	Pays pays = new Pays("Tunisie", 12000000.0, "Afrique", new Date());

	paysRepository.save(pays);
	}
	
	@Test
	public void testFindPays()
	{
	Pays p = paysRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdatePays()
	{
	Pays p = paysRepository.findById(1L).get();
	p.setPopulation(100000.0);
	paysRepository.save(p);
	}
	
	@Test
	public void testDeletePays()
	{
	paysRepository.deleteById(1L);;
	}

	@Test
	public void testListerTousPays()
	{
	List<Pays> paysL = paysRepository.findAll();
	for (Pays p : paysL)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindPaysByNom()
	{
	List<Pays> paysL = paysRepository.findByNomPays("Tunisie");
	for(Pays p:paysL) {
	      System.out.println(p);}
	}
	@Test
	public void testFindByNomPaysContains ()
	{
	List<Pays> paysL=paysRepository.findByNomPaysContains("e");
	for (Pays p : paysL)
	{
	System.out.println(p);
	} }
	@Test
	public void testfindByNomPopulation()
	{
	List<Pays> paysL = paysRepository.findByNomPopulation("Tunisie", 12000000.0);
	for (Pays p : paysL)
	{
	   System.out.println(p);
	}
	}
	@Test
	public void testfindByClassification()
	{
	Classification clas = new Classification();
	clas.setIdClass(1L);
	List<Pays> paysL = paysRepository.findByClassification(clas);
	for (Pays p : paysL)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Pays> paysL = paysRepository.findByOrderByNomPaysAsc();
	for (Pays p : paysL)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testtrierPaysNomsPopulation ()
	{
	List<Pays> paysL = paysRepository.trierPaysNomsPopulation();
	for (Pays p : paysL)
	{
	System.out.println(p);
	}
	}

	@Test
	public void findByClassificationIdClass()
	{
	List<Pays> paysL = paysRepository.findByClassificationIdClass(1L);
	   for (Pays p : paysL)
	   {
	      System.out.println(p);
	      }
	}
}
