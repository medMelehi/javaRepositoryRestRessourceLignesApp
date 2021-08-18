package com.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class ligne implements Serializable{
	
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	   private String operateur;
	   private String numLigne;
	   @ManyToOne
	   @JoinColumn(name = "id_produit")
	   private produit produit;
	   @ManyToOne
	   @JoinColumn(name = "id_titulaire")
	   private titulaire titulaire;
	   @ManyToOne
	   @JoinColumn(name = "id_site")
	   private site site;
	   @ManyToOne
	   @JoinColumn(name = "id_groupe")
	   private groupe groupe;
	   @ManyToOne
	   @JoinColumn(name = "id_cat")
	   private categorie categorie;
	   
	   @OneToMany(mappedBy="ligne",fetch=FetchType.LAZY)
		private Collection<evenement> evenements; 
		
		@OneToMany(mappedBy="ligne",fetch=FetchType.LAZY)
		private Collection<facture> factures; 
		
		@OneToMany(mappedBy="ligne",fetch=FetchType.LAZY)
		private Collection<reengagement> reengagements; 

	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateActivation;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateDesactivation;
	   
	   public ligne(String operateur,  String numLigne, Date dateActivation, Date dateDesactivation) {
		super();
		this.operateur = operateur;
		this.numLigne = numLigne;
		this.dateActivation = dateActivation;
		this.dateDesactivation = dateDesactivation;
	}
		public ligne() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	   
		
	public Collection<evenement> getEvenements() {
			return evenements;
		}
		public void setEvenements(Collection<evenement> evenements) {
			this.evenements = evenements;
		}
		public Collection<facture> getFactures() {
			return factures;
		}
		public void setFactures(Collection<facture> factures) {
			this.factures = factures;
		}
		public Collection<reengagement> getReengagements() {
			return reengagements;
		}
		public void setReengagements(Collection<reengagement> reengagements) {
			this.reengagements = reengagements;
		}
	public produit getProduit() {
			return produit;
		}
		public void setProduit(produit produit) {
			this.produit = produit;
		}
		public titulaire getTitulaire() {
			return titulaire;
		}
		public void setTitulaire(titulaire titulaire) {
			this.titulaire = titulaire;
		}
		public site getSite() {
			return site;
		}
		public void setSite(site site) {
			this.site = site;
		}
	public categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(categorie categorie) {
		this.categorie = categorie;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public java.lang.String getOperateur() {
		return operateur;
	}
	public void setOperateur(java.lang.String operateur) {
		this.operateur = operateur;
	}
	
	public String getNumLigne() {
		return numLigne;
	}
	public void setNumLigne(String numLigne) {
		this.numLigne = numLigne;
	}

	
	public groupe getGroupe() {
		return groupe;
	}
	public void setGroupe(groupe groupe) {
		this.groupe = groupe;
	}
	
	public java.util.Date getDateActivation() {
		return dateActivation;
	}
	public void setDateActivation(java.util.Date dateActivation) {
		this.dateActivation = dateActivation;
	}
	public java.util.Date getDateDesactivation() {
		return dateDesactivation;
	}
	public void setDateDesactivation(java.util.Date dateDesactivation) {
		this.dateDesactivation = dateDesactivation;
	}

	   
}
