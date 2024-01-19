package com.jumia.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name="PRODUIT")
public class Produit {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long CodeProduit;
	@Column(nullable = false)
	private String Reference;
	
	private String designation;
	private int prix;

}
