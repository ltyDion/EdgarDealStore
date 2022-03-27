package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CS_INTEREST_TYPE")
public class CSInterestType {
	
	@Id
	@Column(name="ITYP_ID")
	private BigDecimal ITYP_ID;
	
	@Column(name="ITYP_DESC")
	private String ITYP_DESC;
	
	public CSInterestType() {}
	
	public CSInterestType(BigDecimal iTyp_Id, String iTyp_Desc) {
		this.ITYP_DESC = iTyp_Desc;
		this.ITYP_ID = iTyp_Id;
	}
	
	public BigDecimal getITYP_ID() {
		return ITYP_ID;
	}

	public void setITYP_ID(BigDecimal iTYP_ID) {
		ITYP_ID = iTYP_ID;
	}


	public String getITYP_DESC() {
		return ITYP_DESC;
	}


	public void setITYP_DESC(String iTYP_DESC) {
		ITYP_DESC = iTYP_DESC;
	}

	@Override
	public String toString() {
		return "CSInterestType [ITypeId=" + this.ITYP_ID + ", ITypeDesc=" + this.ITYP_DESC + "]";
	}
}
