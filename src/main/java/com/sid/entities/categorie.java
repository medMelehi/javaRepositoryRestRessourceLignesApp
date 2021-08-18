package com.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class categorie implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private java.lang.String nom;
	
	@OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
	private Collection<ligne> lignes; 
	   
	public Collection<ligne> getLignes() {
		return lignes;
	}

	public void setLignes(Collection<ligne> lignes) {
		this.lignes = lignes;
	}

	public categorie(String nom) {
		super();
		this.nom = nom;
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

	public categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
