package com.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class contrat_tel implements Serializable{
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date date;
	   @ManyToOne
	   @JoinColumn(name = "id_tel")
	   private telephone telephone;
	   @ManyToOne
	   @JoinColumn(name = "id_titulaire")
	   private titulaire titulaire;
	   
	   
	public contrat_tel( Date date) {
		super();
		this.date = date;
	}
	
	public telephone getTelephone() {
		return telephone;
	}

	public void setTelephone(telephone telephone) {
		this.telephone = telephone;
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

	public java.util.Date getDate() {
		return date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}
	public contrat_tel() {
		super();
		// TODO Auto-generated constructor stub
	}
	   
}
