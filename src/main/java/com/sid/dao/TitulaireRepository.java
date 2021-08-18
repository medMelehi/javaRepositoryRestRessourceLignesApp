package com.sid.dao;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.titulaire;
@CrossOrigin("*")
@RepositoryRestResource
public interface TitulaireRepository extends JpaRepository<titulaire,Long>{
	@RestResource(path = "/byNom")
	public List<titulaire> findByNomContains(@Param("mc") String nom);
	@RestResource(path = "/byNomPage")
	public Page<titulaire> findByNomContains(@Param("mc") String nom,Pageable pageable );
	
	@RestResource(path = "/byMat")
	public List<titulaire> findByMatriculeContains(@Param("mat") String matricule);
	@RestResource(path = "/byMatPage")
	public Page<titulaire> findByMatriculeContains(@Param("mat") String matricule,Pageable pageable );
	
	@RestResource(path = "/byEmail")
	public List<titulaire> findByEmailContains(@Param("email") String email);
	@RestResource(path = "/byEmailPage")
	public Page<titulaire> findByEmailContains(@Param("email") String email,Pageable pageable );
	
	@RestResource(path = "/byNomMat")
	public List<titulaire> findByNomContainsAndMatriculeContains(@Param("nom") String nom,@Param("mat") String matricule);
	@RestResource(path = "/byNomMatPage")
	public Page<titulaire> findByNomAndMatriculeContains(@Param("nom") String nom,@Param("mat") String matricule,Pageable pageable );
	
	@RestResource(path = "/byNomEmail")
	public List<titulaire> findByNomAndEmailContains(@Param("nom") String nom,@Param("email") String email);
	@RestResource(path = "/byNomEmailPage")
	public Page<titulaire> findByNomAndEmailContains(@Param("nom") String nom,@Param("email") String email,Pageable pageable );
	
	@RestResource(path = "/byMatEmail")
	public List<titulaire> findByMatriculeAndEmailContains(@Param("mat") String matricule,@Param("email") String email);
	@RestResource(path = "/byMatEmailPage")
	public Page<titulaire> findByMatriculeAndEmailContains(@Param("mat") String matricule,@Param("email") String email,Pageable pageable );
	
	@RestResource(path = "/byNomEmailMat")
	public List<titulaire> findByNomContainsAndEmailContainsAndMatriculeContains(@Param("nom") String nom,@Param("email") String Email,@Param("mat") String matricule);
	@RestResource(path = "/byNomEmailMatPage")
	public Page<titulaire> findByNomContainsAndEmailContainsAndMatriculeContains(@Param("nom") String nom,@Param("email") String Email,@Param("mat") String matricule,Pageable pageable );
}
