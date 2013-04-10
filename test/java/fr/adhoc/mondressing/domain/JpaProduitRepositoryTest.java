package fr.adhoc.mondressing.domain;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.adhoc.mondressing.domain.entities.Produit;
import fr.adhoc.mondressing.domain.repositories.ProduitRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:META-INF/test-context.xml")

public class JpaProduitRepositoryTest {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void test() {
		
		Produit produit = new Produit();
		
		produit.setDisponibilite("OK");
		
		produitRepository.save(produit);
		
		Produit produitFromBD =produitRepository.verifierDisponibilite(produit.getDisponibilite());
		assertNotNull(produitFromBD);
		
		assertEquals(produitFromBD.getDisponibilite(), produit.getDisponibilite());
				
	}
	
	

}
