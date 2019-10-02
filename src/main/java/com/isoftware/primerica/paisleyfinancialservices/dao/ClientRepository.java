package com.isoftware.primerica.paisleyfinancialservices.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.isoftware.primerica.paisleyfinancialservices.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {


	List<Client> findByFirstNameStartingWith(String theSearchName);
}	
