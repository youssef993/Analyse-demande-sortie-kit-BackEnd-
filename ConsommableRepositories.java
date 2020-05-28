package com.safran.ads.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safran.ads.entities.Consommable;



public interface ConsommableRepositories extends JpaRepository<Consommable, Integer>{
	List<Consommable> findByEtat(String etat);
	List<Consommable> findByComposant(String compsant);
	List<Consommable> findByIlot(String ilot);
}
