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
@Table(name="client")
public class Client {
	
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
	
	@Column(name="married")
	private boolean married;
	
	@Column(name="children")
	private int children;
	
	@Column(name="recruiter")
	private String recruiter;
	
	@Column(name="last_correspondence")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate lastCorrespondence;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="client_location_details")
	private ClientLocationDetails clientLocationDetails;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="client_policy_details")
	private ClientPolicyDetails clientPolicyDetails;

	
	public Client() {
		
	}
	
	public Client(int id, String firstName, String lastName, String phoneNumber, String email, boolean married,
			int children, String recruiter, LocalDate lastCorrespondence, ClientLocationDetails clientLocationDetails,
			ClientPolicyDetails clientPolicyDetails) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.married = married;
		this.children = children;
		this.recruiter = recruiter;
		this.lastCorrespondence = lastCorrespondence;
		this.clientLocationDetails = clientLocationDetails;
		this.clientPolicyDetails = clientPolicyDetails;
	}

	public Client(String firstName, String lastName, String phoneNumber, String email, boolean married, int children,
			String recruiter, LocalDate lastCorrespondence, ClientLocationDetails clientLocationDetails,
			ClientPolicyDetails clientPolicyDetails) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.married = married;
		this.children = children;
		this.recruiter = recruiter;
		this.lastCorrespondence = lastCorrespondence;
		this.clientLocationDetails = clientLocationDetails;
		this.clientPolicyDetails = clientPolicyDetails;
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

	public boolean isMarried() {
		return married;
	}

	public int getChildren() {
		return children;
	}

	public String getRecruiter() {
		return recruiter;
	}

	public LocalDate getLastCorrespondence() {
		return lastCorrespondence;
	}

	public ClientLocationDetails getClientLocationDetails() {
		return clientLocationDetails;
	}

	public ClientPolicyDetails getClientPolicyDetails() {
		return clientPolicyDetails;
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

	public void setMarried(boolean married) {
		this.married = married;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public void setRecruiter(String recruiter) {
		this.recruiter = recruiter;
	}

	public void setLastCorrespondence(LocalDate lastCorrespondence) {
		this.lastCorrespondence = lastCorrespondence;
	}

	public void setClientLocationDetails(ClientLocationDetails clientLocationDetails) {
		this.clientLocationDetails = clientLocationDetails;
	}

	public void setClientPolicyDetails(ClientPolicyDetails clientPolicyDetails) {
		this.clientPolicyDetails = clientPolicyDetails;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", married=" + married + ", children=" + children + ", recruiter="
				+ recruiter + ", lastCorrespondence=" + lastCorrespondence + ", clientLocationDetails="
				+ clientLocationDetails + ", clientPolicyDetails=" + clientPolicyDetails + "]";
	}

	
	
	
	
	
	
	

}
