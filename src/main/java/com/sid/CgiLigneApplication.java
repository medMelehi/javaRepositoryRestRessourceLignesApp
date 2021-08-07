package com.sid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.sid.dao.ProduitRepository;
import com.sid.entities.produit;
import com.sid.entities.titulaire;

@SpringBootApplication
public class CgiLigneApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepo;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(CgiLigneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(produit.class,titulaire.class);
		produitRepo.save(new produit("10h", 199.0));
		produitRepo.save(new produit("20h", 350.0));
		produitRepo.save(new produit("40h", 500.0));
		
		produitRepo.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}

}
