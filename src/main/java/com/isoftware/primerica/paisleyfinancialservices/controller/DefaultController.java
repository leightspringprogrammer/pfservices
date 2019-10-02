package com.isoftware.primerica.paisleyfinancialservices.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.isoftware.primerica.paisleyfinancialservices.entity.Email;

@Controller
@RequestMapping("/")
public class DefaultController {
	
	
	
	
	@GetMapping("/")
	public String showHomePage() {
		return "../static/index";
	}
	
	@GetMapping("/admin")
	public String showAdmin(Model theModel) {

		return "General/admin";
	}
	
	@GetMapping("/about")
	public String showAbout() {
		
		return "General/about";
	}
	
	@GetMapping("/contact")
	public String showContact(Model theModel) {
		
		theModel.addAttribute("Email", new Email());
		
		return "General/contact";
	}
	
	@GetMapping("/email")
	public void email(@ModelAttribute Email theEmail) {
		System.out.println("email sent!");

	    	   
		
	}
	
	@GetMapping("/lifeinsurance")
	public String showLife() {
		
		return "General/lifeinsurance";
	}
	@GetMapping("/homeinsurance")
	public String showHome() {
		
		return "General/homeinsurance";
	}
	@GetMapping("/autoinsurance")
	public String showAuto() {
		
		return "General/autoinsurance";
	}
	
	@GetMapping("/debtconsolidation")
	public String showDebt() {
		
		return "General/debtconsolidation";
	}
	@GetMapping("/taxresolution")
	public String showTax() {
		
		return "General/taxresolution";
	}
	@GetMapping("/prepaidlegal")
	public String showLegal() {
		
		return "General/prepaidlegal";
	}
	@GetMapping("/identitytheft")
	public String showIdentity() {
		
		return "General/identitytheft";
	}
	
	@GetMapping("/collegefunds")
	public String showCollege() {
		
		return "General/collegefunds";
	}
	@GetMapping("/mutualfunds")
	public String showMutual() {
		
		return "General/mutualfunds";
	}
	@GetMapping("/variableannuity")
	public String showVariable() {
		
		return "General/variableannuity";
	}
	
	@GetMapping("/401k")
	public String showFourOneK() {
		
		return "General/fouroneK";
	}
	@GetMapping("/43b")
	public String showFourThreeB() {
		
		return "General/fourthreeB";
	}
	@GetMapping("/ira")
	public String showIRA() {
		
		return "General/ira";
	}
	@GetMapping("/rothira")
	public String showRoth() {
		
		return "General/rothira";
	}
	

	
}


