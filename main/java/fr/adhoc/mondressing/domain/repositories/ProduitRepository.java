package fr.adhoc.mondressing.domain.repositories;

import fr.adhoc.mondressing.domain.entities.Produit;

public interface ProduitRepository {
	
	public Produit verifierDisponibilite (String disponibilite);
	public void save(Produit produit);

}
