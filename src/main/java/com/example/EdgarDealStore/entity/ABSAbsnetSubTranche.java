package com.example.EdgarDealStore.entity;


import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ABS_ABSNET_SUB_TRANCHE")
public class ABSAbsnetSubTranche {

	@EmbeddedId
	private ABSAbsnetSubTranchePK absAbsnetSubTranchePK;
	
	@Column
	private BigDecimal ASTR_CURR_BALANCE;
	
	@Column
	private BigDecimal ASTR_INTEREST_SHORTFALL;
	
	@Column
	private BigDecimal ASTR_PRINCIPAL_SHORTFALL;
	
	@Column
	private BigDecimal ASTR_DEFFERRED_INTEREST;
	
	@Column
	private BigDecimal ASTR_DEFFERRED_INTEREST_PAID;
	
	@Column
	private BigDecimal ASTR_CUM_REALIZED_LOSSES;
	
	@Column
	private String ASTR_CURR_MRAT_LETTER_GRADE;
	
	@Column
	private String ASTR_CURR_SRAT_LETTER_GRADE;
	
	@Column
	private BigDecimal ASTR_PERIOD;
	
	@Column
	private String ASTR_IS_PAID_OFF;
	
	@Column
	private BigDecimal SUB_BELOW_TARGET;
	
	@Column
	private BigDecimal EXP_IMP_TIME;
	
	@Column
	private BigDecimal EXP_LIQ_EVENT;
	
	@Column
	private BigDecimal ASTR_PRINCIPAL_PAID;
	
	@Column
	private BigDecimal ASTR_COUPON_RATE;
	
	@Column
	private BigDecimal ASTR_SUBORD_CS_AMT;
	
	@Column
	private BigDecimal ASTR_SUBORD_CS_PCT;
	
	@Column
	private BigDecimal ASTR_TOTAL_CS_AMT;
	
	@Column
	private BigDecimal ASTR_TOTAL_CS_PCT;
	
	@Column
	private BigDecimal ASTR_TOTAL_DISTRIBUTION;
	
	@Column
	private BigDecimal ASTR_MKT_PRICE;
	

	public ABSAbsnetSubTranche(ABSAbsnetSubTranchePK absAbsnetSubTranchePK, BigDecimal aSTR_CURR_BALANCE,
			BigDecimal aSTR_INTEREST_SHORTFALL, BigDecimal aSTR_PRINCIPAL_SHORTFALL, BigDecimal aSTR_DEFFERRED_INTEREST,
			BigDecimal aSTR_DEFFERRED_INTEREST_PAID, BigDecimal aSTR_CUM_REALIZED_LOSSES,
			String aSTR_CURR_MRAT_LETTER_GRADE, String aSTR_CURR_SRAT_LETTER_GRADE, BigDecimal aSTR_PERIOD,
			String aSTR_IS_PAID_OFF, BigDecimal sUB_BELOW_TARGET, BigDecimal eXP_IMP_TIME, BigDecimal eXP_LIQ_EVENT,
			BigDecimal aSTR_PRINCIPAL_PAID, BigDecimal aSTR_COUPON_RATE, BigDecimal aSTR_SUBORD_CS_AMT,
			BigDecimal aSTR_SUBORD_CS_PCT, BigDecimal aSTR_TOTAL_CS_AMT, BigDecimal aSTR_TOTAL_CS_PCT,
			BigDecimal aSTR_TOTAL_DISTRIBUTION, BigDecimal aSTR_MKT_PRICE) {
		super();
		this.absAbsnetSubTranchePK = absAbsnetSubTranchePK;
		ASTR_CURR_BALANCE = aSTR_CURR_BALANCE;
		ASTR_INTEREST_SHORTFALL = aSTR_INTEREST_SHORTFALL;
		ASTR_PRINCIPAL_SHORTFALL = aSTR_PRINCIPAL_SHORTFALL;
		ASTR_DEFFERRED_INTEREST = aSTR_DEFFERRED_INTEREST;
		ASTR_DEFFERRED_INTEREST_PAID = aSTR_DEFFERRED_INTEREST_PAID;
		ASTR_CUM_REALIZED_LOSSES = aSTR_CUM_REALIZED_LOSSES;
		ASTR_CURR_MRAT_LETTER_GRADE = aSTR_CURR_MRAT_LETTER_GRADE;
		ASTR_CURR_SRAT_LETTER_GRADE = aSTR_CURR_SRAT_LETTER_GRADE;
		ASTR_PERIOD = aSTR_PERIOD;
		ASTR_IS_PAID_OFF = aSTR_IS_PAID_OFF;
		SUB_BELOW_TARGET = sUB_BELOW_TARGET;
		EXP_IMP_TIME = eXP_IMP_TIME;
		EXP_LIQ_EVENT = eXP_LIQ_EVENT;
		ASTR_PRINCIPAL_PAID = aSTR_PRINCIPAL_PAID;
		ASTR_COUPON_RATE = aSTR_COUPON_RATE;
		ASTR_SUBORD_CS_AMT = aSTR_SUBORD_CS_AMT;
		ASTR_SUBORD_CS_PCT = aSTR_SUBORD_CS_PCT;
		ASTR_TOTAL_CS_AMT = aSTR_TOTAL_CS_AMT;
		ASTR_TOTAL_CS_PCT = aSTR_TOTAL_CS_PCT;
		ASTR_TOTAL_DISTRIBUTION = aSTR_TOTAL_DISTRIBUTION;
		ASTR_MKT_PRICE = aSTR_MKT_PRICE;
	}





	@Override
	public String toString() {
		return "ABSAbsnetSubTranche [absAbsnetSubTranchePK=" + absAbsnetSubTranchePK.getSTRN_ID() + " " 
	            + absAbsnetSubTranchePK.getASTR_RECORD_DATE() + ", ASTR_CURR_BALANCE="
				+ ASTR_CURR_BALANCE + ", ASTR_INTEREST_SHORTFALL=" + ASTR_INTEREST_SHORTFALL
				+ ", ASTR_PRINCIPAL_SHORTFALL=" + ASTR_PRINCIPAL_SHORTFALL + ", ASTR_DEFFERRED_INTEREST="
				+ ASTR_DEFFERRED_INTEREST + ", ASTR_DEFFERRED_INTEREST_PAID=" + ASTR_DEFFERRED_INTEREST_PAID
				+ ", ASTR_CUM_REALIZED_LOSSES=" + ASTR_CUM_REALIZED_LOSSES + ", ASTR_CURR_MRAT_LETTER_GRADE="
				+ ASTR_CURR_MRAT_LETTER_GRADE + ", ASTR_CURR_SRAT_LETTER_GRADE=" + ASTR_CURR_SRAT_LETTER_GRADE
				+ ", ASTR_PERIOD=" + ASTR_PERIOD + ", ASTR_IS_PAID_OFF=" + ASTR_IS_PAID_OFF + ", SUB_BELOW_TARGET="
				+ SUB_BELOW_TARGET + ", EXP_IMP_TIME=" + EXP_IMP_TIME + ", EXP_LIQ_EVENT=" + EXP_LIQ_EVENT
				+ ", ASTR_PRINCIPAL_PAID=" + ASTR_PRINCIPAL_PAID + ", ASTR_COUPON_RATE=" + ASTR_COUPON_RATE
				+ ", ASTR_SUBORD_CS_AMT=" + ASTR_SUBORD_CS_AMT + ", ASTR_SUBORD_CS_PCT=" + ASTR_SUBORD_CS_PCT
				+ ", ASTR_TOTAL_CS_AMT=" + ASTR_TOTAL_CS_AMT + ", ASTR_TOTAL_CS_PCT=" + ASTR_TOTAL_CS_PCT
				+ ", ASTR_TOTAL_DISTRIBUTION=" + ASTR_TOTAL_DISTRIBUTION + ", ASTR_MKT_PRICE=" + ASTR_MKT_PRICE + "]";
	}



	public ABSAbsnetSubTranchePK getAbsAbsnetSubTranchePK() {
		return absAbsnetSubTranchePK;
	}

	public void setAbsAbsnetSubTranchePK(ABSAbsnetSubTranchePK absAbsnetSubTranchePK) {
		this.absAbsnetSubTranchePK = absAbsnetSubTranchePK;
	}

	public BigDecimal getASTR_CURR_BALANCE() {
		return ASTR_CURR_BALANCE;
	}


	public void setASTR_CURR_BALANCE(BigDecimal aSTR_CURR_BALANCE) {
		ASTR_CURR_BALANCE = aSTR_CURR_BALANCE;
	}


	public BigDecimal getASTR_INTEREST_SHORTFALL() {
		return ASTR_INTEREST_SHORTFALL;
	}


	public void setASTR_INTEREST_SHORTFALL(BigDecimal aSTR_INTEREST_SHORTFALL) {
		ASTR_INTEREST_SHORTFALL = aSTR_INTEREST_SHORTFALL;
	}


	public BigDecimal getASTR_PRINCIPAL_SHORTFALL() {
		return ASTR_PRINCIPAL_SHORTFALL;
	}


	public void setASTR_PRINCIPAL_SHORTFALL(BigDecimal aSTR_PRINCIPAL_SHORTFALL) {
		ASTR_PRINCIPAL_SHORTFALL = aSTR_PRINCIPAL_SHORTFALL;
	}


	public BigDecimal getASTR_DEFFERRED_INTEREST() {
		return ASTR_DEFFERRED_INTEREST;
	}


	public void setASTR_DEFFERRED_INTEREST(BigDecimal aSTR_DEFFERRED_INTEREST) {
		ASTR_DEFFERRED_INTEREST = aSTR_DEFFERRED_INTEREST;
	}


	public BigDecimal getASTR_DEFFERRED_INTEREST_PAID() {
		return ASTR_DEFFERRED_INTEREST_PAID;
	}


	public void setASTR_DEFFERRED_INTEREST_PAID(BigDecimal aSTR_DEFFERRED_INTEREST_PAID) {
		ASTR_DEFFERRED_INTEREST_PAID = aSTR_DEFFERRED_INTEREST_PAID;
	}


	public BigDecimal getASTR_CUM_REALIZED_LOSSES() {
		return ASTR_CUM_REALIZED_LOSSES;
	}


	public void setASTR_CUM_REALIZED_LOSSES(BigDecimal aSTR_CUM_REALIZED_LOSSES) {
		ASTR_CUM_REALIZED_LOSSES = aSTR_CUM_REALIZED_LOSSES;
	}


	public String getASTR_CURR_MRAT_LETTER_GRADE() {
		return ASTR_CURR_MRAT_LETTER_GRADE;
	}


	public void setASTR_CURR_MRAT_LETTER_GRADE(String aSTR_CURR_MRAT_LETTER_GRADE) {
		ASTR_CURR_MRAT_LETTER_GRADE = aSTR_CURR_MRAT_LETTER_GRADE;
	}


	public String getASTR_CURR_SRAT_LETTER_GRADE() {
		return ASTR_CURR_SRAT_LETTER_GRADE;
	}


	public void setASTR_CURR_SRAT_LETTER_GRADE(String aSTR_CURR_SRAT_LETTER_GRADE) {
		ASTR_CURR_SRAT_LETTER_GRADE = aSTR_CURR_SRAT_LETTER_GRADE;
	}


	public BigDecimal getASTR_PERIOD() {
		return ASTR_PERIOD;
	}


	public void setASTR_PERIOD(BigDecimal aSTR_PERIOD) {
		ASTR_PERIOD = aSTR_PERIOD;
	}


	public String getASTR_IS_PAID_OFF() {
		return ASTR_IS_PAID_OFF;
	}


	public void setASTR_IS_PAID_OFF(String aSTR_IS_PAID_OFF) {
		ASTR_IS_PAID_OFF = aSTR_IS_PAID_OFF;
	}


	public BigDecimal getSUB_BELOW_TARGET() {
		return SUB_BELOW_TARGET;
	}


	public void setSUB_BELOW_TARGET(BigDecimal sUB_BELOW_TARGET) {
		SUB_BELOW_TARGET = sUB_BELOW_TARGET;
	}


	public BigDecimal getEXP_IMP_TIME() {
		return EXP_IMP_TIME;
	}


	public void setEXP_IMP_TIME(BigDecimal eXP_IMP_TIME) {
		EXP_IMP_TIME = eXP_IMP_TIME;
	}


	public BigDecimal getEXP_LIQ_EVENT() {
		return EXP_LIQ_EVENT;
	}


	public void setEXP_LIQ_EVENT(BigDecimal eXP_LIQ_EVENT) {
		EXP_LIQ_EVENT = eXP_LIQ_EVENT;
	}


	public BigDecimal getASTR_PRINCIPAL_PAID() {
		return ASTR_PRINCIPAL_PAID;
	}


	public void setASTR_PRINCIPAL_PAID(BigDecimal aSTR_PRINCIPAL_PAID) {
		ASTR_PRINCIPAL_PAID = aSTR_PRINCIPAL_PAID;
	}


	public BigDecimal getASTR_COUPON_RATE() {
		return ASTR_COUPON_RATE;
	}


	public void setASTR_COUPON_RATE(BigDecimal aSTR_COUPON_RATE) {
		ASTR_COUPON_RATE = aSTR_COUPON_RATE;
	}


	public BigDecimal getASTR_SUBORD_CS_AMT() {
		return ASTR_SUBORD_CS_AMT;
	}


	public void setASTR_SUBORD_CS_AMT(BigDecimal aSTR_SUBORD_CS_AMT) {
		ASTR_SUBORD_CS_AMT = aSTR_SUBORD_CS_AMT;
	}


	public BigDecimal getASTR_SUBORD_CS_PCT() {
		return ASTR_SUBORD_CS_PCT;
	}


	public void setASTR_SUBORD_CS_PCT(BigDecimal aSTR_SUBORD_CS_PCT) {
		ASTR_SUBORD_CS_PCT = aSTR_SUBORD_CS_PCT;
	}


	public BigDecimal getASTR_TOTAL_CS_AMT() {
		return ASTR_TOTAL_CS_AMT;
	}


	public void setASTR_TOTAL_CS_AMT(BigDecimal aSTR_TOTAL_CS_AMT) {
		ASTR_TOTAL_CS_AMT = aSTR_TOTAL_CS_AMT;
	}


	public BigDecimal getASTR_TOTAL_CS_PCT() {
		return ASTR_TOTAL_CS_PCT;
	}


	public void setASTR_TOTAL_CS_PCT(BigDecimal aSTR_TOTAL_CS_PCT) {
		ASTR_TOTAL_CS_PCT = aSTR_TOTAL_CS_PCT;
	}


	public BigDecimal getASTR_TOTAL_DISTRIBUTION() {
		return ASTR_TOTAL_DISTRIBUTION;
	}


	public void setASTR_TOTAL_DISTRIBUTION(BigDecimal aSTR_TOTAL_DISTRIBUTION) {
		ASTR_TOTAL_DISTRIBUTION = aSTR_TOTAL_DISTRIBUTION;
	}


	public BigDecimal getASTR_MKT_PRICE() {
		return ASTR_MKT_PRICE;
	}


	public void setASTR_MKT_PRICE(BigDecimal aSTR_MKT_PRICE) {
		ASTR_MKT_PRICE = aSTR_MKT_PRICE;
	}


	public ABSAbsnetSubTranche() {}
	
}
