package com.jumia.metier;

import java.util.List;

import com.jumia.entities.Produit;

public interface IProduitService {
	
	public Produit addProduit(Produit p);
	public Produit updateProduit(Produit p,Long id);
	public void deleteProduit(Long id);
	public List<Produit> getAllProduit();
	public Produit getProduitById(Long id);
	public List<Produit> SearchProduitsByDesignation(String des);
	
	

}
