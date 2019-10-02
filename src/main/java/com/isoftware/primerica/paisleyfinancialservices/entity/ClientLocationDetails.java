package com.isoftware.primerica.paisleyfinancialservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_location_details")
public class ClientLocationDetails {
	
	// define fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="city")
		private String city;
		
		@Column(name="state")
		private String state;
		
		@Column(name="zip_code")
		private String zipCode;
	// fields defined
		
	// define 3 constructors(empty, all fields, all fields - id)
		public ClientLocationDetails() {
			
		}
		
		public ClientLocationDetails(int id, String city, String state, String zipCode) {
			
			this.id = id;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}

		public ClientLocationDetails(String city, String state, String zipCode) {
			
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}	
	//Constructors defined

	//getters
		public int getId() {
			return id;
		}

		public String getCity() {
			return city;
		}

		public String getState() {
			return state;
		}

		public String getZipCode() {
			return zipCode;
		}
	//setters
		public void setId(int id) {
			this.id = id;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public void setState(String state) {
			this.state = state;
		}

		public void setZipCode(String zipCode) {
			this.zipCode = zipCode;
		}
	//toString + custom methods
		@Override
		public String toString() {
			return "clientLocationDetails [id=" + id + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode
					+ "]";
		}
		
		
		
		
		
}
