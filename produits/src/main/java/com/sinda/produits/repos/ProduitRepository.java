package com.sinda.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sinda.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
