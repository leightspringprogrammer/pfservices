package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoftware.primerica.paisleyfinancialservices.dao.RecruitRepository;
import com.isoftware.primerica.paisleyfinancialservices.entity.Recruit;

@Service
public class RecruitServiceImpl implements RecruitService {


	private RecruitRepository RecruitRepository;
	
	@Autowired
	public RecruitServiceImpl(RecruitRepository theRecruitRepository) {
		RecruitRepository = theRecruitRepository;
	}

	@Override
	public List<Recruit> findAll() {
		return RecruitRepository.findAll();
		
	}

	@Override
	public Recruit findById(int theId) {
		
		Optional<Recruit> result = RecruitRepository.findById(theId);
		Recruit theRecruit = null;
		
		if(result.isPresent()) {
			theRecruit = result.get();
		}
		else {
			// we didn't find the Recruit
			throw new RuntimeException("Did not find Recruit id - " + theId);
		}
		return theRecruit;
	}

	@Override
	public void save(Recruit theRecruit) {
		
		
		RecruitRepository.save(theRecruit);

	}

	@Override
	public void deleteById(int theId) {
		RecruitRepository.deleteById(theId);

	}

}
