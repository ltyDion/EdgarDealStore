package com.example.EdgarDealStore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ABSMarkovMatrixPK implements Serializable {

	@Column(name="POOL_ID")
	protected BigDecimal POOL_ID;
	@Column(name="ROW_INDEX")
	protected String ROW_INDEX;
	@Column(name="COL_INDEX")
	protected String COL_INDEX;
	
	public ABSMarkovMatrixPK(BigDecimal pOOL_ID, String rOW_INDEX, String cOL_INDEX) {
		super();
		POOL_ID = pOOL_ID;
		ROW_INDEX = rOW_INDEX;
		COL_INDEX = cOL_INDEX;
	}
	
	public ABSMarkovMatrixPK() {}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((COL_INDEX == null) ? 0 : COL_INDEX.hashCode());
		result = prime * result + ((POOL_ID == null) ? 0 : POOL_ID.hashCode());
		result = prime * result + ((ROW_INDEX == null) ? 0 : ROW_INDEX.hashCode());
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
		ABSMarkovMatrixPK other = (ABSMarkovMatrixPK) obj;
		if (COL_INDEX == null) {
			if (other.COL_INDEX != null)
				return false;
		} else if (!COL_INDEX.equals(other.COL_INDEX))
			return false;
		if (POOL_ID == null) {
			if (other.POOL_ID != null)
				return false;
		} else if (!POOL_ID.equals(other.POOL_ID))
			return false;
		if (ROW_INDEX == null) {
			if (other.ROW_INDEX != null)
				return false;
		} else if (!ROW_INDEX.equals(other.ROW_INDEX))
			return false;
		return true;
	}

	public BigDecimal getPOOL_ID() {
		return POOL_ID;
	}

	public void setPOOL_ID(BigDecimal pOOL_ID) {
		POOL_ID = pOOL_ID;
	}

	public String getROW_INDEX() {
		return ROW_INDEX;
	}

	public void setROW_INDEX(String rOW_INDEX) {
		ROW_INDEX = rOW_INDEX;
	}

	public String getCOL_INDEX() {
		return COL_INDEX;
	}

	public void setCOL_INDEX(String cOL_INDEX) {
		COL_INDEX = cOL_INDEX;
	}
	
	
}
