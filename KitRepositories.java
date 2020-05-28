package com.safran.ads.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safran.ads.entities.Kit;

public interface KitRepositories extends JpaRepository<Kit, Integer> {
	boolean existsByProductAndOef(String product, String oef);
	boolean existsById(Integer id);
	List<Kit> findByEtats(String etats);
	List<Kit> findByProductAndOef(String product, String oef);
	List<Kit> findByIlots(String ilots);

}
