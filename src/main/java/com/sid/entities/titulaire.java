package com.sid.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class titulaire implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private java.lang.String matricule;
	   private java.lang.String nom;
	   private java.lang.String prenom;
	   private java.lang.String email;
	   private java.lang.String typeContrat;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateRecrutement;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateSortie;
	   private java.lang.String motifSortie;
	   
	   @OneToMany(mappedBy="titulaire",fetch=FetchType.LAZY)
		private Collection<ligne> lignes;
		
		@OneToMany(mappedBy="titulaire",fetch=FetchType.LAZY)
		private Collection<reengagement> reengagements; 
		
		@OneToMany(mappedBy="titulaire",fetch=FetchType.LAZY)
		private Collection<telephone> telephones; 
		
		@OneToMany(mappedBy="titulaire",fetch=FetchType.LAZY)
		private Collection<contrat_tel> telContrats;
		
		
		 
		
	
	   public titulaire(String matricule, String nom, String prenom, String email, String typeContrat,
			Date dateRecrutement, Date dateSortie, String motifSortie) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.typeContrat = typeContrat;
		this.dateRecrutement = dateRecrutement;
		this.dateSortie = dateSortie;
		this.motifSortie = motifSortie;
		
	}
	   

	public Collection<ligne> getLignes() {
		return lignes;
	}


	public void setLignes(Collection<ligne> lignes) {
		this.lignes = lignes;
	}


	public Collection<reengagement> getReengagements() {
		return reengagements;
	}


	public void setReengagements(Collection<reengagement> reengagements) {
		this.reengagements = reengagements;
	}


	public Collection<telephone> getTelephones() {
		return telephones;
	}


	public void setTelephones(Collection<telephone> telephones) {
		this.telephones = telephones;
	}


	public Collection<contrat_tel> getTelContrats() {
		return telContrats;
	}


	public void setTelContrats(Collection<contrat_tel> telContrats) {
		this.telContrats = telContrats;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.lang.String getMatricule() {
		return matricule;
	}

	public void setMatricule(java.lang.String matricule) {
		this.matricule = matricule;
	}

	public java.lang.String getNom() {
		return nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getPrenom() {
		return prenom;
	}

	public void setPrenom(java.lang.String prenom) {
		this.prenom = prenom;
	}

	public java.lang.String getEmail() {
		return email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(java.lang.String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public java.util.Date getDateRecrutement() {
		return dateRecrutement;
	}

	public void setDateRecrutement(java.util.Date dateRecrutement) {
		this.dateRecrutement = dateRecrutement;
	}

	public java.util.Date getDateSortie() {
		return dateSortie;
	}

	
	public void setDateSortie(java.util.Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public java.lang.String getMotifSortie() {
		return motifSortie;
	}

	public void setMotifSortie(java.lang.String motifSortie) {
		this.motifSortie = motifSortie;
	}


	public titulaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	
	   
	   
}
