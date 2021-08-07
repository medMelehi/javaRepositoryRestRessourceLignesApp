package com.sid.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.ligne;
@CrossOrigin("*")
@RepositoryRestResource
public interface LigneRepository extends JpaRepository<ligne,Long>{

	@RestResource(path = "/byOperateur")
	public List<ligne> findByOperateurContains(@Param("mc") String operateur);
	@RestResource(path = "/byOperateurPage")
	public Page<ligne> findByOperateurContains(@Param("mc") String operateur,Pageable pageable );
	
	@RestResource(path = "/byNumLigne")
	public List<ligne> findByNumLigneContains(@Param("mc") String num);
	@RestResource(path = "/byNumLignePage")
	public Page<ligne> findByNumLigneContains(@Param("mc") String num,Pageable pageable );
	
}
