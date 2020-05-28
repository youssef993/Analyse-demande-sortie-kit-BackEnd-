package com.safran.ads.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safran.ads.entities.Produits;

public interface ProduitsRepositories extends JpaRepository<Produits, Integer> {
	boolean existsByProduitAndOfAndComposant(String produit, String of, String composant);
	boolean existsById(Integer id);
	List<Produits> findByProduitAndOf(String prod, String of);
	List<Produits> findByIlot(String ilot);
	List<Produits> findByEtat(String etat);
	


}
