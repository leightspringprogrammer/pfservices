package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoftware.primerica.paisleyfinancialservices.dao.ProspectRepository;
import com.isoftware.primerica.paisleyfinancialservices.entity.Prospect;

@Service
public class ProspectServiceImpl implements ProspectService {


	private ProspectRepository prospectRepository;
	
	@Autowired
	public ProspectServiceImpl(ProspectRepository theProspectRepository) {
		prospectRepository = theProspectRepository;
	}

	@Override
	public List<Prospect> findAll() {
		return prospectRepository.findAll();
		
	}

	@Override
	public Prospect findById(int theId) {
		
		Optional<Prospect> result = prospectRepository.findById(theId);
		Prospect theProspect = null;
		
		if(result.isPresent()) {
			theProspect = result.get();
		}
		else {
			// we didn't find the Prospect
			throw new RuntimeException("Did not find Prospect id - " + theId);
		}
		return theProspect;
	}

	@Override
	public void save(Prospect theProspect) {
		
		
		prospectRepository.save(theProspect);

	}

	@Override
	public void deleteById(int theId) {
		prospectRepository.deleteById(theId);

	}

}
