package com.isoftware.primerica.paisleyfinancialservices.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.isoftware.primerica.paisleyfinancialservices.entity.FollowUp;
import com.isoftware.primerica.paisleyfinancialservices.service.FollowUpService;

//this class is meant to be redone as 'appointment' rather than 'followup' 
@Controller
@RequestMapping("/admin/appointments")
public class FollowUpController {
	
	private FollowUpService FollowUpService;
	
	public FollowUpController(FollowUpService theFollowUpService) {
		FollowUpService = theFollowUpService;
	}
	
	@GetMapping("/list")
	public String listFollowUps(Model theModel) {
		
		// get FollowUps from db
		List<FollowUp> theFollowUps = FollowUpService.findAll();
		
		// add to the spring model
		theModel.addAttribute("FollowUps", theFollowUps);
		
		return "FollowUps/appointment-list";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		FollowUp theFollowUp = new FollowUp();
		
		theModel.addAttribute("FollowUp", theFollowUp);
		
		return "FollowUps/appointment-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("appointmentId") int theId, 
									Model theModel ) {
		
		//get the FollowUp from the service
		FollowUp theFollowUp = FollowUpService.findById(theId);
		// set FollowUp as a model attribute to pre-populate the form
		theModel.addAttribute("FollowUp", theFollowUp);
		// send over to our form
		return "FollowUps/appointment-form";
		
	}
	
	@PostMapping("/save")
	public String saveFollowUp(@ModelAttribute("FollowUp") FollowUp theFollowUp) {
		
			// save the FollowUp
		FollowUpService.save(theFollowUp);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/admin/appointments/list";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("appointmentId") int theId) {
		//delete the FollowUp
		FollowUpService.deleteById(theId);
		
		//redirect to /FollowUp/list
		return "redirect:/admin/appointments/list";
	}

}
