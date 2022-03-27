package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CS_SERVICE_PROVIDER_NAMES")
public class CSServiceProviderNames {

	@Id
	@Column(name="SPRN_ID")
	private BigDecimal SPRN_ID;
	
	@Column(name="SPRN_NAME")
	private String SPRN_NAME;
	
	@Column(name="SPRT_CODE")
	private String SPRT_CODE;
	
	@Column(name="RANK")
	private BigDecimal RANK;

	public BigDecimal getSPRN_ID() {
		return SPRN_ID;
	}

	public void setSPRN_ID(BigDecimal sPRN_ID) {
		SPRN_ID = sPRN_ID;
	}

	public String getSPRN_NAME() {
		return SPRN_NAME;
	}

	public void setSPRN_NAME(String sPRN_NAME) {
		SPRN_NAME = sPRN_NAME;
	}

	public String getSPRT_CODE() {
		return SPRT_CODE;
	}

	public void setSPRT_CODE(String sPRT_CODE) {
		SPRT_CODE = sPRT_CODE;
	}

	public BigDecimal getRANK() {
		return RANK;
	}

	public void setRANK(BigDecimal rANK) {
		RANK = rANK;
	}

	public CSServiceProviderNames(BigDecimal sPRN_ID, String sPRN_NAME, String sPRT_CODE, BigDecimal rANK) {
		super();
		SPRN_ID = sPRN_ID;
		SPRN_NAME = sPRN_NAME;
		SPRT_CODE = sPRT_CODE;
		RANK = rANK;
	}

	public CSServiceProviderNames() {
		super();
	}

	@Override
	public String toString() {
		return "CSServiceProviderNames [SPRN_ID=" + SPRN_ID + ", SPRN_NAME=" + SPRN_NAME + ", SPRT_CODE=" + SPRT_CODE
				+ ", RANK=" + RANK + "]";
	}
	
	
}
