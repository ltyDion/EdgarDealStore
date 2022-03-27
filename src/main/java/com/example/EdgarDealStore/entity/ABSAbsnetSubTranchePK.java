package com.example.EdgarDealStore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class ABSAbsnetSubTranchePK implements Serializable {

	@Column(name="STRN_ID")
	protected BigDecimal STRN_ID;
	@Column(name="ASTR_RECORD_DATE")
	protected Timestamp ASTR_RECORD_DATE;
	
	public ABSAbsnetSubTranchePK() {}

	public ABSAbsnetSubTranchePK(BigDecimal sTRN_ID, Timestamp aSTR_RECORD_DATE) {
		super();
		STRN_ID = sTRN_ID;
		ASTR_RECORD_DATE = aSTR_RECORD_DATE;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ASTR_RECORD_DATE == null) ? 0 : ASTR_RECORD_DATE.hashCode());
		result = prime * result + ((STRN_ID == null) ? 0 : STRN_ID.hashCode());
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
		ABSAbsnetSubTranchePK other = (ABSAbsnetSubTranchePK) obj;
		if (ASTR_RECORD_DATE == null) {
			if (other.ASTR_RECORD_DATE != null)
				return false;
		} else if (!ASTR_RECORD_DATE.equals(other.ASTR_RECORD_DATE))
			return false;
		if (STRN_ID == null) {
			if (other.STRN_ID != null)
				return false;
		} else if (!STRN_ID.equals(other.STRN_ID))
			return false;
		return true;
	}

	public BigDecimal getSTRN_ID() {
		return STRN_ID;
	}

	public void setSTRN_ID(BigDecimal sTRN_ID) {
		STRN_ID = sTRN_ID;
	}

	public Timestamp getASTR_RECORD_DATE() {
		return ASTR_RECORD_DATE;
	}

	public void setASTR_RECORD_DATE(Timestamp aSTR_RECORD_DATE) {
		ASTR_RECORD_DATE = aSTR_RECORD_DATE;
	}
	
	
}
