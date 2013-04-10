package fr.adhoc.mondressing.domain.repositories.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.adhoc.mondressing.domain.entities.Produit;
import fr.adhoc.mondressing.domain.repositories.ProduitRepository;

@Repository
public class JpaProduitRepository implements ProduitRepository {
	
		
		private EntityManager entityManager;
		
		public EntityManager getEntityManager() {
			return entityManager;
		}

		@PersistenceContext
		public void setEntityManager(EntityManager entityManager) {
			this.entityManager=entityManager;
		}
		
		public Produit verifierDisponibilite(String disponibilite) {
			return (Produit) entityManager.createQuery("select p from Produit where p.disponibilite=?1").setParameter(1, disponibilite).getResultList();
		}

		@Override
		public void save(Produit produit) {
			entityManager.persist(produit);
			// TODO Auto-generated method stub
			
		}
		
		

	}


