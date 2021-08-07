package com.sid.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.telephone;
import com.sid.entities.titulaire;
@CrossOrigin("*")
@RepositoryRestResource
public interface TelephoneRepository extends JpaRepository<telephone,Long>{
	@RestResource(path = "/byMarque")
	public List<telephone> findByMarqueContains(@Param("mc") String marque);
	@RestResource(path = "/byMarquePage")
	public Page<telephone> findByMarqueContains(@Param("mc") String marque,Pageable pageable );
	@RestResource(path = "/byModel")
	public List<telephone> findByModelContains(@Param("mc") String model);
	@RestResource(path = "/byModelPage")
	public Page<telephone> findByModelContains(@Param("mc") String model,Pageable pageable );
	@RestResource(path = "/byImei")
	public List<telephone> findByImeiContains(@Param("mc") String imei);
	@RestResource(path = "/byImeiPage")
	public Page<telephone> findByImeiContains(@Param("mc") String imei,Pageable pageable );
}
