package com.isoftware.primerica.paisleyfinancialservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isoftware.primerica.paisleyfinancialservices.dao.ClientRepository;
import com.isoftware.primerica.paisleyfinancialservices.entity.Client;

@Service
public class ClientServiceImpl implements ClientService {


	private ClientRepository clientRepository;
	
	@Autowired
	public ClientServiceImpl(ClientRepository theclientRepository) {
		clientRepository = theclientRepository;
	}

	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
		
	}

	@Override
	public Client findById(int theId) {
		
		Optional<Client> result = clientRepository.findById(theId);
		Client theclient = null;
		
		if(result.isPresent()) {
			theclient = result.get();
		}
		else {
			// we didn't find the client
			throw new RuntimeException("Did not find client id - " + theId);
		}
		return theclient;
	}

	@Override
	public void save(Client theclient) {
		
		
		clientRepository.save(theclient);

	}

	@Override
	public void deleteById(int theId) {
		clientRepository.deleteById(theId);

	}

	@Override
	public List<Client> searchFor(String theSearchName) {
		
	return clientRepository.findByFirstNameStartingWith(theSearchName);
	}

}
