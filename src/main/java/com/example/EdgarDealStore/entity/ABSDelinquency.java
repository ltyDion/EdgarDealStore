package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ABS_DELINQUENCY")
public class ABSDelinquency {

	@EmbeddedId
	private ABSDelinquencyPK absDelinquencyPK;
	
	@Column
	private BigDecimal DELI_AMT;

	public ABSDelinquencyPK getAbsDelinquencyPK() {
		return absDelinquencyPK;
	}

	public void setAbsDelinquencyPK(ABSDelinquencyPK absDelinquencyPK) {
		this.absDelinquencyPK = absDelinquencyPK;
	}

	public BigDecimal getDELI_AMT() {
		return DELI_AMT;
	}

	public void setDELI_AMT(BigDecimal dELI_AMT) {
		DELI_AMT = dELI_AMT;
	}

	public ABSDelinquency(ABSDelinquencyPK absDelinquencyPK, BigDecimal dELI_AMT) {
		super();
		this.absDelinquencyPK = absDelinquencyPK;
		DELI_AMT = dELI_AMT;
	}
	
	public ABSDelinquency() {}
}
