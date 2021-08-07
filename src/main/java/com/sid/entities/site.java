package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class site implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private java.lang.String nom;
	   private java.lang.String adresse;
	   private String etat;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateOuverture;
	   @Temporal(TemporalType.DATE)
	   private Date dateFermeture;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateIn;
	   private Boolean actif;

	public site(String nom, String adresse, String etat, Date dateOuverture, Date dateFermeture, Date dateIn, Date dateOut,
			Boolean actif) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.etat = etat;
		this.dateOuverture = dateOuverture;
		this.dateFermeture = dateFermeture;
		this.dateIn = dateIn;
		this.actif = actif;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.lang.String getNom() {
		return nom;
	}

	public void setNom(java.lang.String nom) {
		this.nom = nom;
	}

	public java.lang.String getAdresse() {
		return adresse;
	}

	public void setAdresse(java.lang.String adresse) {
		this.adresse = adresse;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public java.util.Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(java.util.Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public Date getDateFermeture() {
		return dateFermeture;
	}

	public void setDateFermeture(Date dateFermeture) {
		this.dateFermeture = dateFermeture;
	}

	public java.util.Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(java.util.Date dateIn) {
		this.dateIn = dateIn;
	}



	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public site() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	   
}
