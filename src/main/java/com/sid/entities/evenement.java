package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class evenement implements Serializable {
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		 private Long id;
		@Column(columnDefinition = "null")
	   private int idOldLigne;
	   @Column(columnDefinition = "null")
	   private int idOldProduct;
	   private java.lang.String comment;
	   private int mois;
	   private int annee;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date date;
	   @ManyToOne
	   @JoinColumn(name = "id_ligne")
	   private ligne ligne;
	   
	   
	public evenement( int idOldLigne, int idOldProduct, String comment, int mois, int annee, Date date) {
		super();
		this.idOldLigne = idOldLigne;
		
		this.idOldProduct = idOldProduct;
		this.comment = comment;
		this.mois = mois;
		this.annee = annee;
		this.date = date;
	}
	
	public ligne getLigne() {
		return ligne;
	}

	public void setLigne(ligne ligne) {
		this.ligne = ligne;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public int getIdOldLigne() {
		return idOldLigne;
	}
	public void setIdOldLigne(int idOldLigne) {
		this.idOldLigne = idOldLigne;
	}
	public int getIdOldProduct() {
		return idOldProduct;
	}
	public void setIdOldProduct(int idOldProduct) {
		this.idOldProduct = idOldProduct;
	}
	public java.lang.String getComment() {
		return comment;
	}
	public void setComment(java.lang.String comment) {
		this.comment = comment;
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
	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public evenement() {
		super();
		// TODO Auto-generated constructor stub
	}

	   
}
