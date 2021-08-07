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
public class ligne implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private String operateur;
	   private String numLigne;
	   private int idGroup;
	   private int idCategorie;
	   private int idProduit;
	   private int idTitulaire;
	   private int idSite;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateActivation;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date dateDesactivation;
	
	   public ligne(String operateur,  String numLigne, int idGroup, int idCategorie, int idProduit,
			int idTitulaire, int idSite, Date dateActivation, Date dateDesactivation) {
		super();
		this.operateur = operateur;
		this.numLigne = numLigne;
		this.idGroup = idGroup;
		this.idCategorie = idCategorie;
		this.idProduit = idProduit;
		this.idTitulaire = idTitulaire;
		this.idSite = idSite;
		this.dateActivation = dateActivation;
		this.dateDesactivation = dateDesactivation;
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
	public int getIdGroup() {
		return idGroup;
	}
	public void setIdGroup(int idGroup) {
		this.idGroup = idGroup;
	}
	public int getIdCategorie() {
		return idCategorie;
	}
	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getIdTitulaire() {
		return idTitulaire;
	}
	public void setIdTitulaire(int idTitulaire) {
		this.idTitulaire = idTitulaire;
	}
	public int getIdSite() {
		return idSite;
	}
	public void setIdSite(int idSite) {
		this.idSite = idSite;
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
	public ligne() {
		super();
		// TODO Auto-generated constructor stub
	}

	   
}
