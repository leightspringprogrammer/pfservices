package com.isoftware.primerica.paisleyfinancialservices.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="recruit")
public class Recruit {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="recruiter")
	private String recruiter;
	
	@Column(name="promotion")
	private String promotion;
	
	@Column(name="last_correspondence")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lastCorrespondence;

	public Recruit() {
		
	}
	
	public Recruit(int id, String firstName, String lastName, String phoneNumber, String email, String recruiter,
			String promotion, LocalDate lastCorrespondence) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.recruiter = recruiter;
		this.promotion = promotion;
		this.lastCorrespondence = lastCorrespondence;
	}

	public Recruit(String firstName, String lastName, String phoneNumber, String email, String recruiter, String promotion,
			LocalDate lastCorrespondence) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.recruiter = recruiter;
		this.promotion = promotion;
		this.lastCorrespondence = lastCorrespondence;
	}
	


	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getRecruiter() {
		return recruiter;
	}

	public String getPromotion() {
		return promotion;
	}

	public LocalDate getLastCorrespondence() {
		return lastCorrespondence;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public void setLastCorrespondence(LocalDate lastCorrespondence) {
		this.lastCorrespondence = lastCorrespondence;
	}

	@Override
	public String toString() {
		return "Recruit [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", recruiter=" + recruiter + ", promotion=" + promotion
				+ ", lastCorrespondence=" + lastCorrespondence + "]";
	}
	
	
	
	
	
	
	

}
