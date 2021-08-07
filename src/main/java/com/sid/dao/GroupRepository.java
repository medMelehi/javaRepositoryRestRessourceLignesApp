package com.sid.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.groupe;
import com.sid.entities.ligne;
@CrossOrigin("*")
@RepositoryRestResource
public interface GroupRepository extends JpaRepository<groupe,Long> {

	@RestResource(path = "/byNom")
	public List<groupe> findByNomContains(@Param("mc") String nom);
	@RestResource(path = "/byNomPage")
	public Page<groupe> findByNomContains(@Param("mc") String nom,Pageable pageable );
	
	@RestResource(path = "/byMatricule")
	public List<groupe> findByMatriculeContains(@Param("mc") String mat);
	@RestResource(path = "/byMatriculePage")
	public Page<groupe> findByMatriculeContains(@Param("mc") String mat,Pageable pageable );
	
}