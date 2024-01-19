package com.jumia.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jumia.dao.ProduitDao;
import com.jumia.entities.Produit;


@Service
public class ProduitServiceImpl implements IProduitService{

	
	@Autowired
	private ProduitDao pdao;
	@Override
	public Produit addProduit(Produit p) {
		
		return this.pdao.save(p);
	}

	@Override
	public Produit updateProduit(Produit p, Long id) {
		Produit PInDb=getProduitById(id);
		PInDb.setReference(p.getReference());
		PInDb.setDesignation(p.getDesignation());
		PInDb.setPrix(p.getPrix());
		
		return this.pdao.save(PInDb);
	}

	@Override
	public void deleteProduit(Long id) {
		this.pdao.deleteById(id);
		
	}

	@Override
	public List<Produit> getAllProduit() {
		
		return this.pdao.findAll();
	}

	@Override
	public Produit getProduitById(Long id) {
		
		return this.pdao.findById(id).orElse(null);
	}

	@Override
	public List<Produit> SearchProduitsByDesignation(String des) {
		
		return this.pdao.findByDesignationContains(des);
	}

}
