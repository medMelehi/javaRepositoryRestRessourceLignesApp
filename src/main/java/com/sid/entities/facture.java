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
public class facture implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private int idLigne;
	   private int mois;
	   private int annee;
	   private java.lang.Double ttc;
	   private java.lang.Double ht;
	   private java.lang.String comment;
	  @Temporal(TemporalType.DATE)
	   private java.util.Date dateIn;
	
	   public facture(int idLigne, int mois, int annee, Double ttc, Double ht, String comment, Date dateIn) {
		super();
		this.idLigne = idLigne;
		this.mois = mois;
		this.annee = annee;
		this.ttc = ttc;
		this.ht = ht;
		this.comment = comment;
		this.dateIn = dateIn;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdLigne() {
		return idLigne;
	}
	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}
	public int getMois() {
		return mois;
	}
	public void setMois(int mois) {
		this.mois = mois;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public java.lang.Double getTtc() {
		return ttc;
	}
	public void setTtc(java.lang.Double ttc) {
		this.ttc = ttc;
	}
	public java.lang.Double getHt() {
		return ht;
	}
	public void setHt(java.lang.Double ht) {
		this.ht = ht;
	}
	public java.lang.String getComment() {
		return comment;
	}
	public void setComment(java.lang.String comment) {
		this.comment = comment;
	}
	public java.util.Date getDateIn() {
		return dateIn;
	}
	public void setDateIn(java.util.Date dateIn) {
		this.dateIn = dateIn;
	}
	public facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	   
}
