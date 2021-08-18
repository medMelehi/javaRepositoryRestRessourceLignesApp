package com.sid.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.site;
import com.sid.entities.telephone;
import com.sid.entities.titulaire;
@CrossOrigin("*")
@RepositoryRestResource
public interface SiteRepository extends JpaRepository<site, Long> {
	
	@RestResource(path = "/byNom")
	public List<site> findByNomContains(@Param("mc") String nom);
	@RestResource(path = "/byNomPage")
	public Page<site> findByNomContains(@Param("mc") String nom,Pageable pageable );

	@RestResource(path = "/byEtat")
	public List<site> findByEtatContains(@Param("mc") String etat);
	@RestResource(path = "/byEtatPage")
	public Page<site> findByEtatContains(@Param("mc") String etat,Pageable pageable );
	
	@RestResource(path = "/byAdresse")
	public List<site> findByAdresseContains(@Param("mc") String add);
	@RestResource(path = "/byAdressePage")
	public Page<site> findByAdresseContains(@Param("mc") String add,Pageable pageable );
	
	@RestResource(path = "/byNomAdresseEtat")
	public List<site> findByNomContainsAndAdresseContainsAndEtatContains(@Param("nom") String nom,@Param("adresse") String Adresse,@Param("etat") String Etat);
	@RestResource(path = "/byNomAdresseEtatPage")
	public Page<site> findByNomContainsAndAdresseContainsAndEtatContains(@Param("nom") String nom,@Param("adresse") String Adresse,@Param("etat") String Etat,Pageable pageable );

}
