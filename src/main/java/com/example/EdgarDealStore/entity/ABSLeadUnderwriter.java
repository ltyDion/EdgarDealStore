package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_LEAD_UNDERWRITER")
public class ABSLeadUnderwriter {
	
	@Id
	@Column(name="UNWR_ID")
	private BigDecimal UNWR_ID;
	
	@Column(name="UNWR_DESC")
	private String UNWR_DESC;
	
	@Column(name="RANK")
	private BigDecimal RANK;
	
	public ABSLeadUnderwriter() {}

	public BigDecimal getUNWR_ID() {
		return UNWR_ID;
	}

	public void setUNWR_ID(BigDecimal uNWR_ID) {
		UNWR_ID = uNWR_ID;
	}

	public String getUNWR_DESC() {
		return UNWR_DESC;
	}

	public void setUNWR_DESC(String uNWR_DESC) {
		UNWR_DESC = uNWR_DESC;
	}

	public BigDecimal getRANK() {
		return RANK;
	}

	public void setRANK(BigDecimal rANK) {
		RANK = rANK;
	}

	public ABSLeadUnderwriter(BigDecimal uNWR_ID, String uNWR_DESC, BigDecimal rANK) {
		super();
		UNWR_ID = uNWR_ID;
		UNWR_DESC = uNWR_DESC;
		RANK = rANK;
	}

	@Override
	public String toString() {
		return "ABSLeadUnderwriter [UNWR_ID=" + UNWR_ID + ", UNWR_DESC=" + UNWR_DESC + ", RANK=" + RANK + "]";
	}
	
	
}
