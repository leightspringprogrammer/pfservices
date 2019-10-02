package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;

import com.isoftware.primerica.paisleyfinancialservices.entity.Prospect;

public interface ProspectService {
	
public List<Prospect> findAll();
	
	public Prospect findById(int theId);
	
	public void save(Prospect theProspect);
	
	public void deleteById(int theId);

}