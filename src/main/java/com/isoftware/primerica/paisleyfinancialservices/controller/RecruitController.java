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

import com.isoftware.primerica.paisleyfinancialservices.entity.Recruit;
import com.isoftware.primerica.paisleyfinancialservices.service.RecruitService;

@Controller
@RequestMapping("/admin/recruits")
public class RecruitController {
	
	private RecruitService RecruitService;
	
	public RecruitController(RecruitService theRecruitService) {
		RecruitService = theRecruitService;
	}
	
	@GetMapping("/list")
	public String listRecruits(Model theModel) {
		
		// get Recruits from db
		List<Recruit> theRecruits = RecruitService.findAll();
		
		// add to the spring model
		theModel.addAttribute("Recruits", theRecruits);
		
		return "Recruits/Recruit-list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Recruit theRecruit = new Recruit();
		
		theModel.addAttribute("Recruit", theRecruit);
		
		return "Recruits/Recruit-form";
	}
	
	@PostMapping("/save")
	public String saveRecruit(@ModelAttribute("Recruit") Recruit theRecruit) {
		
			// save the Recruit
		RecruitService.save(theRecruit);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/recruits/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("RecruitId") int theId, 
									Model theModel ) {
		
		//get the Recruit from the service
		Recruit theRecruit = RecruitService.findById(theId);
		// set Recruit as a model attribute to pre-populate the form
		theModel.addAttribute("Recruit", theRecruit);
		// send over to our form
		return "Recruits/Recruit-form";
	}
	

	@GetMapping("/cycle")
	public String cycleRecruits(@RequestParam("RecruitId") int theId, 
			Model theModel) {
		
		//get the Recruit from the service
				Recruit theRecruit = RecruitService.findById(theId);
				
				// set Recruit as a model attribute to pre-populate the form
				theModel.addAttribute("Recruit", theRecruit);
				
				// send over to our form
				return "Recruits/Recruit-cycle";
	}
	
	@GetMapping("/next")
	public String cycleNext(@RequestParam("RecruitId") int theId, 
			Model theModel) {
		
		Recruit theNextRecruit = new Recruit();
		ListIterator<Recruit> iterator = 
				RecruitService.findAll().listIterator();
	
		Recruit current = null;
		Recruit next = null;
		while(iterator.hasNext()) {
		    next = iterator.next();
		    if (current != null ) { // Passed the first iteration
		    						// Can use both next and current now
		    	if ( current.getId() == theId ) { // if current element has same Id
			         theNextRecruit = next;      //next contains the next obj
			    }
		    }
		    current = next; // Save what was the "next" as the next "current".
		}
		//check if next obj is null, if so cycle to first record
		if( theNextRecruit.getId() == 0 )
			theNextRecruit = RecruitService.findAll().listIterator().next();
		// set Recruit as a model attribute to pre-populate the form
		theModel.addAttribute("Recruit", theNextRecruit);
		
		// send over to our table
		return "Recruits/Recruit-cycle";	
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("RecruitId") int theId) {
		//delete the Recruit
		RecruitService.deleteById(theId);
		
		//redirect to /Recruit/list
		return "redirect:/admin/recruits/list";
	}

}
