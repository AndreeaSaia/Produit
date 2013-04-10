package fr.adhoc.mondressing.domain.entities;

import javax.persistence.*;

/**
 * Marking a POJO as a persistent entity by adding @Entity
 * Defining the identifier property of my entity by adding @Id
 * The table created is PRODUIT_MONDRESSING
 * 
 */

@Entity
@Table(name="PRODUIT_MONDRESSING")
public class Produit {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDENTIFIER")
	private int id;
	
	@Column(name="NOM_PRODUIT")
	private String nomProduit;
	
	@Column(name="TAILLE")
	private int taille;
	
	@Column(name="NOM_DESIGNER")
	private String nomDesigner;
	
	@Column(name="PRIX")
	private int prix;
	
	@Column(name="COULEUR")
	private String couleur;
	
	@Column(name="DISPONIBILITE")
	private String disponibilite;
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) { 
    	this.id=id;
	}

	public String getNomProduit() {
		return nomProduit;
	}

	public void setNomProduit(String nomProduit) {
		this.nomProduit=nomProduit;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille=taille;
	}

	public String getNomDesigner() {
		return nomDesigner;
	}

	public void setNomDesigner(String nomDesigner) {
		this.nomDesigner = nomDesigner;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	

}
