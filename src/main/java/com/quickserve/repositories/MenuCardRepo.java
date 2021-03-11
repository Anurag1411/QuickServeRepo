package com.quickserve.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quickserve.entities.Menu;

@Repository
public interface MenuCardRepo extends JpaRepository<Menu, String> {
	
	
	
}
