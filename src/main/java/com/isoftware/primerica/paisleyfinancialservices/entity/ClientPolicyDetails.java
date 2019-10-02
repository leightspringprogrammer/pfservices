package com.isoftware.primerica.paisleyfinancialservices.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_policy_details")
public class ClientPolicyDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="life_id")
	private int lifeId;
	@Column(name="life_policy")
	private int lifePolicy;
	@Column(name="home_id")
	private int homeId;
	@Column(name="home_policy")
	private int homePolicy;
	@Column(name="auto_id")
	private int autoId;
	@Column(name="auto_policy")
	private int autoPolicy;
	
	@Column(name="debt_id")
	private int debtId;
	@Column(name="debt_policy")
	private int debtPolicy;
	@Column(name="tax_id")
	private int taxId;
	@Column(name="tax_policy")
	private int taxPolicy;
	@Column(name="prepaidlegal_id")
	private int prepaidlegalId;
	@Column(name="prepaidlegal_policy")
	private int prepaidlegalPolicy;
	@Column(name="identitytheft_id")
	private int identitytheftId;
	@Column(name="identitytheft_policy")
	private int identitytheftPolicy;
	
	@Column(name="collegefund_id")
	private int collegefundId;
	@Column(name="collegefund_policy")
	private int collegefundPolicy;
	@Column(name="mutualfund_id")
	private int mutualfundId;
	@Column(name="mutualfund_policy")
	private int mutualfundPolicy;
	
	@Column(name="ira_id")
	private int iraId;
	@Column(name="ira_policy")
	private int iraPolicy;
	@Column(name="roth_ira_id")
	private int rothiraId;
	@Column(name="roth_ira_policy")
	private int rothiraPolicy;
	
	@Column(name="fouronek_id")
	private int fouronekId;
	@Column(name="fouronek_policy")
	private int fouronekPolicy;
	@Column(name="fourthreeb_id")
	private int fourthreebId;
	@Column(name="fourthreeb_policy")
	private int fourthreebPolicy;
	
	@Column(name="variableannuity_id")
	private int variableannuityId;
	@Column(name="variableannuity_policy")
	private int variableannuityPolicy;
	
	
	public ClientPolicyDetails() {
		
	}
	
	public ClientPolicyDetails(int id, int lifeId, int lifePolicy, int homeId, int homePolicy, int autoId,
			int autoPolicy, int debtId, int debtPolicy, int taxId, int taxPolicy, int prepaidlegalId,
			int prepaidlegalPolicy, int identitytheftId, int identitytheftPolicy, int collegefundId,
			int collegefundPolicy, int mutualfundId, int mutualfundPolicy, int iraId, int iraPolicy, int rothiraId,
			int rothiraPolicy, int fouronekId, int fouronekPolicy, int fourthreebId, int fourthreebPolicy,
			int variableannuityId, int variableannuityPolicy) {
		
		this.id = id;
		this.lifeId = lifeId;
		this.lifePolicy = lifePolicy;
		this.homeId = homeId;
		this.homePolicy = homePolicy;
		this.autoId = autoId;
		this.autoPolicy = autoPolicy;
		this.debtId = debtId;
		this.debtPolicy = debtPolicy;
		this.taxId = taxId;
		this.taxPolicy = taxPolicy;
		this.prepaidlegalId = prepaidlegalId;
		this.prepaidlegalPolicy = prepaidlegalPolicy;
		this.identitytheftId = identitytheftId;
		this.identitytheftPolicy = identitytheftPolicy;
		this.collegefundId = collegefundId;
		this.collegefundPolicy = collegefundPolicy;
		this.mutualfundId = mutualfundId;
		this.mutualfundPolicy = mutualfundPolicy;
		this.iraId = iraId;
		this.iraPolicy = iraPolicy;
		this.rothiraId = rothiraId;
		this.rothiraPolicy = rothiraPolicy;
		this.fouronekId = fouronekId;
		this.fouronekPolicy = fouronekPolicy;
		this.fourthreebId = fourthreebId;
		this.fourthreebPolicy = fourthreebPolicy;
		this.variableannuityId = variableannuityId;
		this.variableannuityPolicy = variableannuityPolicy;
	}


	public ClientPolicyDetails(int lifeId, int lifePolicy, int homeId, int homePolicy, int autoId, int autoPolicy,
			int debtId, int debtPolicy, int taxId, int taxPolicy, int prepaidlegalId, int prepaidlegalPolicy,
			int identitytheftId, int identitytheftPolicy, int collegefundId, int collegefundPolicy, int mutualfundId,
			int mutualfundPolicy, int iraId, int iraPolicy, int rothiraId, int rothiraPolicy, int fouronekId,
			int fouronekPolicy, int fourthreebId, int fourthreebPolicy, int variableannuityId,
			int variableannuityPolicy) {
		
		this.lifeId = lifeId;
		this.lifePolicy = lifePolicy;
		this.homeId = homeId;
		this.homePolicy = homePolicy;
		this.autoId = autoId;
		this.autoPolicy = autoPolicy;
		this.debtId = debtId;
		this.debtPolicy = debtPolicy;
		this.taxId = taxId;
		this.taxPolicy = taxPolicy;
		this.prepaidlegalId = prepaidlegalId;
		this.prepaidlegalPolicy = prepaidlegalPolicy;
		this.identitytheftId = identitytheftId;
		this.identitytheftPolicy = identitytheftPolicy;
		this.collegefundId = collegefundId;
		this.collegefundPolicy = collegefundPolicy;
		this.mutualfundId = mutualfundId;
		this.mutualfundPolicy = mutualfundPolicy;
		this.iraId = iraId;
		this.iraPolicy = iraPolicy;
		this.rothiraId = rothiraId;
		this.rothiraPolicy = rothiraPolicy;
		this.fouronekId = fouronekId;
		this.fouronekPolicy = fouronekPolicy;
		this.fourthreebId = fourthreebId;
		this.fourthreebPolicy = fourthreebPolicy;
		this.variableannuityId = variableannuityId;
		this.variableannuityPolicy = variableannuityPolicy;
	}

	public int getId() {
		return id;
	}

	public int getLifeId() {
		return lifeId;
	}

	public int getLifePolicy() {
		return lifePolicy;
	}

	public int getHomeId() {
		return homeId;
	}

	public int getHomePolicy() {
		return homePolicy;
	}

	public int getAutoId() {
		return autoId;
	}

	public int getAutoPolicy() {
		return autoPolicy;
	}

	public int getDebtId() {
		return debtId;
	}

	public int getDebtPolicy() {
		return debtPolicy;
	}

	public int getTaxId() {
		return taxId;
	}

	public int getTaxPolicy() {
		return taxPolicy;
	}

	public int getPrepaidlegalId() {
		return prepaidlegalId;
	}

	public int getPrepaidlegalPolicy() {
		return prepaidlegalPolicy;
	}

	public int getIdentitytheftId() {
		return identitytheftId;
	}

	public int getIdentitytheftPolicy() {
		return identitytheftPolicy;
	}

	public int getCollegefundId() {
		return collegefundId;
	}

	public int getCollegefundPolicy() {
		return collegefundPolicy;
	}

	public int getMutualfundId() {
		return mutualfundId;
	}

	public int getMutualfundPolicy() {
		return mutualfundPolicy;
	}

	public int getIraId() {
		return iraId;
	}

	public int getIraPolicy() {
		return iraPolicy;
	}

	public int getRothiraId() {
		return rothiraId;
	}

	public int getRothiraPolicy() {
		return rothiraPolicy;
	}

	public int getFouronekId() {
		return fouronekId;
	}

	public int getFouronekPolicy() {
		return fouronekPolicy;
	}

	public int getFourthreebId() {
		return fourthreebId;
	}

	public int getFourthreebPolicy() {
		return fourthreebPolicy;
	}

	public int getVariableannuityId() {
		return variableannuityId;
	}

	public int getVariableannuityPolicy() {
		return variableannuityPolicy;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLifeId(int lifeId) {
		this.lifeId = lifeId;
	}

	public void setLifePolicy(int lifePolicy) {
		this.lifePolicy = lifePolicy;
	}

	public void setHomeId(int homeId) {
		this.homeId = homeId;
	}

	public void setHomePolicy(int homePolicy) {
		this.homePolicy = homePolicy;
	}

	public void setAutoId(int autoId) {
		this.autoId = autoId;
	}

	public void setAutoPolicy(int autoPolicy) {
		this.autoPolicy = autoPolicy;
	}

	public void setDebtId(int debtId) {
		this.debtId = debtId;
	}

	public void setDebtPolicy(int debtPolicy) {
		this.debtPolicy = debtPolicy;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setTaxPolicy(int taxPolicy) {
		this.taxPolicy = taxPolicy;
	}

	public void setPrepaidlegalId(int prepaidlegalId) {
		this.prepaidlegalId = prepaidlegalId;
	}

	public void setPrepaidlegalPolicy(int prepaidlegalPolicy) {
		this.prepaidlegalPolicy = prepaidlegalPolicy;
	}

	public void setIdentitytheftId(int identitytheftId) {
		this.identitytheftId = identitytheftId;
	}

	public void setIdentitytheftPolicy(int identitytheftPolicy) {
		this.identitytheftPolicy = identitytheftPolicy;
	}

	public void setCollegefundId(int collegefundId) {
		this.collegefundId = collegefundId;
	}

	public void setCollegefundPolicy(int collegefundPolicy) {
		this.collegefundPolicy = collegefundPolicy;
	}

	public void setMutualfundId(int mutualfundId) {
		this.mutualfundId = mutualfundId;
	}

	public void setMutualfundPolicy(int mutualfundPolicy) {
		this.mutualfundPolicy = mutualfundPolicy;
	}

	public void setIraId(int iraId) {
		this.iraId = iraId;
	}

	public void setIraPolicy(int iraPolicy) {
		this.iraPolicy = iraPolicy;
	}

	public void setRothiraId(int rothiraId) {
		this.rothiraId = rothiraId;
	}

	public void setRothiraPolicy(int rothiraPolicy) {
		this.rothiraPolicy = rothiraPolicy;
	}

	public void setFouronekId(int fouronekId) {
		this.fouronekId = fouronekId;
	}

	public void setFouronekPolicy(int fouronekPolicy) {
		this.fouronekPolicy = fouronekPolicy;
	}

	public void setFourthreebId(int fourthreebId) {
		this.fourthreebId = fourthreebId;
	}

	public void setFourthreebPolicy(int fourthreebPolicy) {
		this.fourthreebPolicy = fourthreebPolicy;
	}

	public void setVariableannuityId(int variableannuityId) {
		this.variableannuityId = variableannuityId;
	}

	public void setVariableannuityPolicy(int variableannuityPolicy) {
		this.variableannuityPolicy = variableannuityPolicy;
	}

	@Override
	public String toString() {
		return "ClientPolicyDetails [id=" + id + ", lifeId=" + lifeId + ", lifePolicy=" + lifePolicy + ", homeId="
				+ homeId + ", homePolicy=" + homePolicy + ", autoId=" + autoId + ", autoPolicy=" + autoPolicy
				+ ", debtId=" + debtId + ", debtPolicy=" + debtPolicy + ", taxId=" + taxId + ", taxPolicy=" + taxPolicy
				+ ", prepaidlegalId=" + prepaidlegalId + ", prepaidlegalPolicy=" + prepaidlegalPolicy
				+ ", identitytheftId=" + identitytheftId + ", identitytheftPolicy=" + identitytheftPolicy
				+ ", collegefundId=" + collegefundId + ", collegefundPolicy=" + collegefundPolicy + ", mutualfundId="
				+ mutualfundId + ", mutualfundPolicy=" + mutualfundPolicy + ", iraId=" + iraId + ", iraPolicy="
				+ iraPolicy + ", rothiraId=" + rothiraId + ", rothiraPolicy=" + rothiraPolicy + ", fouronekId="
				+ fouronekId + ", fouronekPolicy=" + fouronekPolicy + ", fourthreebId=" + fourthreebId
				+ ", fourthreebPolicy=" + fourthreebPolicy + ", variableannuityId=" + variableannuityId
				+ ", variableannuityPolicy=" + variableannuityPolicy + "]";
	}
	
	
	
	
	
	
	
	
	
}
