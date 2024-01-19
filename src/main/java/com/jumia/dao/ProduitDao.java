package com.jumia.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jumia.entities.Produit;

@Repository
public interface ProduitDao extends JpaRepository<Produit, Long> {
	 public List<Produit> findByDesignationContains(String des);
	 public List<Produit> findByPrix(int prix);
}
