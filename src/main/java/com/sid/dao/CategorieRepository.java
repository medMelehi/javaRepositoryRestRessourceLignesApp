package com.sid.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.entities.categorie;

public interface CategorieRepository extends JpaRepository<categorie,Long> {

}
