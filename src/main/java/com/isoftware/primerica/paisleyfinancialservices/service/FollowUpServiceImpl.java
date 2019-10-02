package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoftware.primerica.paisleyfinancialservices.dao.FollowUpRepository;
import com.isoftware.primerica.paisleyfinancialservices.entity.FollowUp;

@Service
public class FollowUpServiceImpl implements FollowUpService {


	private FollowUpRepository FollowUpRepository;
	
	@Autowired
	public FollowUpServiceImpl(FollowUpRepository theFollowUpRepository) {
		FollowUpRepository = theFollowUpRepository;
	}

	@Override
	public List<FollowUp> findAll() {
		return FollowUpRepository.findAll();
		
	}

	@Override
	public FollowUp findById(int theId) {
		
		Optional<FollowUp> result = FollowUpRepository.findById(theId);
		FollowUp theFollowUp = null;
		
		if(result.isPresent()) {
			theFollowUp = result.get();
		}
		else {
			// we didn't find the FollowUp
			throw new RuntimeException("Did not find FollowUp id - " + theId);
		}
		return theFollowUp;
	}

	@Override
	public void save(FollowUp theFollowUp) {
		
		
		FollowUpRepository.save(theFollowUp);

	}

	@Override
	public void deleteById(int theId) {
		FollowUpRepository.deleteById(theId);

	}

	@Override
	public FollowUp findFirstByOrderByNameAsc() {
		
		return FollowUpRepository.findFirstByOrderByNameAsc();
	}

	

	
}
