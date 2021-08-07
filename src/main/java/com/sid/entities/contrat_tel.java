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
public class contrat_tel implements Serializable{
	@Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private int idTel;
	   private int idTitulaire;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date date;
	   
	   
	public contrat_tel(int idTel, int idTitulaire, Date date) {
		super();
		this.idTel = idTel;
		this.idTitulaire = idTitulaire;
		this.date = date;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdTel() {
		return idTel;
	}
	public void setIdTel(int idTel) {
		this.idTel = idTel;
	}
	public int getIdTitulaire() {
		return idTitulaire;
	}
	public void setIdTitulaire(int idTitulaire) {
		this.idTitulaire = idTitulaire;
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
