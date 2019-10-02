package com.isoftware.primerica.paisleyfinancialservices.controller;

import java.util.List;
import java.util.ListIterator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.isoftware.primerica.paisleyfinancialservices.entity.Client;
import com.isoftware.primerica.paisleyfinancialservices.service.ClientService;

@Controller
@RequestMapping("/admin/clients")
public class ClientController {
	
	private ClientService ClientService;
	
	public ClientController(ClientService theClientService) {
		ClientService = theClientService;
	}
	
	@GetMapping("/list")
	public String listClients(Model theModel) {
		
		// get Clients from db
		List<Client> theClients = ClientService.findAll();
		
		// add to the spring model
		theModel.addAttribute("Clients", theClients);
		
		return "Clients/Client-list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Client theClient = new Client();
		
		theModel.addAttribute("Client", theClient);
		
		return "Clients/Client-form";
	}
	
	@PostMapping("/save")
	public String saveClient(@ModelAttribute("Client") Client theClient) {
	
		// save the Client
		ClientService.save(theClient);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/clients/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("ClientId") int theId, 
									Model theModel ) {
		
		//get the Client from the service
		Client theClient = ClientService.findById(theId);
		
		// set Client as a model attribute to pre-populate the form
		theModel.addAttribute("Client", theClient);
		
		// send over to our form
		return "Clients/Client-form";
	}
	
	@GetMapping("/cycle")
	public String cycleClients(@RequestParam("ClientId") int theId, 
			Model theModel) {
		
				//get the Client from the service
				Client theClient = ClientService.findById(theId);
				
				// set Client as a model attribute to pre-populate the form
				theModel.addAttribute("Client", theClient);
				
				// send over to our form
				return "Clients/Client-cycle";
	}
	
	@GetMapping("/next")
	public String cycleNext(@RequestParam("ClientId") int theId, 
			Model theModel) {
		
		Client theNextClient = new Client();
		
		ListIterator<Client> iterator =  // iterator is used to iterate through element positions easier
				ClientService.findAll().listIterator();
		Client current = null;
		Client next = null;
		
		while(iterator.hasNext()) {
		    next = iterator.next();
		    if (current != null ) { 
		    						
		    	if ( current.getId() == theId ) { 	// if current element has same Id
			         theNextClient = next;      	//next contains the next obj
			    }
		    }
		    current = next; // Save what was the "next" as the next "current".
		}
		//check if next obj is null, if so cycle to first record
		if(theNextClient.getId() == 0)
			theNextClient = ClientService.findAll().listIterator().next();
		
		// set Client as a model attribute to pre-populate the form
		theModel.addAttribute("Client", theNextClient);
		
		// send over to our table
		return "Clients/Client-cycle";	
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("ClientId") int theId) {
		//delete the Client
		ClientService.deleteById(theId);
		
		//redirect to /Client/list
		return "redirect:/admin/clients/list";
	}
	
	@GetMapping("/search")
	public String search( @RequestParam("theSearchName") String theSearchName,
							Model theModel) {
		
		// read search name from form data
        
        // execute search query
		List<Client> theClients = ClientService.searchFor(theSearchName);
        
		// add clients and send over to table
		theModel.addAttribute("Clients", theClients);
		
		return "Clients/Client-list";
	}

}
