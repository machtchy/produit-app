package com.jumia;

import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jumia.dao.ProduitDao;
import com.jumia.entities.Produit;

@SpringBootApplication
public class GestionProduitsApplication implements CommandLineRunner{

	@Autowired
	private ProduitDao pdao;
	public static void main(String[] args) {
		SpringApplication.run(GestionProduitsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Produit p=new Produit(null,"P12546","PC PORTABLE HP PAVILLON",200);
		Produit p2=new Produit(null,"s4587","DELL GAMER 215",4500);
		this.pdao.save(p);
		this.pdao.save(p2);
		
		
	}

}
