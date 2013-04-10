package fr.adhoc.mondressing.domain.entities;

import java.util.*;

import javax.persistence.*;


/** Marking a POJO as a persistent entity by adding @Entity
 * Defining the table for my entity by adding @Table
 * Defining the identifier property of my entity by adding @Id
 * Tell JPA to let the database automatically generate each primary key for us. 
 * Add a GeneratedValue annotation to the entityId.
 */

@Entity
@Table(name="USERS_MONDRESSING")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="IDENTIFIER")
	private int identifier;

	@Column(name="NOM")
	private String nom;

	@Column(name="PRENOM")
	private String prenom;

	@Column(name="ADRESSE")
	private String adresse;

	@Column(name="VILLE")
	private String ville;

	@Column(name="CODE_POSTALE")
	private int codepostale;

	@Column(name="TELEPHONE")
	private int telephone;

	@Column(name="EMAIL")
	private String email;

	@Column(name="MOT_DE_PASSE")
	private String motdepasse;
	
	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Set<Produit> produits = new HashSet<Produit>();


	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}

	public int getIdentifier() {
		return identifier;
	}

	public void setIdentifier(int identifier){
		this.identifier=identifier;
	}

	public String getNom(){
		return nom;
		}

	public void setNom(String nom){
		this.nom=nom; 
	}	

	public String getPrenom(){
		return prenom;
		}

	public void setPrenom(String prenom){
		this.prenom=prenom; 
	}	

	public String getAdresse(){
		return adresse;
		}

	public void setAdresse(String adresse){
		this.adresse=adresse; 
	}	

	public String getVille(){
		return ville;
		}

	public void setVille(String ville){
		this.ville=ville; 
	}	

	public int getCodePostale(){
		return codepostale;
		}

	public void setCodePostale(int codepostale){
		this.codepostale=codepostale; 
	}

	public int getTelephone(){
		return telephone;
		}

	public void setTelephone(int telephone){
		this.telephone=telephone; 
	}		

	public String getEmail(){
		return email;
		}

	public void setEmail(String email){
		this.email=email; 
	}	

	public String getMotDePasse(){
		return motdepasse;
		}

	public void setMotDePasse(String motdepasse){
		this.motdepasse=motdepasse; 
	}	

}