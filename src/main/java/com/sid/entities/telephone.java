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
public class telephone implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	   private java.lang.String imei;
	   private java.lang.String marque;
	   private java.lang.String model;
	   private java.lang.String etat;
	   private Boolean fix;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateIn;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateOut;
	   
	   @OneToMany(mappedBy="telephone",fetch=FetchType.LAZY)
		private Collection<contrat_tel> telContrats; 
		
		 @ManyToOne
		   @JoinColumn(name = "id_titulaire")
		   private titulaire titulaire;
	   
	   public telephone(String imei, String marque, String model, String etat, Boolean fix, Date dateIn, Date dateOut) {
			super();
			this.imei = imei;
			this.marque = marque;
			this.model = model;
			this.etat = etat;
			this.fix = fix;
			this.dateIn = dateIn;
			this.dateOut = dateOut;
		}

	public Collection<contrat_tel> getTelContrats() {
		return telContrats;
	}

	public void setTelContrats(Collection<contrat_tel> telContrats) {
		this.telContrats = telContrats;
	}

	public titulaire getTitulaire() {
		return titulaire;
	}

	public void setTitulaire(titulaire titulaire) {
		this.titulaire = titulaire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public java.lang.String getImei() {
		return imei;
	}

	public void setImei(java.lang.String imei) {
		this.imei = imei;
	}

	public java.lang.String getMarque() {
		return marque;
	}

	public void setMarque(java.lang.String marque) {
		this.marque = marque;
	}

	public java.lang.String getModel() {
		return model;
	}

	public void setModel(java.lang.String model) {
		this.model = model;
	}

	public java.lang.String getEtat() {
		return etat;
	}

	public void setEtat(java.lang.String etat) {
		this.etat = etat;
	}

	public Boolean getFix() {
		return fix;
	}

	public void setFix(Boolean fix) {
		this.fix = fix;
	}

	public java.util.Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(java.util.Date dateIn) {
		this.dateIn = dateIn;
	}

	public java.util.Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(java.util.Date dateOut) {
		this.dateOut = dateOut;
	}

	public telephone() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
	   
}
