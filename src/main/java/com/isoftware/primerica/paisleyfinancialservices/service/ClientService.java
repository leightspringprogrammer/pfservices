package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;

import com.isoftware.primerica.paisleyfinancialservices.entity.Client;

public interface ClientService {
	
public List<Client> findAll();
	
	public Client findById(int theId);
	
	public void save(Client theClient);
	
	public void deleteById(int theId);

	public List<Client> searchFor(String theSearchName);

}