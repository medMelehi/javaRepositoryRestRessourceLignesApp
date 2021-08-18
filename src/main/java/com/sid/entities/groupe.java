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
public class groupe implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private String matricule;
	   private String nom;
	   @Temporal(TemporalType.DATE)
	   private Date dateIn;
	   @OneToMany(mappedBy="groupe",fetch=FetchType.LAZY)
		private Collection<ligne> lignes; 
	
	   public groupe(String matricule, String nom, Date dateIn) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.dateIn = dateIn;
	}
	   
	public Collection<ligne> getLignes() {
		return lignes;
	}

	public void setLignes(Collection<ligne> lignes) {
		this.lignes = lignes;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateIn() {
		return dateIn;
	}
	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}
	public groupe() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	   
}
