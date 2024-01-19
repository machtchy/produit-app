package com.jumia.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jumia.entities.Produit;
import com.jumia.metier.IProduitService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/jumia")
public class ProduitController {
	@Autowired
	private IProduitService produitService;
	
	// Web Service avec Methode GET pour Récuperer la liste globale des produits
	@GetMapping("/produit")
	public List<Produit> getProductsFromDb(){
		return this.produitService.getAllProduit();
	}
	// Web Service avec Methode GET pour Récuperer un produit a partir son code
	@GetMapping("/produit/{id}")
	public Produit getProductByIdFromDb(@PathVariable("id") Long id){
		return this.produitService.getProduitById(id);
	}
	
	// Web Service avec Methode DELETE pour supprimer un produit 
	@DeleteMapping("/produit/{id}")
	public void deleteProduitByIdFromDb(@PathVariable("id") Long id){
		 this.produitService.deleteProduit(id);
	}
	
	// Web Service avec Methode POST pour ajouter un produit a la BD
	@PostMapping("/produit")
	public Produit addProduittoDb(@RequestBody Produit p){
		return this.produitService.addProduit(p);
	}
	
	// Web Service avec Methode PUT pour modifier un produit dans La BD
	@PutMapping("/produit/{id}")
	public Produit EditProduitInDb(@RequestBody Produit p,@PathVariable("id") Long id){
		return this.produitService.updateProduit(p,id);
	}
	
	// Web Service avec Methode GET pour Récuperer la liste globale des produits
	@GetMapping("/searchProduit/{des}")
	public List<Produit> searchForProductsByDesignation(@PathVariable("des") String des){
		return this.produitService.SearchProduitsByDesignation(des);
	}

}
