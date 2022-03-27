package com.example.EdgarDealStore.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ABSDealCsServiceProviderPK implements Serializable {

	@Column(name="SPRO_ID")
	protected BigDecimal SPRO_ID;
	
	@Column(name="DEAL_ID")
	protected BigDecimal DEAL_ID;

	public ABSDealCsServiceProviderPK(BigDecimal sPRO_ID, BigDecimal dEAL_ID) {
		super();
		SPRO_ID = sPRO_ID;
		DEAL_ID = dEAL_ID;
	}

	public ABSDealCsServiceProviderPK() {
		super();
	}

	public BigDecimal getSPRO_ID() {
		return SPRO_ID;
	}

	public void setSPRO_ID(BigDecimal sPRO_ID) {
		SPRO_ID = sPRO_ID;
	}

	public BigDecimal getDEAL_ID() {
		return DEAL_ID;
	}

	public void setDEAL_ID(BigDecimal dEAL_ID) {
		DEAL_ID = dEAL_ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DEAL_ID == null) ? 0 : DEAL_ID.hashCode());
		result = prime * result + ((SPRO_ID == null) ? 0 : SPRO_ID.hashCode());
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
		ABSDealCsServiceProviderPK other = (ABSDealCsServiceProviderPK) obj;
		if (DEAL_ID == null) {
			if (other.DEAL_ID != null)
				return false;
		} else if (!DEAL_ID.equals(other.DEAL_ID))
			return false;
		if (SPRO_ID == null) {
			if (other.SPRO_ID != null)
				return false;
		} else if (!SPRO_ID.equals(other.SPRO_ID))
			return false;
		return true;
	}
	
	
}
