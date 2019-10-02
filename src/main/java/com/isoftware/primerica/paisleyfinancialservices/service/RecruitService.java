package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;

import com.isoftware.primerica.paisleyfinancialservices.entity.Recruit;

public interface RecruitService {
	
public List<Recruit> findAll();
	
	public Recruit findById(int theId);
	
	public void save(Recruit theRecruit);
	
	public void deleteById(int theId);

}