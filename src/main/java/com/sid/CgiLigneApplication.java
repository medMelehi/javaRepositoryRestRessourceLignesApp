package com.sid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.sid.dao.CategorieRepository;
import com.sid.dao.LigneRepository;
import com.sid.dao.ProduitRepository;
import com.sid.entities.categorie;
import com.sid.entities.contrat_tel;
import com.sid.entities.evenement;
import com.sid.entities.facture;
import com.sid.entities.groupe;
import com.sid.entities.ligne;
import com.sid.entities.produit;
import com.sid.entities.reengagement;
import com.sid.entities.site;
import com.sid.entities.telephone;
import com.sid.entities.titulaire;

@SpringBootApplication
public class CgiLigneApplication implements CommandLineRunner {
	@Autowired
	private ProduitRepository produitRepo;
	@Autowired
	private CategorieRepository categorieRepo;
	@Autowired
	private LigneRepository ligneRepo;
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(CgiLigneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(produit.class,titulaire.class,site.class
				,categorie.class,contrat_tel.class,evenement.class,facture.class,
				groupe.class,ligne.class,reengagement.class,telephone.class);
//		
//		categorieRepo.save(new categorie("cat1"));
//		categorieRepo.save(new categorie("cat2"));
//		categorieRepo.save(new categorie("cat3"));
//		
//		ligne l1 = new ligne("inwi","0111111111", null, null);
//		ligne l2 = new ligne("inwi","022222222", null, null);
//		ligne l3 = new ligne("inwi","3333333333", null, null);
//		ligne l4 = new ligne("inwi","4444444444", null, null);
//		l1.setCategorie(categorieRepo.getById((long) 1));
//		l2.setCategorie(categorieRepo.getById((long) 2));
//		l3.setCategorie(categorieRepo.getById((long) 3));
//		l4.setCategorie(categorieRepo.getById((long) 3));
//		
//		ligneRepo.save(l1);
//		ligneRepo.save(l2);
//		ligneRepo.save(l3);
//		ligneRepo.save(l4);
//		
//		
//		produitRepo.save(new produit("10h", 199.0));
//		produitRepo.save(new produit("20h", 350.0));
//		produitRepo.save(new produit("40h", 500.0));
		
		produitRepo.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}

}
