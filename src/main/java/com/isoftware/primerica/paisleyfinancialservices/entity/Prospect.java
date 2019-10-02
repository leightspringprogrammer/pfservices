package com.isoftware.primerica.paisleyfinancialservices.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="prospect")
public class Prospect {
	
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
	
	@Column(name="occupation")
	private String occupation;
	
	@Column(name="married")
	private boolean married;
	
	@Column(name="children")
	private int children;
	
	@Column(name="enthusiasm")
	private int enthusiasm;
	
	@Column(name="last_correspondence")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lastCorrespondence;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="prospect_location_details")
	private ProspectLocationDetails prospectLocationDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="prospect_interest_details")
	private ProspectInterestDetails prospectInterestDetails;

	
	public Prospect() {
		
	}
	
	public Prospect(int id, String firstName, String lastName, String phoneNumber, String email, String occupation,
			boolean married, int children, int enthusiasm, LocalDate lastCorrespondence,
			ProspectLocationDetails prospectLocationDetails, ProspectInterestDetails prospectInterestDetails) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.occupation = occupation;
		this.married = married;
		this.children = children;
		this.enthusiasm = enthusiasm;
		this.lastCorrespondence = lastCorrespondence;
		this.prospectLocationDetails = prospectLocationDetails;
		this.prospectInterestDetails = prospectInterestDetails;
	}

	public Prospect(String firstName, String lastName, String phoneNumber, String email, String occupation,
			boolean married, int children, int enthusiasm, LocalDate lastCorrespondence,
			ProspectLocationDetails prospectLocationDetails, ProspectInterestDetails prospectInterestDetails) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.occupation = occupation;
		this.married = married;
		this.children = children;
		this.enthusiasm = enthusiasm;
		this.lastCorrespondence = lastCorrespondence;
		this.prospectLocationDetails = prospectLocationDetails;
		this.prospectInterestDetails = prospectInterestDetails;
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

	public String getOccupation() {
		return occupation;
	}

	public boolean isMarried() {
		return married;
	}

	public int getChildren() {
		return children;
	}

	public int getEnthusiasm() {
		return enthusiasm;
	}

	public LocalDate getLastCorrespondence() {
		return lastCorrespondence;
	}

	public ProspectLocationDetails getProspectLocationDetails() {
		return prospectLocationDetails;
	}

	public ProspectInterestDetails getProspectInterestDetails() {
		return prospectInterestDetails;
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

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public void setEnthusiasm(int enthusiasm) {
		this.enthusiasm = enthusiasm;
	}

	public void setLastCorrespondence(LocalDate lastCorrespondence) {
		this.lastCorrespondence = lastCorrespondence;
	}

	public void setProspectLocationDetails(ProspectLocationDetails prospectLocationDetails) {
		this.prospectLocationDetails = prospectLocationDetails;
	}

	public void setProspectInterestDetails(ProspectInterestDetails prospectInterestDetails) {
		this.prospectInterestDetails = prospectInterestDetails;
	}

	@Override
	public String toString() {
		return "Prospect [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", occupation=" + occupation + ", married=" + married
				+ ", children=" + children + ", enthusiasm=" + enthusiasm + ", lastCorrespondence=" + lastCorrespondence
				+ ", prospectLocationDetails=" + prospectLocationDetails + ", prospectInterestDetails="
				+ prospectInterestDetails + "]";
	}
	
	
	
	
	

}
