package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_Trustees")
public class ABSTrustee {

	@Id
	@Column(name="TRST_ID")
	private BigDecimal TRST_ID;
	
	@Column(name="TRST_DESC")
	private String TRST_DESC;

	public BigDecimal getTRST_ID() {
		return TRST_ID;
	}

	public void setTRST_ID(BigDecimal tRST_ID) {
		TRST_ID = tRST_ID;
	}

	public String getTRST_DESC() {
		return TRST_DESC;
	}

	public void setTRST_DESC(String tRST_DESC) {
		TRST_DESC = tRST_DESC;
	}

	@Override
	public String toString() {
		return "ABSTrustee [TRST_ID=" + TRST_ID + ", TRST_DESC=" + TRST_DESC + "]";
	}

	public ABSTrustee(BigDecimal tRST_ID, String tRST_DESC) {
		super();
		TRST_ID = tRST_ID;
		TRST_DESC = tRST_DESC;
	}
	
	public ABSTrustee() {}
}
