package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_ISSUING_VEHICLE")
public class ABSIssuingVehicle {
	
	@Id
	@Column(name="ISSV_ID")
	private BigDecimal ISSV_ID;
	
	@Column(name="ISSV_DESC")
	private String ISSV_DESC;

	public BigDecimal getISSV_ID() {
		return ISSV_ID;
	}

	public void setISSV_ID(BigDecimal iSSV_ID) {
		ISSV_ID = iSSV_ID;
	}

	public String getISSV_DESC() {
		return ISSV_DESC;
	}

	public void setISSV_DESC(String iSSV_DESC) {
		ISSV_DESC = iSSV_DESC;
	}

	@Override
	public String toString() {
		return "ABSIssuingVehicle [ISSV_ID=" + ISSV_ID + ", ISSV_DESC=" + ISSV_DESC + "]";
	}

	public ABSIssuingVehicle(BigDecimal iSSV_ID, String iSSV_DESC) {
		super();
		ISSV_ID = iSSV_ID;
		ISSV_DESC = iSSV_DESC;
	}
	
	public ABSIssuingVehicle() {}
}
