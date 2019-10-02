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

import com.isoftware.primerica.paisleyfinancialservices.entity.Prospect;
import com.isoftware.primerica.paisleyfinancialservices.service.ProspectService;

@Controller
@RequestMapping("/admin/prospects")
public class ProspectController {
	
	private ProspectService prospectService;
	
	public ProspectController(ProspectService theProspectService) {
		prospectService = theProspectService;
	}
	
	@GetMapping("/list")
	public String listProspects(Model theModel) {
		
		// get Prospects from db
		List<Prospect> theProspects = prospectService.findAll();
		
		// add to the spring model
		theModel.addAttribute("Prospects", theProspects);
		
		return "Prospects/Prospect-list";
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Prospect theProspect = new Prospect();
		
		theModel.addAttribute("Prospect", theProspect);
		
		return "Prospects/Prospect-form";
	}
	

	@PostMapping("/save")
	public String saveProspect(@ModelAttribute("Prospect") Prospect theProspect) {
	
		// save the Prospect
		prospectService.save(theProspect);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/prospects/list";
	}
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("ProspectId") int theId, 
									Model theModel ) {
		
		//get the Prospect from the service
		Prospect theProspect = prospectService.findById(theId);
		
		// set Prospect as a model attribute to pre-populate the form
		theModel.addAttribute("Prospect", theProspect);
		
		// send over to our form
		return "Prospects/Prospect-form";
	}
	
	@GetMapping("/cycle")
	public String cycleProspects(@RequestParam("ProspectId") int theId, 
			Model theModel) {
		
		//get the Prospect from the service
				Prospect theProspect = prospectService.findById(theId);
				
				// set Prospect as a model attribute to pre-populate the form
				theModel.addAttribute("Prospect", theProspect);
				
				// send over to our form
				return "Prospects/Prospect-cycle";
	}
	
	@GetMapping("/next")
	public String cycleNext(@RequestParam("ProspectId") int theId, 
			Model theModel) {
		
		Prospect theNextProspect = new Prospect();
		ListIterator<Prospect> iterator =  // iterator is used to iterate through element positions easier
				prospectService.findAll().listIterator();
	
		Prospect current = null;
		Prospect next = null;
		while(iterator.hasNext()) {
		    next = iterator.next();
		    if (current != null ) { 
		    						
		    	if ( current.getId() == theId ) { // if current element has same Id
			         theNextProspect = next;      //next contains the next obj
			    }
		    }
		    current = next; // Save what was the "next" as the next "current".
		}
		//check if next obj is null, if so cycle to first record
		if(theNextProspect.getId() == 0)
			theNextProspect = prospectService.findAll().listIterator().next();
		// set Prospect as a model attribute to pre-populate the form
		theModel.addAttribute("Prospect", theNextProspect);
		
		// send over to our table
		return "Prospects/Prospect-cycle";	
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("ProspectId") int theId) {
		//delete the Prospect
		prospectService.deleteById(theId);
		
		//redirect to /Prospect/list
		return "redirect:/admin/prospects/list";
	}

}
