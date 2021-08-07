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
public class reengagement  implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	   private int idTitulaire;
	   private int idLigne;
	   private String numContrat;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date date;

	public reengagement(Long id, int idTitulaire, int idLigne, String numContrat, Date date) {
		super();
		this.id = id;
		this.idTitulaire = idTitulaire;
		this.idLigne = idLigne;
		this.numContrat = numContrat;
		this.date = date;
	}
	public reengagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public int getIdTitulaire() {
		return idTitulaire;
	}
	public void setIdTitulaire(int idTitulaire) {
		this.idTitulaire = idTitulaire;
	}
	public int getIdLigne() {
		return idLigne;
	}
	public void setIdLigne(int idLigne) {
		this.idLigne = idLigne;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getNumContrat() {
		return numContrat;
	}
	public void setNumContrat(String numContrat) {
		this.numContrat = numContrat;
	}
 
	
	   
}
