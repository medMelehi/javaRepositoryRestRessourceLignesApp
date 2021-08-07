package com.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class produit implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private java.lang.String libelle;
	   private java.lang.Double coutTtc;
	public produit(String libelle, Double coutTtc) {
		super();
		this.libelle = libelle;
		this.coutTtc = coutTtc;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public java.lang.String getLibelle() {
		return libelle;
	}
	public void setLibelle(java.lang.String libelle) {
		this.libelle = libelle;
	}
	public java.lang.Double getCoutTtc() {
		return coutTtc;
	}
	public void setCoutTtc(java.lang.Double coutTtc) {
		this.coutTtc = coutTtc;
	}
	@Override
	public String toString() {
		return "produit [id=" + id + ", libelle=" + libelle + ", coutTtc=" + coutTtc + "]";
	}
	public produit() {
		super();

	}
	
}
