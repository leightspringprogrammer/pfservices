package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;

import com.isoftware.primerica.paisleyfinancialservices.entity.FollowUp;

public interface FollowUpService {
	
public List<FollowUp> findAll();
	
	public FollowUp findById(int theId);
	
	public void save(FollowUp theFollowUp);
	
	public void deleteById(int theId);
	
	public FollowUp findFirstByOrderByNameAsc();

}