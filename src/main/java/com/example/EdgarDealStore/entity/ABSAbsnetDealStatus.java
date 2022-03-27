package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_ABSNET_DEAL_STATUS")
public class ABSAbsnetDealStatus {

	@Id
	@Column
	private BigDecimal DEAL_ID;
	
	@Column
	private Timestamp AADS_LAST_RECORD_DATE;
	
	@Column
	private BigDecimal AADS_LAST_POOL_PERIOD;
	
	@Column
	private Timestamp AADS_LAST_RUN_DATE;
	
	@Column
	private String AASC_CODE;
	
	@Column
	private String AADS_NOTES;
	
	@Column
	private String AADS_SERVER_NAME;

	public BigDecimal getDEAL_ID() {
		return DEAL_ID;
	}

	public void setDEAL_ID(BigDecimal dEAL_ID) {
		DEAL_ID = dEAL_ID;
	}

	public Timestamp getAADS_LAST_RECORD_DATE() {
		return AADS_LAST_RECORD_DATE;
	}

	public void setAADS_LAST_RECORD_DATE(Timestamp aADS_LAST_RECORD_DATE) {
		AADS_LAST_RECORD_DATE = aADS_LAST_RECORD_DATE;
	}

	public BigDecimal getAADS_LAST_POOL_PERIOD() {
		return AADS_LAST_POOL_PERIOD;
	}

	public void setAADS_LAST_POOL_PERIOD(BigDecimal aADS_LAST_POOL_PERIOD) {
		AADS_LAST_POOL_PERIOD = aADS_LAST_POOL_PERIOD;
	}

	public Timestamp getAADS_LAST_RUN_DATE() {
		return AADS_LAST_RUN_DATE;
	}

	public void setAADS_LAST_RUN_DATE(Timestamp aADS_LAST_RUN_DATE) {
		AADS_LAST_RUN_DATE = aADS_LAST_RUN_DATE;
	}

	public String getAASC_CODE() {
		return AASC_CODE;
	}

	public void setAASC_CODE(String aASC_CODE) {
		AASC_CODE = aASC_CODE;
	}

	public String getAADS_NOTES() {
		return AADS_NOTES;
	}

	public void setAADS_NOTES(String aADS_NOTES) {
		AADS_NOTES = aADS_NOTES;
	}

	public String getAADS_SERVER_NAME() {
		return AADS_SERVER_NAME;
	}

	public void setAADS_SERVER_NAME(String aADS_SERVER_NAME) {
		AADS_SERVER_NAME = aADS_SERVER_NAME;
	}

	@Override
	public String toString() {
		return "ABSAbsnetDealStatus [DEAL_ID=" + DEAL_ID + ", AADS_LAST_RECORD_DATE=" + AADS_LAST_RECORD_DATE
				+ ", AADS_LAST_POOL_PERIOD=" + AADS_LAST_POOL_PERIOD + ", AADS_LAST_RUN_DATE=" + AADS_LAST_RUN_DATE
				+ ", AASC_CODE=" + AASC_CODE + ", AADS_NOTES=" + AADS_NOTES + ", AADS_SERVER_NAME=" + AADS_SERVER_NAME
				+ "]";
	}

	public ABSAbsnetDealStatus(BigDecimal dEAL_ID, Timestamp aADS_LAST_RECORD_DATE, BigDecimal aADS_LAST_POOL_PERIOD,
			Timestamp aADS_LAST_RUN_DATE, String aASC_CODE, String aADS_NOTES, String aADS_SERVER_NAME) {
		super();
		DEAL_ID = dEAL_ID;
		AADS_LAST_RECORD_DATE = aADS_LAST_RECORD_DATE;
		AADS_LAST_POOL_PERIOD = aADS_LAST_POOL_PERIOD;
		AADS_LAST_RUN_DATE = aADS_LAST_RUN_DATE;
		AASC_CODE = aASC_CODE;
		AADS_NOTES = aADS_NOTES;
		AADS_SERVER_NAME = aADS_SERVER_NAME;
	}
	
	public ABSAbsnetDealStatus() {}
}
