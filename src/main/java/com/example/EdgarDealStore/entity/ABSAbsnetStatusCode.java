package com.example.EdgarDealStore.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_ABSNET_STATUS_CODE")
public class ABSAbsnetStatusCode {

	@Id
	@Column
	private String AASC_CODE;
	
	@Column
	private String AASC_DESCRIPTION;

	public String getAASC_CODE() {
		return AASC_CODE;
	}

	public void setAASC_CODE(String aASC_CODE) {
		AASC_CODE = aASC_CODE;
	}

	public String getAASC_DESCRIPTION() {
		return AASC_DESCRIPTION;
	}

	public void setAASC_DESCRIPTION(String aASC_DESCRIPTION) {
		AASC_DESCRIPTION = aASC_DESCRIPTION;
	}

	public ABSAbsnetStatusCode(String aASC_CODE, String aASC_DESCRIPTION) {
		super();
		AASC_CODE = aASC_CODE;
		AASC_DESCRIPTION = aASC_DESCRIPTION;
	}
	
	public ABSAbsnetStatusCode() {}

	@Override
	public String toString() {
		return "ABSAbsnetStatusCode [AASC_CODE=" + AASC_CODE + ", AASC_DESCRIPTION=" + AASC_DESCRIPTION + "]";
	}
	
	
}
