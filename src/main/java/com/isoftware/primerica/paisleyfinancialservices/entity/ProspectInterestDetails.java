package com.isoftware.primerica.paisleyfinancialservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prospect_interest_details")
public class ProspectInterestDetails {
	
	// define fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private int id;
		
		@Column(name="financial_products")
		private boolean financialProducts;
		
		@Column(name="recruitment")
		private boolean recruitment;
		
		public ProspectInterestDetails() {
			
		}

		public ProspectInterestDetails(int id, boolean financialProducts, boolean recruitment) {
			this.id = id;
			this.financialProducts = financialProducts;
			this.recruitment = recruitment;
		}

		public ProspectInterestDetails(boolean financialProducts, boolean recruitment) {
			this.financialProducts = financialProducts;
			this.recruitment = recruitment;
		}

		public int getId() {
			return id;
		}

		public boolean isFinancialProducts() {
			return financialProducts;
		}

		public boolean isRecruitment() {
			return recruitment;
		}

		public void setId(int id) {
			this.id = id;
		}

		public void setFinancialProducts(boolean financialProducts) {
			this.financialProducts = financialProducts;
		}

		public void setRecruitment(boolean recruitment) {
			this.recruitment = recruitment;
		}

		@Override
		public String toString() {
			return "ProspectInterestDetails [id=" + id + ", financialProducts=" + financialProducts + ", recruitment="
					+ recruitment + "]";
		}
		
		
		
		
		
		
		
		
		
		
		
}
