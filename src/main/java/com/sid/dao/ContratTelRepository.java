package com.sid.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.sid.entities.contrat_tel;

public interface ContratTelRepository extends JpaRepository<contrat_tel,Long> {
	
}
