package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sid.entities.reengagement;
@CrossOrigin("*")
@RepositoryRestResource
public interface ReengagementRepository extends JpaRepository<reengagement,Long> {

}
