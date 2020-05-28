package com.safran.ads.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.safran.ads.entities.Profiles;


public interface ProfilesRepositories extends JpaRepository<Profiles, Integer> {
	
	Profiles findOneByUsername(String username);
	boolean existsByUsername(String login);
	boolean existsByUsernameAndId(String username, Integer id);
}
