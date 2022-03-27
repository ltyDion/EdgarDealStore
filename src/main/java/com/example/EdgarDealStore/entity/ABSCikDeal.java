package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_CIK_DEAL")
public class ABSCikDeal {

	@Id
	@Column
	private BigDecimal DEAL_ID;
	
	@Column
	private String CIK;

	public BigDecimal getDEAL_ID() {
		return DEAL_ID;
	}

	public void setDEAL_ID(BigDecimal dEAL_ID) {
		DEAL_ID = dEAL_ID;
	}

	public String getCIK() {
		return CIK;
	}

	public void setCIK(String cIK) {
		CIK = cIK;
	}

	@Override
	public String toString() {
		return "ABSCikDeal [DEAL_ID=" + DEAL_ID + ", CIK=" + CIK + "]";
	}

	public ABSCikDeal(BigDecimal dEAL_ID, String cIK) {
		super();
		DEAL_ID = dEAL_ID;
		CIK = cIK;
	}

	public ABSCikDeal() {
		// TODO Auto-generated constructor stub
	}
	
	
}
