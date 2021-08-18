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
public class reengagement  implements Serializable{
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	   private String numContrat;
	   @Temporal(TemporalType.DATE)
	   private java.util.Date date;
	   @ManyToOne
	   @JoinColumn(name = "id_ligne")
	   private ligne ligne;
	   @ManyToOne
	   @JoinColumn(name = "id_titulaire")
	   private titulaire titulaire;

	public reengagement(Long id, int idLigne, String numContrat, Date date) {
		super();
		this.id = id;
		this.numContrat = numContrat;
		this.date = date;
	}
	public reengagement() {
		super();
		// TODO Auto-generated constructor stub
	}
	  
	public ligne getLigne() {
		return ligne;
	}
	public void setLigne(ligne ligne) {
		this.ligne = ligne;
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
