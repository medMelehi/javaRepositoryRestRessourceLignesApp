package com.sid.dao;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.produit;
@CrossOrigin("*")
@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<produit,Long> {
	@RestResource(path = "/byLibelle")
	public List<produit> findByLibelleContains(@Param("mc") String libelle);
	
}
