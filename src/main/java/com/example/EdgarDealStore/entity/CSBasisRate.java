package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CS_BASIS_RATE")
public class CSBasisRate {
	@Id
	@Column(name="BASI_CODE")
	private String BASI_CODE;
	
	@Column(name="BASR_DATE")
	private Timestamp BASR_DATE;
	
	@Column(name="BASR_RATE")
	private BigDecimal BASR_RATE;
	
	public CSBasisRate() {}

	public String getBASI_CODE() {
		return BASI_CODE;
	}

	public void setBASI_CODE(String bASI_CODE) {
		BASI_CODE = bASI_CODE;
	}

	public Timestamp getBASR_DATE() {
		return BASR_DATE;
	}

	public void setBASR_DATE(Timestamp bASR_DATE) {
		BASR_DATE = bASR_DATE;
	}

	public BigDecimal getBASR_RATE() {
		return BASR_RATE;
	}

	public void setBASR_RATE(BigDecimal bASR_RATE) {
		BASR_RATE = bASR_RATE;
	}

	public CSBasisRate(String bASI_CODE, Timestamp bASR_DATE, BigDecimal bASR_RATE) {
		super();
		BASI_CODE = bASI_CODE;
		BASR_DATE = bASR_DATE;
		BASR_RATE = bASR_RATE;
	}
	
	
}
