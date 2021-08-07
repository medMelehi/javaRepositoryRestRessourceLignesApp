package com.sid.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.facture;
import com.sid.entities.groupe;
@CrossOrigin("*")
@RepositoryRestResource
public interface FactureRepository extends JpaRepository<facture,Long>{
	
	
	@RestResource(path = "/byAnneeMois")
	public List<facture> findByMoisAndAnnee(@Param("mois") int mois , @Param("annee") int annee);
	@RestResource(path = "/byAnneeMoisPage")
	public Page<facture> findByMoisAndAnnee(@Param("mois") int mois , @Param("annee") int annee,Pageable pageable );
	
	@RestResource(path = "/byAnnee")
	public List<facture> findByAnnee( @Param("annee") int annee);
	@RestResource(path = "/byAnneePage")
	public Page<facture> findByAnnee(@Param("annee") int annee, Pageable pageable );
	
	@RestResource(path = "/byComment")
	public List<facture> findByCommentContains( @Param("mc") String comment);
	@RestResource(path = "/byCommentPage")
	public Page<facture> findByCommentContains(@Param("mc") String comment, Pageable pageable );
	
}
