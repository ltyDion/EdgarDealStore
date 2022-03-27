package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_TRANCHE")
public class ABSTranche {

	@Id
	@Column(name="TRNC_ID")
	private BigDecimal TRNC_ID;
	
	@Column(name="ALLO_CODE")
	private String ALLO_CODE;
	
	@Column(name="TRNC_CODE")
	private String TRNC_CODE;
	
	@Column(name="ORIG_MRAT_LETTER_GRADE")
	private String ORIG_MRAT_LETTER_GRADE;
	
	@Column(name="CURR_MRAT_LETTER_GRADE")
	private String CURR_MRAT_LETTER_GRADE;
	
	@Column(name="ORIG_SRAT_LETTER_GRADE")
	private String ORIG_SRAT_LETTER_GRADE;
	
	@Column(name="CURR_SRAT_LETTER_GRADE")
	private String CURR_SRAT_LETTER_GRADE;
	
	@Column(name="TRNC_IS_ERISA_ELIGIBLE")
	private String TRNC_IS_ERISA_ELIGIBLE;
	
	@Column(name="DEAL_ID")
	private BigDecimal DEAL_ID;
	
	@Column(name="POOL_ID")
	private BigDecimal POOL_ID;
	
	@Column(name="TRNC_IS_NAS")
	private String TRNC_IS_NAS;
	
	@Column(name="TRNC_NAS_SEQ")
	private BigDecimal TRNC_NAS_SEQ;
	
	@Column(name="TRNC_HAS_IO")
	private String TRNC_HAS_IO;
	
	@Column(name="TRNC_PARI_PAST_DUE_INTEREST")
	private String TRNC_PARI_PAST_DUE_INTEREST;

	public BigDecimal getTRNC_ID() {
		return TRNC_ID;
	}

	public void setTRNC_ID(BigDecimal tRNC_ID) {
		TRNC_ID = tRNC_ID;
	}

	public String getALLO_CODE() {
		return ALLO_CODE;
	}

	public void setALLO_CODE(String aLLO_CODE) {
		ALLO_CODE = aLLO_CODE;
	}

	public String getTRNC_CODE() {
		return TRNC_CODE;
	}

	public void setTRNC_CODE(String tRNC_CODE) {
		TRNC_CODE = tRNC_CODE;
	}

	public String getORIG_MRAT_LETTER_GRADE() {
		return ORIG_MRAT_LETTER_GRADE;
	}

	public void setORIG_MRAT_LETTER_GRADE(String oRIG_MRAT_LETTER_GRADE) {
		ORIG_MRAT_LETTER_GRADE = oRIG_MRAT_LETTER_GRADE;
	}

	public String getCURR_MRAT_LETTER_GRADE() {
		return CURR_MRAT_LETTER_GRADE;
	}

	public void setCURR_MRAT_LETTER_GRADE(String cURR_MRAT_LETTER_GRADE) {
		CURR_MRAT_LETTER_GRADE = cURR_MRAT_LETTER_GRADE;
	}

	public String getORIG_SRAT_LETTER_GRADE() {
		return ORIG_SRAT_LETTER_GRADE;
	}

	public void setORIG_SRAT_LETTER_GRADE(String oRIG_SRAT_LETTER_GRADE) {
		ORIG_SRAT_LETTER_GRADE = oRIG_SRAT_LETTER_GRADE;
	}

	public String getCURR_SRAT_LETTER_GRADE() {
		return CURR_SRAT_LETTER_GRADE;
	}

	public void setCURR_SRAT_LETTER_GRADE(String cURR_SRAT_LETTER_GRADE) {
		CURR_SRAT_LETTER_GRADE = cURR_SRAT_LETTER_GRADE;
	}

	public String getTRNC_IS_ERISA_ELIGIBLE() {
		return TRNC_IS_ERISA_ELIGIBLE;
	}

	public void setTRNC_IS_ERISA_ELIGIBLE(String tRNC_IS_ERISA_ELIGIBLE) {
		TRNC_IS_ERISA_ELIGIBLE = tRNC_IS_ERISA_ELIGIBLE;
	}

	public BigDecimal getDEAL_ID() {
		return DEAL_ID;
	}

	public void setDEAL_ID(BigDecimal dEAL_ID) {
		DEAL_ID = dEAL_ID;
	}

	public BigDecimal getPOOL_ID() {
		return POOL_ID;
	}

	public void setPOOL_ID(BigDecimal pOOL_ID) {
		POOL_ID = pOOL_ID;
	}

	public String getTRNC_IS_NAS() {
		return TRNC_IS_NAS;
	}

	public void setTRNC_IS_NAS(String tRNC_IS_NAS) {
		TRNC_IS_NAS = tRNC_IS_NAS;
	}

	public BigDecimal getTRNC_NAS_SEQ() {
		return TRNC_NAS_SEQ;
	}

	public void setTRNC_NAS_SEQ(BigDecimal tRNC_NAS_SEQ) {
		TRNC_NAS_SEQ = tRNC_NAS_SEQ;
	}

	public String getTRNC_HAS_IO() {
		return TRNC_HAS_IO;
	}

	public void setTRNC_HAS_IO(String tRNC_HAS_IO) {
		TRNC_HAS_IO = tRNC_HAS_IO;
	}

	public String getTRNC_PARI_PAST_DUE_INTEREST() {
		return TRNC_PARI_PAST_DUE_INTEREST;
	}

	public void setTRNC_PARI_PAST_DUE_INTEREST(String tRNC_PARI_PAST_DUE_INTEREST) {
		TRNC_PARI_PAST_DUE_INTEREST = tRNC_PARI_PAST_DUE_INTEREST;
	}

	@Override
	public String toString() {
		return "ABSTranche [TRNC_ID=" + TRNC_ID + ", ALLO_CODE=" + ALLO_CODE + ", TRNC_CODE=" + TRNC_CODE
				+ ", ORIG_MRAT_LETTER_GRADE=" + ORIG_MRAT_LETTER_GRADE + ", CURR_MRAT_LETTER_GRADE="
				+ CURR_MRAT_LETTER_GRADE + ", ORIG_SRAT_LETTER_GRADE=" + ORIG_SRAT_LETTER_GRADE
				+ ", CURR_SRAT_LETTER_GRADE=" + CURR_SRAT_LETTER_GRADE + ", TRNC_IS_ERISA_ELIGIBLE="
				+ TRNC_IS_ERISA_ELIGIBLE + ", DEAL_ID=" + DEAL_ID + ", POOL_ID=" + POOL_ID + ", TRNC_IS_NAS="
				+ TRNC_IS_NAS + ", TRNC_NAS_SEQ=" + TRNC_NAS_SEQ + ", TRNC_HAS_IO=" + TRNC_HAS_IO
				+ ", TRNC_PARI_PAST_DUE_INTEREST=" + TRNC_PARI_PAST_DUE_INTEREST + "]";
	}

	public ABSTranche(BigDecimal tRNC_ID, String aLLO_CODE, String tRNC_CODE, String oRIG_MRAT_LETTER_GRADE,
			String cURR_MRAT_LETTER_GRADE, String oRIG_SRAT_LETTER_GRADE, String cURR_SRAT_LETTER_GRADE,
			String tRNC_IS_ERISA_ELIGIBLE, BigDecimal dEAL_ID, BigDecimal pOOL_ID, String tRNC_IS_NAS,
			BigDecimal tRNC_NAS_SEQ, String tRNC_HAS_IO, String tRNC_PARI_PAST_DUE_INTEREST) {
		super();
		TRNC_ID = tRNC_ID;
		ALLO_CODE = aLLO_CODE;
		TRNC_CODE = tRNC_CODE;
		ORIG_MRAT_LETTER_GRADE = oRIG_MRAT_LETTER_GRADE;
		CURR_MRAT_LETTER_GRADE = cURR_MRAT_LETTER_GRADE;
		ORIG_SRAT_LETTER_GRADE = oRIG_SRAT_LETTER_GRADE;
		CURR_SRAT_LETTER_GRADE = cURR_SRAT_LETTER_GRADE;
		TRNC_IS_ERISA_ELIGIBLE = tRNC_IS_ERISA_ELIGIBLE;
		DEAL_ID = dEAL_ID;
		POOL_ID = pOOL_ID;
		TRNC_IS_NAS = tRNC_IS_NAS;
		TRNC_NAS_SEQ = tRNC_NAS_SEQ;
		TRNC_HAS_IO = tRNC_HAS_IO;
		TRNC_PARI_PAST_DUE_INTEREST = tRNC_PARI_PAST_DUE_INTEREST;
	}

	public ABSTranche() {}
}
