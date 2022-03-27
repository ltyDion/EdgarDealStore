package com.example.EdgarDealStore.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ABSDelinquencyPK implements Serializable{
	
	@Column(name="POOL_ID")
	protected BigDecimal POOL_ID;
	@Column(name="DELT_CODE")
	protected String DELT_CODE;
	
	public ABSDelinquencyPK(BigDecimal pOOL_ID, String dELT_CODE) {
		super();
		POOL_ID = pOOL_ID;
		DELT_CODE = dELT_CODE;
	}
	
	public ABSDelinquencyPK() {}

	public BigDecimal getPOOL_ID() {
		return POOL_ID;
	}

	public void setPOOL_ID(BigDecimal pOOL_ID) {
		POOL_ID = pOOL_ID;
	}

	public String getDELT_CODE() {
		return DELT_CODE;
	}

	public void setDELT_CODE(String dELT_CODE) {
		DELT_CODE = dELT_CODE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DELT_CODE == null) ? 0 : DELT_CODE.hashCode());
		result = prime * result + ((POOL_ID == null) ? 0 : POOL_ID.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ABSDelinquencyPK other = (ABSDelinquencyPK) obj;
		if (DELT_CODE == null) {
			if (other.DELT_CODE != null)
				return false;
		} else if (!DELT_CODE.equals(other.DELT_CODE))
			return false;
		if (POOL_ID == null) {
			if (other.POOL_ID != null)
				return false;
		} else if (!POOL_ID.equals(other.POOL_ID))
			return false;
		return true;
	}
	
	
}
