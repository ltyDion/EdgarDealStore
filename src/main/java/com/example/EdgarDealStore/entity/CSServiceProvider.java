package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CS_SERVICE_PROVIDER")
public class CSServiceProvider {

	@Id
	@Column(name="SPRO_ID")
	private BigDecimal SPRO_ID;
	
	@Column(name="SPRO_IS_FLAT")
	private String SPRO_IS_FLAT;

	@Column(name="SPRO_NAME")
	private String SPRO_NAME;
	
	@Column(name="SPRO_ANNUAL_RATE_PCT")
	private BigDecimal SPRO_ANNUAL_RATE_PCT;
	
	@Column(name="SPRO_ANNUAL_FEE_AMT")
	private BigDecimal SPRO_ANNUAL_FEE_AMT;
	
	@Column(name="SPRO_RATING")
	private String SPRO_RATING;
	
	@Column(name="SPRN_ID")
	private BigDecimal SPRN_ID;
	
	@Column(name="SPRO_SHORTFALL_RATE")
	private BigDecimal SPRO_SHORTFALL_RATE;

	public BigDecimal getSPRO_ID() {
		return SPRO_ID;
	}

	public void setSPRO_ID(BigDecimal sPRO_ID) {
		SPRO_ID = sPRO_ID;
	}

	public String getSPRO_IS_FLAT() {
		return SPRO_IS_FLAT;
	}

	public void setSPRO_IS_FLAT(String sPRO_IS_FLAT) {
		SPRO_IS_FLAT = sPRO_IS_FLAT;
	}

	public String getSPRO_NAME() {
		return SPRO_NAME;
	}

	public void setSPRO_NAME(String sPRO_NAME) {
		SPRO_NAME = sPRO_NAME;
	}

	public BigDecimal getSPRO_ANNUAL_RATE_PCT() {
		return SPRO_ANNUAL_RATE_PCT;
	}

	public void setSPRO_ANNUAL_RATE_PCT(BigDecimal sPRO_ANNUAL_RATE_PCT) {
		SPRO_ANNUAL_RATE_PCT = sPRO_ANNUAL_RATE_PCT;
	}

	public BigDecimal getSPRO_ANNUAL_FEE_AMT() {
		return SPRO_ANNUAL_FEE_AMT;
	}

	public void setSPRO_ANNUAL_FEE_AMT(BigDecimal sPRO_ANNUAL_FEE_AMT) {
		SPRO_ANNUAL_FEE_AMT = sPRO_ANNUAL_FEE_AMT;
	}

	public String getSPRO_RATING() {
		return SPRO_RATING;
	}

	public void setSPRO_RATING(String sPRO_RATING) {
		SPRO_RATING = sPRO_RATING;
	}

	public BigDecimal getSPRN_ID() {
		return SPRN_ID;
	}

	public void setSPRN_ID(BigDecimal sPRN_ID) {
		SPRN_ID = sPRN_ID;
	}

	public BigDecimal getSPRO_SHORTFALL_RATE() {
		return SPRO_SHORTFALL_RATE;
	}

	public void setSPRO_SHORTFALL_RATE(BigDecimal sPRO_SHORTFALL_RATE) {
		SPRO_SHORTFALL_RATE = sPRO_SHORTFALL_RATE;
	}

	public CSServiceProvider(BigDecimal sPRO_ID, String sPRO_IS_FLAT, String sPRO_NAME, BigDecimal sPRO_ANNUAL_RATE_PCT,
			BigDecimal sPRO_ANNUAL_FEE_AMT, String sPRO_RATING, BigDecimal sPRN_ID, BigDecimal sPRO_SHORTFALL_RATE) {
		super();
		SPRO_ID = sPRO_ID;
		SPRO_IS_FLAT = sPRO_IS_FLAT;
		SPRO_NAME = sPRO_NAME;
		SPRO_ANNUAL_RATE_PCT = sPRO_ANNUAL_RATE_PCT;
		SPRO_ANNUAL_FEE_AMT = sPRO_ANNUAL_FEE_AMT;
		SPRO_RATING = sPRO_RATING;
		SPRN_ID = sPRN_ID;
		SPRO_SHORTFALL_RATE = sPRO_SHORTFALL_RATE;
	}

	public CSServiceProvider() {
		super();
	}

	@Override
	public String toString() {
		return "CSServiceProvider [SPRO_ID=" + SPRO_ID + ", SPRO_IS_FLAT=" + SPRO_IS_FLAT + ", SPRO_NAME=" + SPRO_NAME
				+ ", SPRO_ANNUAL_RATE_PCT=" + SPRO_ANNUAL_RATE_PCT + ", SPRO_ANNUAL_FEE_AMT=" + SPRO_ANNUAL_FEE_AMT
				+ ", SPRO_RATING=" + SPRO_RATING + ", SPRN_ID=" + SPRN_ID + ", SPRO_SHORTFALL_RATE="
				+ SPRO_SHORTFALL_RATE + "]";
	}
	
	
}
