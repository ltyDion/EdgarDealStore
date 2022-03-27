package com.example.EdgarDealStore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ABSabsnetPoolPK implements Serializable{
	
	@Column(name="POOL_ID")
	protected BigDecimal POOL_ID;
	@Column(name="APOL_RECORD_DATE")
	protected Timestamp APOL_RECORD_DATE;
	
	public ABSabsnetPoolPK() {}

	public ABSabsnetPoolPK(BigDecimal POOL_ID, Timestamp APOL_RECORD_DATE) {
		super();
		this.POOL_ID = POOL_ID;
		this.APOL_RECORD_DATE = APOL_RECORD_DATE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((APOL_RECORD_DATE == null) ? 0 : APOL_RECORD_DATE.hashCode());
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
		ABSabsnetPoolPK other = (ABSabsnetPoolPK) obj;
		if (APOL_RECORD_DATE == null) {
			if (other.APOL_RECORD_DATE != null)
				return false;
		} else if (!APOL_RECORD_DATE.equals(other.APOL_RECORD_DATE))
			return false;
		if (POOL_ID == null) {
			if (other.POOL_ID != null)
				return false;
		} else if (!POOL_ID.equals(other.POOL_ID))
			return false;
		return true;
	}

	public BigDecimal getPOOL_ID() {
		return POOL_ID;
	}

	public void setPOOL_ID(BigDecimal POOL_ID) {
		this.POOL_ID = POOL_ID;
	}

	public Timestamp getAPOL_RECORD_DATE() {
		return APOL_RECORD_DATE;
	}

	public void setAPOL_RECORD_DATE(Timestamp APOL_RECORD_DATE) {
		this.APOL_RECORD_DATE = APOL_RECORD_DATE;
	}
	
	
}
