package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.util.Comparator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_SUB_TRANCHE")
public class ABSSubTranche {

	public class ABSSubTrancheSortById implements Comparator<ABSSubTranche> {
		public int compare(ABSSubTranche a, ABSSubTranche b) {
			return a.getSTRN_ID().compareTo(b.getSTRN_ID());
		}
	}
	
	@Id
	@Column
	private BigDecimal STRN_ID;
	
	@Column
	private BigDecimal TRNC_ID;
	
	@Column
	private BigDecimal ITYP_ID;
	
	@Column
	private BigDecimal STRN_SEQ_ID;
	
	@Column
	private String STRN_CUSIP;
	
	@Column
	private BigDecimal STRN_ORIG_BALANCE;
	
	@Column
	private BigDecimal STRN_CURR_BALANCE;
	
	@Column
	private BigDecimal STRN_RATE;
	
	@Column
	private BigDecimal STRN_PAST_DUE_RATE;
	
	@Column
	private BigDecimal STRN_ORIG_AVG_LIFE;
	
	@Column
	private BigDecimal STRN_CURR_AVG_LIFE;
	
	@Column
	private String STRN_IS_SUBJ_STEP_UP;
	
	@Column
	private String STRN_IS_SUBJ_FUND_CAP;
	
	@Column
	private BigDecimal STRN_STEP_UP_RATE;
	
	@Column
	private String ATTR_TIME_STEP;
	
	@Column
	private BigDecimal STRN_LIQUIDITY_SPD;
	
	@Column
	private BigDecimal STRN_POOL_RATIO;
	
	@Column
	private String STRN_IS_SUBJ_CAP_PROV;
	
	@Column
	private String STRN_IS_SUBJ_FLOOR;
	
	@Column
	private BigDecimal STRN_CAP_RATE;
	
	@Column
	private BigDecimal STRN_FLOOR_RATE;
	
	@Column
	private BigDecimal STRN_EXPECTED_INVESTOR_YIELD;
	
	@Column
	private String STRN_SUBCODE;
	
	@Column
	private BigDecimal STRN_ME_NOTCHING;
	
	@Column
	private BigDecimal BOTE_VALUE;
	
	@Column
	private BigDecimal BOTE_ESTIMATED_MKT_PRICE;
	
	@Column
	private BigDecimal RANK;
	
	@Column
	private String RATING_MOODYS;
	
	@Column
	private String RATING_SP;
	
	@Column
	private BigDecimal SKIP_CALIBRATION;
	
	@Column
	private String RATING_INI_MOODYS;
	
	@Column
	private String RATING_INI_SP;
	
	@Column
	private BigDecimal HOLDER_1_BALANCE;
	
	@Column
	private BigDecimal HOLDER_2_BALANCE;
	
	@Column
	private BigDecimal HOLDER_3_BALANCE;
	
	@Column
	private String HOLDER_1;
	
	@Column
	private String HOLDER_2;
	
	@Column
	private String HOLDER_3;

	public BigDecimal getSTRN_ID() {
		return STRN_ID;
	}

	public void setSTRN_ID(BigDecimal sTRN_ID) {
		STRN_ID = sTRN_ID;
	}

	public BigDecimal getTRNC_ID() {
		return TRNC_ID;
	}

	public void setTRNC_ID(BigDecimal tRNC_ID) {
		TRNC_ID = tRNC_ID;
	}

	public BigDecimal getITYP_ID() {
		return ITYP_ID;
	}

	public void setITYP_ID(BigDecimal iTYP_ID) {
		ITYP_ID = iTYP_ID;
	}

	public BigDecimal getSTRN_SEQ_ID() {
		return STRN_SEQ_ID;
	}

	public void setSTRN_SEQ_ID(BigDecimal sTRN_SEQ_ID) {
		STRN_SEQ_ID = sTRN_SEQ_ID;
	}

	public String getSTRN_CUSIP() {
		return STRN_CUSIP;
	}

	public void setSTRN_CUSIP(String sTRN_CUSIP) {
		STRN_CUSIP = sTRN_CUSIP;
	}

	public BigDecimal getSTRN_ORIG_BALANCE() {
		return STRN_ORIG_BALANCE;
	}

	public void setSTRN_ORIG_BALANCE(BigDecimal sTRN_ORIG_BALANCE) {
		STRN_ORIG_BALANCE = sTRN_ORIG_BALANCE;
	}

	public BigDecimal getSTRN_CURR_BALANCE() {
		return STRN_CURR_BALANCE;
	}

	public void setSTRN_CURR_BALANCE(BigDecimal sTRN_CURR_BALANCE) {
		STRN_CURR_BALANCE = sTRN_CURR_BALANCE;
	}

	public BigDecimal getSTRN_RATE() {
		return STRN_RATE;
	}

	public void setSTRN_RATE(BigDecimal sTRN_RATE) {
		STRN_RATE = sTRN_RATE;
	}

	public BigDecimal getSTRN_PAST_DUE_RATE() {
		return STRN_PAST_DUE_RATE;
	}

	public void setSTRN_PAST_DUE_RATE(BigDecimal sTRN_PAST_DUE_RATE) {
		STRN_PAST_DUE_RATE = sTRN_PAST_DUE_RATE;
	}

	public BigDecimal getSTRN_ORIG_AVG_LIFE() {
		return STRN_ORIG_AVG_LIFE;
	}

	public void setSTRN_ORIG_AVG_LIFE(BigDecimal sTRN_ORIG_AVG_LIFE) {
		STRN_ORIG_AVG_LIFE = sTRN_ORIG_AVG_LIFE;
	}

	public BigDecimal getSTRN_CURR_AVG_LIFE() {
		return STRN_CURR_AVG_LIFE;
	}

	public void setSTRN_CURR_AVG_LIFE(BigDecimal sTRN_CURR_AVG_LIFE) {
		STRN_CURR_AVG_LIFE = sTRN_CURR_AVG_LIFE;
	}

	public String getSTRN_IS_SUBJ_STEP_UP() {
		return STRN_IS_SUBJ_STEP_UP;
	}

	public void setSTRN_IS_SUBJ_STEP_UP(String sTRN_IS_SUBJ_STEP_UP) {
		STRN_IS_SUBJ_STEP_UP = sTRN_IS_SUBJ_STEP_UP;
	}

	public String getSTRN_IS_SUBJ_FUND_CAP() {
		return STRN_IS_SUBJ_FUND_CAP;
	}

	public void setSTRN_IS_SUBJ_FUND_CAP(String sTRN_IS_SUBJ_FUND_CAP) {
		STRN_IS_SUBJ_FUND_CAP = sTRN_IS_SUBJ_FUND_CAP;
	}

	public BigDecimal getSTRN_STEP_UP_RATE() {
		return STRN_STEP_UP_RATE;
	}

	public void setSTRN_STEP_UP_RATE(BigDecimal sTRN_STEP_UP_RATE) {
		STRN_STEP_UP_RATE = sTRN_STEP_UP_RATE;
	}

	public String getATTR_TIME_STEP() {
		return ATTR_TIME_STEP;
	}

	public void setATTR_TIME_STEP(String aTTR_TIME_STEP) {
		ATTR_TIME_STEP = aTTR_TIME_STEP;
	}

	public BigDecimal getSTRN_LIQUIDITY_SPD() {
		return STRN_LIQUIDITY_SPD;
	}

	public void setSTRN_LIQUIDITY_SPD(BigDecimal sTRN_LIQUIDITY_SPD) {
		STRN_LIQUIDITY_SPD = sTRN_LIQUIDITY_SPD;
	}

	public BigDecimal getSTRN_POOL_RATIO() {
		return STRN_POOL_RATIO;
	}

	public void setSTRN_POOL_RATIO(BigDecimal sTRN_POOL_RATIO) {
		STRN_POOL_RATIO = sTRN_POOL_RATIO;
	}

	public String getSTRN_IS_SUBJ_CAP_PROV() {
		return STRN_IS_SUBJ_CAP_PROV;
	}

	public void setSTRN_IS_SUBJ_CAP_PROV(String sTRN_IS_SUBJ_CAP_PROV) {
		STRN_IS_SUBJ_CAP_PROV = sTRN_IS_SUBJ_CAP_PROV;
	}

	public String getSTRN_IS_SUBJ_FLOOR() {
		return STRN_IS_SUBJ_FLOOR;
	}

	public void setSTRN_IS_SUBJ_FLOOR(String sTRN_IS_SUBJ_FLOOR) {
		STRN_IS_SUBJ_FLOOR = sTRN_IS_SUBJ_FLOOR;
	}

	public BigDecimal getSTRN_CAP_RATE() {
		return STRN_CAP_RATE;
	}

	public void setSTRN_CAP_RATE(BigDecimal sTRN_CAP_RATE) {
		STRN_CAP_RATE = sTRN_CAP_RATE;
	}

	public BigDecimal getSTRN_FLOOR_RATE() {
		return STRN_FLOOR_RATE;
	}

	public void setSTRN_FLOOR_RATE(BigDecimal sTRN_FLOOR_RATE) {
		STRN_FLOOR_RATE = sTRN_FLOOR_RATE;
	}

	public BigDecimal getSTRN_EXPECTED_INVESTOR_YIELD() {
		return STRN_EXPECTED_INVESTOR_YIELD;
	}

	public void setSTRN_EXPECTED_INVESTOR_YIELD(BigDecimal sTRN_EXPECTED_INVESTOR_YIELD) {
		STRN_EXPECTED_INVESTOR_YIELD = sTRN_EXPECTED_INVESTOR_YIELD;
	}

	public String getSTRN_SUBCODE() {
		return STRN_SUBCODE;
	}

	public void setSTRN_SUBCODE(String sTRN_SUBCODE) {
		STRN_SUBCODE = sTRN_SUBCODE;
	}

	public BigDecimal getSTRN_ME_NOTCHING() {
		return STRN_ME_NOTCHING;
	}

	public void setSTRN_ME_NOTCHING(BigDecimal sTRN_ME_NOTCHING) {
		STRN_ME_NOTCHING = sTRN_ME_NOTCHING;
	}

	public BigDecimal getBOTE_VALUE() {
		return BOTE_VALUE;
	}

	public void setBOTE_VALUE(BigDecimal bOTE_VALUE) {
		BOTE_VALUE = bOTE_VALUE;
	}

	public BigDecimal getBOTE_ESTIMATED_MKT_PRICE() {
		return BOTE_ESTIMATED_MKT_PRICE;
	}

	public void setBOTE_ESTIMATED_MKT_PRICE(BigDecimal bOTE_ESTIMATED_MKT_PRICE) {
		BOTE_ESTIMATED_MKT_PRICE = bOTE_ESTIMATED_MKT_PRICE;
	}

	public BigDecimal getRANK() {
		return RANK;
	}

	public void setRANK(BigDecimal rANK) {
		RANK = rANK;
	}

	public String getRATING_MOODYS() {
		return RATING_MOODYS;
	}

	public void setRATING_MOODYS(String rATING_MOODYS) {
		RATING_MOODYS = rATING_MOODYS;
	}

	public String getRATING_SP() {
		return RATING_SP;
	}

	public void setRATING_SP(String rATING_SP) {
		RATING_SP = rATING_SP;
	}

	public BigDecimal getSKIP_CALIBRATION() {
		return SKIP_CALIBRATION;
	}

	public void setSKIP_CALIBRATION(BigDecimal sKIP_CALIBRATION) {
		SKIP_CALIBRATION = sKIP_CALIBRATION;
	}

	public String getRATING_INI_MOODYS() {
		return RATING_INI_MOODYS;
	}

	public void setRATING_INI_MOODYS(String rATING_INI_MOODYS) {
		RATING_INI_MOODYS = rATING_INI_MOODYS;
	}

	public String getRATING_INI_SP() {
		return RATING_INI_SP;
	}

	public void setRATING_INI_SP(String rATING_INI_SP) {
		RATING_INI_SP = rATING_INI_SP;
	}

	public BigDecimal getHOLDER_1_BALANCE() {
		return HOLDER_1_BALANCE;
	}

	public void setHOLDER_1_BALANCE(BigDecimal hOLDER_1_BALANCE) {
		HOLDER_1_BALANCE = hOLDER_1_BALANCE;
	}

	public BigDecimal getHOLDER_2_BALANCE() {
		return HOLDER_2_BALANCE;
	}

	public void setHOLDER_2_BALANCE(BigDecimal hOLDER_2_BALANCE) {
		HOLDER_2_BALANCE = hOLDER_2_BALANCE;
	}

	public BigDecimal getHOLDER_3_BALANCE() {
		return HOLDER_3_BALANCE;
	}

	public void setHOLDER_3_BALANCE(BigDecimal hOLDER_3_BALANCE) {
		HOLDER_3_BALANCE = hOLDER_3_BALANCE;
	}

	public String getHOLDER_1() {
		return HOLDER_1;
	}

	public void setHOLDER_1(String hOLDER_1) {
		HOLDER_1 = hOLDER_1;
	}

	public String getHOLDER_2() {
		return HOLDER_2;
	}

	public void setHOLDER_2(String hOLDER_2) {
		HOLDER_2 = hOLDER_2;
	}

	public String getHOLDER_3() {
		return HOLDER_3;
	}

	public void setHOLDER_3(String hOLDER_3) {
		HOLDER_3 = hOLDER_3;
	}

	@Override
	public String toString() {
		return "ABSSubTranche [STRN_ID=" + STRN_ID + ", TRNC_ID=" + TRNC_ID + ", ITYP_ID=" + ITYP_ID + ", STRN_SEQ_ID="
				+ STRN_SEQ_ID + ", STRN_CUSIP=" + STRN_CUSIP + ", STRN_ORIG_BALANCE=" + STRN_ORIG_BALANCE
				+ ", STRN_CURR_BALANCE=" + STRN_CURR_BALANCE + ", STRN_RATE=" + STRN_RATE + ", STRN_PAST_DUE_RATE="
				+ STRN_PAST_DUE_RATE + ", STRN_ORIG_AVG_LIFE=" + STRN_ORIG_AVG_LIFE + ", STRN_CURR_AVG_LIFE="
				+ STRN_CURR_AVG_LIFE + ", STRN_IS_SUBJ_STEP_UP=" + STRN_IS_SUBJ_STEP_UP + ", STRN_IS_SUBJ_FUND_CAP="
				+ STRN_IS_SUBJ_FUND_CAP + ", STRN_STEP_UP_RATE=" + STRN_STEP_UP_RATE + ", ATTR_TIME_STEP="
				+ ATTR_TIME_STEP + ", STRN_LIQUIDITY_SPD=" + STRN_LIQUIDITY_SPD + ", STRN_POOL_RATIO=" + STRN_POOL_RATIO
				+ ", STRN_IS_SUBJ_CAP_PROV=" + STRN_IS_SUBJ_CAP_PROV + ", STRN_IS_SUBJ_FLOOR=" + STRN_IS_SUBJ_FLOOR
				+ ", STRN_CAP_RATE=" + STRN_CAP_RATE + ", STRN_FLOOR_RATE=" + STRN_FLOOR_RATE
				+ ", STRN_EXPECTED_INVESTOR_YIELD=" + STRN_EXPECTED_INVESTOR_YIELD + ", STRN_SUBCODE=" + STRN_SUBCODE
				+ ", STRN_ME_NOTCHING=" + STRN_ME_NOTCHING + ", BOTE_VALUE=" + BOTE_VALUE
				+ ", BOTE_ESTIMATED_MKT_PRICE=" + BOTE_ESTIMATED_MKT_PRICE + ", RANK=" + RANK + ", RATING_MOODYS="
				+ RATING_MOODYS + ", RATING_SP=" + RATING_SP + ", SKIP_CALIBRATION=" + SKIP_CALIBRATION
				+ ", RATING_INI_MOODYS=" + RATING_INI_MOODYS + ", RATING_INI_SP=" + RATING_INI_SP
				+ ", HOLDER_1_BALANCE=" + HOLDER_1_BALANCE + ", HOLDER_2_BALANCE=" + HOLDER_2_BALANCE
				+ ", HOLDER_3_BALANCE=" + HOLDER_3_BALANCE + ", HOLDER_1=" + HOLDER_1 + ", HOLDER_2=" + HOLDER_2
				+ ", HOLDER_3=" + HOLDER_3 + "]";
	}

	public ABSSubTranche(BigDecimal sTRN_ID, BigDecimal tRNC_ID, BigDecimal iTYP_ID, BigDecimal sTRN_SEQ_ID,
			String sTRN_CUSIP, BigDecimal sTRN_ORIG_BALANCE, BigDecimal sTRN_CURR_BALANCE, BigDecimal sTRN_RATE,
			BigDecimal sTRN_PAST_DUE_RATE, BigDecimal sTRN_ORIG_AVG_LIFE, BigDecimal sTRN_CURR_AVG_LIFE,
			String sTRN_IS_SUBJ_STEP_UP, String sTRN_IS_SUBJ_FUND_CAP, BigDecimal sTRN_STEP_UP_RATE,
			String aTTR_TIME_STEP, BigDecimal sTRN_LIQUIDITY_SPD, BigDecimal sTRN_POOL_RATIO,
			String sTRN_IS_SUBJ_CAP_PROV, String sTRN_IS_SUBJ_FLOOR, BigDecimal sTRN_CAP_RATE,
			BigDecimal sTRN_FLOOR_RATE, BigDecimal sTRN_EXPECTED_INVESTOR_YIELD, String sTRN_SUBCODE,
			BigDecimal sTRN_ME_NOTCHING, BigDecimal bOTE_VALUE, BigDecimal bOTE_ESTIMATED_MKT_PRICE, BigDecimal rANK,
			String rATING_MOODYS, String rATING_SP, BigDecimal sKIP_CALIBRATION, String rATING_INI_MOODYS,
			String rATING_INI_SP, BigDecimal hOLDER_1_BALANCE, BigDecimal hOLDER_2_BALANCE, BigDecimal hOLDER_3_BALANCE,
			String hOLDER_1, String hOLDER_2, String hOLDER_3) {
		super();
		STRN_ID = sTRN_ID;
		TRNC_ID = tRNC_ID;
		ITYP_ID = iTYP_ID;
		STRN_SEQ_ID = sTRN_SEQ_ID;
		STRN_CUSIP = sTRN_CUSIP;
		STRN_ORIG_BALANCE = sTRN_ORIG_BALANCE;
		STRN_CURR_BALANCE = sTRN_CURR_BALANCE;
		STRN_RATE = sTRN_RATE;
		STRN_PAST_DUE_RATE = sTRN_PAST_DUE_RATE;
		STRN_ORIG_AVG_LIFE = sTRN_ORIG_AVG_LIFE;
		STRN_CURR_AVG_LIFE = sTRN_CURR_AVG_LIFE;
		STRN_IS_SUBJ_STEP_UP = sTRN_IS_SUBJ_STEP_UP;
		STRN_IS_SUBJ_FUND_CAP = sTRN_IS_SUBJ_FUND_CAP;
		STRN_STEP_UP_RATE = sTRN_STEP_UP_RATE;
		ATTR_TIME_STEP = aTTR_TIME_STEP;
		STRN_LIQUIDITY_SPD = sTRN_LIQUIDITY_SPD;
		STRN_POOL_RATIO = sTRN_POOL_RATIO;
		STRN_IS_SUBJ_CAP_PROV = sTRN_IS_SUBJ_CAP_PROV;
		STRN_IS_SUBJ_FLOOR = sTRN_IS_SUBJ_FLOOR;
		STRN_CAP_RATE = sTRN_CAP_RATE;
		STRN_FLOOR_RATE = sTRN_FLOOR_RATE;
		STRN_EXPECTED_INVESTOR_YIELD = sTRN_EXPECTED_INVESTOR_YIELD;
		STRN_SUBCODE = sTRN_SUBCODE;
		STRN_ME_NOTCHING = sTRN_ME_NOTCHING;
		BOTE_VALUE = bOTE_VALUE;
		BOTE_ESTIMATED_MKT_PRICE = bOTE_ESTIMATED_MKT_PRICE;
		RANK = rANK;
		RATING_MOODYS = rATING_MOODYS;
		RATING_SP = rATING_SP;
		SKIP_CALIBRATION = sKIP_CALIBRATION;
		RATING_INI_MOODYS = rATING_INI_MOODYS;
		RATING_INI_SP = rATING_INI_SP;
		HOLDER_1_BALANCE = hOLDER_1_BALANCE;
		HOLDER_2_BALANCE = hOLDER_2_BALANCE;
		HOLDER_3_BALANCE = hOLDER_3_BALANCE;
		HOLDER_1 = hOLDER_1;
		HOLDER_2 = hOLDER_2;
		HOLDER_3 = hOLDER_3;
	}

	public ABSSubTranche( ) {}
}
