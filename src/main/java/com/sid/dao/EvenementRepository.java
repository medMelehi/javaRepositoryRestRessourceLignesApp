package com.sid.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.evenement;
import com.sid.entities.facture;
@CrossOrigin("*")
@RepositoryRestResource
public interface EvenementRepository extends JpaRepository<evenement,Long> {

	@RestResource(path = "/byAnneeMois")
	public List<evenement> findByMoisAndAnnee(@Param("mois") int mois , @Param("annee") int annee);
	@RestResource(path = "/byAnneeMoisPage")
	public Page<evenement> findByMoisAndAnnee(@Param("mois") int mois , @Param("annee") int annee,Pageable pageable );
	
	@RestResource(path = "/byAnnee")
	public List<evenement> findByAnnee( @Param("annee") int annee);
	@RestResource(path = "/byAnneePage")
	public Page<evenement> findByAnnee(@Param("annee") int annee, Pageable pageable );
	
	@RestResource(path = "/byComment")
	public List<evenement> findByCommentContains( @Param("mc") String comment);
	@RestResource(path = "/byCommentPage")
	public Page<evenement> findByCommentContains(@Param("mc") String comment, Pageable pageable );
	
}
