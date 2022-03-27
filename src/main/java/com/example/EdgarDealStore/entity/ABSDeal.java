package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ABS_DEAL")
public class ABSDeal {
	
	@Id
	@Column(name="DEAL_ID")
	private BigDecimal DEAL_ID;
	
	@Column(name="ACLS_CODE")
	private String ACLS_CODE;
	
	@Column(name="REVIEW_PRSN_ID_USER")
	private BigDecimal REVIEW_PRSN_ID_USER;

	@Column(name="BASI_CODE")
	private String BASI_CODE;
	
	@Column(name="EXCH_CODE")
	private String EXCH_CODE;
	
	@Column(name="MRKT_CODE")
	private String MRKT_CODE;
	
	@Column(name="TARGET_MRAT_LETTER_GRADE")
	private String TARGET_MRAT_LETTER_GRADE;
	
	@Column(name="DEAL_SHORTNAME")
	private String DEAL_SHORTNAME;
	
	@Column(name="DEAL_NAME")
	private String DEAL_NAME;
	
	@Column(name="DEAL_ABSNET_DEAL_ID")
	private BigDecimal DEAL_ABSNET_DEAL_ID;
	
	@Column(name="DEAL_CLOSING_DATE")
	private Timestamp DEAL_CLOSING_DATE;
	
	@Column(name="DEAL_MAT_DATE")
	private Timestamp DEAL_MAT_DATE;
	
	@Column(name="DEAL_INCLUDE_COLL_ACCT_EARNING")
	private String DEAL_INCLUDE_COLL_ACCT_EARNING;
	
	@Column(name="DEAL_IS_WRAPPED")
	private String DEAL_IS_WRAPPED;
	
	@Column(name="DEAL_REVOLVE_END_DATE")
	private Timestamp DEAL_REVOLVE_END_DATE;
	
	@Column(name="DEAL_SPDACT_TARGET_PCT")
	private BigDecimal DEAL_SPDACT_TARGET_PCT;
	
	@Column(name="DEAL_SPDACT_INITIAL_DEPOSIT")
	private BigDecimal DEAL_SPDACT_INITIAL_DEPOSIT;
	
	@Column(name="DEAL_SPDACT_CURR_BALANCE")
	private BigDecimal DEAL_SPDACT_CURR_BALANCE;
	
	@Column(name="DEAL_REVIEW_DATE")
	private Timestamp DEAL_REVIEW_DATE;

	@Column(name="DEAL_LAST_RUN_DATE")
	private Timestamp DEAL_LAST_RUN_DATE;
	
	@Column(name="DEAL_LAST_RECORD_DATE")
	private Timestamp DEAL_LAST_RECORD_DATE;
	
	@Column(name="DEAL_STEP_DOWN_TRIAL_DATE")
	private Timestamp DEAL_STEP_DOWN_TRIAL_DATE;
	
	@Column(name="ISSU_ID")
	private BigDecimal ISSU_ID;
	
	@Column(name="TAXC_ID")
	private BigDecimal TAXC_ID;
	
	@Column(name="UNWR_ID")
	private BigDecimal UNWR_ID;
	
	@Column(name="ALLO_CODE")
	private String ALLO_CODE;
	
	@Column(name="DEAL_IS_SPDACT")
	private String DEAL_IS_SPDACT;
	
	@Column(name="DEAL_AVG_EARNING_DAYS")
	private BigDecimal DEAL_AVG_EARNING_DAYS;
	
	@Column(name="ISSV_ID")
	private BigDecimal ISSV_ID;
	
	@Column(name="STTS_CODE")
	private String STTS_CODE;
	
	@Column(name="AMFF_ID")
	private BigDecimal AMFF_ID;
	
	@Column(name="DEAL_YLD_SUP_ACT_TARGET_PCT")
	private BigDecimal DEAL_YLD_SUP_ACT_TARGET_PCT;
	
	@Column(name="DEAL_YLD_SUP_ACT_INIT_DEPOSIT")
	private BigDecimal DEAL_YLD_SUP_ACT_INIT_DEPOSIT;
	
	@Column(name="DEAL_YLD_SUP_ACT_CURR_BALANCE")
	private BigDecimal DEAL_YLD_SUP_ACT_CURR_BALANCE;
	
	@Column(name="DEAL_IS_YLD_SUP_ACT")
	private String DEAL_IS_YLD_SUP_ACT;
	
	@Column(name="YSAC_ID")
	private BigDecimal YSAC_ID;
	
	@Column(name="TRST_ID")
	private BigDecimal TRST_ID;
	
	@Column(name="USE_WATERFALLEDITOR")
	private String USE_WATERFALLEDITOR;
	
	@Column(name="CRE_USER_ID")
	private BigDecimal CRE_USER_ID;
	
	@Column(name="MOD_USER_ID")
	private BigDecimal MOD_USER_ID;
	
	@Column(name="CRE_DATE")
	private Timestamp CRE_DATE;
	
	@Column(name="MOD_DATE")
	private Timestamp MOD_DATE;
	
	@Column(name="NB_POOL")
	private BigDecimal NB_POOL;
	
	@Column(name="MP_POOL_CONFIGURATION")
	private BigDecimal MP_POOL_CONFIGURATION;
	
	@Column(name="METRICS_COMPUTATION")
	private String METRICS_COMPUTATION;

	@Column(name="NOTES")
	private String NOTES;
	
	@Column(name="SMOOTH_FMV")
	private String SMOOTH_FMV;

	@Column(name="BOTE_REMAINING_AVG_LIFE")
	private BigDecimal BOTE_REMAINING_AVG_LIFE;
	
	@Column(name="BOTE_EXPECTED_LOSS")
	private BigDecimal BOTE_EXPECTED_LOSS;
	
	@Column(name="BOTE_ALPHA")
	private BigDecimal BOTE_ALPHA;

	@Column(name="BOTE_EXP_RECOVERY_PERCENTAGE")
	private BigDecimal BOTE_EXP_RECOVERY_PERCENTAGE;
	
	@Column(name="ORIGINATORS_NB")
	private BigDecimal ORIGINATORS_NB;
	
	@Column(name="AVM_MODULATION")
	private String AVM_MODULATION;
	
	@Column(name="VANTAGE_MODULATION")
	private String VANTAGE_MODULATION;
	
	@Column(name="COUNTRY_CODE")
	private String COUNTRY_CODE;
	
	@Column(name="SIMPLE_WATERFALL")
	private String SIMPLE_WATERFALL;
	
	@Column(name="REC_TO_INT_COLL")
	private String REC_TO_INT_COLL;

	@Column(name="DEAL_OWNER")
	private BigDecimal DEAL_OWNER;

	@Column(name="DEAL_DATA_QUALITY")
	private BigDecimal DEAL_DATA_QUALITY;
	
	// Constructor
	public ABSDeal() {}
	
	public ABSDeal(BigDecimal dEAL_ID, String aCLS_CODE, BigDecimal rEVIEW_PRSN_ID_USER, String bASI_CODE,
			String eXCH_CODE, String mRKT_CODE, String tARGET_MRAT_LETTER_GRADE, String dEAL_SHORTNAME,
			String dEAL_NAME, BigDecimal dEAL_ABSNET_DEAL_ID, Timestamp dEAL_CLOSING_DATE, Timestamp dEAL_MAT_DATE,
			String dEAL_INCLUDE_COLL_ACCT_EARNING, String dEAL_IS_WRAPPED, Timestamp dEAL_REVOLVE_END_DATE,
			BigDecimal dEAL_SPDACT_TARGET_PCT, BigDecimal dEAL_SPDACT_INITIAL_DEPOSIT,
			BigDecimal dEAL_SPDACT_CURR_BALANCE, Timestamp dEAL_REVIEW_DATE, Timestamp dEAL_LAST_RUN_DATE,
			Timestamp dEAL_LAST_RECORD_DATE, Timestamp dEAL_STEP_DOWN_TRIAL_DATE, BigDecimal iSSU_ID,
			BigDecimal tAXC_ID, BigDecimal uNWR_ID, String aLLO_CODE, String dEAL_IS_SPDACT,
			BigDecimal dEAL_AVG_EARNING_DAYS, BigDecimal iSSV_ID, String sTTS_CODE, BigDecimal aMFF_ID,
			BigDecimal dEAL_YLD_SUP_ACT_TARGET_PCT, BigDecimal dEAL_YLD_SUP_ACT_INIT_DEPOSIT,
			BigDecimal dEAL_YLD_SUP_ACT_CURR_BALANCE, String dEAL_IS_YLD_SUP_ACT, BigDecimal ySAC_ID,
			BigDecimal tRST_ID, String uSE_WATERFALLEDITOR, BigDecimal cRE_USER_ID, BigDecimal mOD_USER_ID,
			Timestamp cRE_DATE, Timestamp mOD_DATE, BigDecimal nB_POOL, BigDecimal mP_POOL_CONFIGURATION,
			String mETRICS_COMPUTATION, String nOTES, String sMOOTH_FMV, BigDecimal bOTE_REMAINING_AVG_LIFE,
			BigDecimal bOTE_EXPECTED_LOSS, BigDecimal bOTE_ALPHA, BigDecimal bOTE_EXP_RECOVERY_PERCENTAGE,
			BigDecimal oRIGINATORS_NB, String aVM_MODULATION, String vANTAGE_MODULATION, String cOUNTRY_CODE,
			String sIMPLE_WATERFALL, String rEC_TO_INT_COLL, BigDecimal dEAL_OWNER, BigDecimal dEAL_DATA_QUALITY) {
		DEAL_ID = dEAL_ID;
		ACLS_CODE = aCLS_CODE;
		REVIEW_PRSN_ID_USER = rEVIEW_PRSN_ID_USER;
		BASI_CODE = bASI_CODE;
		EXCH_CODE = eXCH_CODE;
		MRKT_CODE = mRKT_CODE;
		TARGET_MRAT_LETTER_GRADE = tARGET_MRAT_LETTER_GRADE;
		DEAL_SHORTNAME = dEAL_SHORTNAME;
		DEAL_NAME = dEAL_NAME;
		DEAL_ABSNET_DEAL_ID = dEAL_ABSNET_DEAL_ID;
		DEAL_CLOSING_DATE = dEAL_CLOSING_DATE;
		DEAL_MAT_DATE = dEAL_MAT_DATE;
		DEAL_INCLUDE_COLL_ACCT_EARNING = dEAL_INCLUDE_COLL_ACCT_EARNING;
		DEAL_IS_WRAPPED = dEAL_IS_WRAPPED;
		DEAL_REVOLVE_END_DATE = dEAL_REVOLVE_END_DATE;
		DEAL_SPDACT_TARGET_PCT = dEAL_SPDACT_TARGET_PCT;
		DEAL_SPDACT_INITIAL_DEPOSIT = dEAL_SPDACT_INITIAL_DEPOSIT;
		DEAL_SPDACT_CURR_BALANCE = dEAL_SPDACT_CURR_BALANCE;
		DEAL_REVIEW_DATE = dEAL_REVIEW_DATE;
		DEAL_LAST_RUN_DATE = dEAL_LAST_RUN_DATE;
		DEAL_LAST_RECORD_DATE = dEAL_LAST_RECORD_DATE;
		DEAL_STEP_DOWN_TRIAL_DATE = dEAL_STEP_DOWN_TRIAL_DATE;
		ISSU_ID = iSSU_ID;
		TAXC_ID = tAXC_ID;
		UNWR_ID = uNWR_ID;
		ALLO_CODE = aLLO_CODE;
		DEAL_IS_SPDACT = dEAL_IS_SPDACT;
		DEAL_AVG_EARNING_DAYS = dEAL_AVG_EARNING_DAYS;
		ISSV_ID = iSSV_ID;
		STTS_CODE = sTTS_CODE;
		AMFF_ID = aMFF_ID;
		DEAL_YLD_SUP_ACT_TARGET_PCT = dEAL_YLD_SUP_ACT_TARGET_PCT;
		DEAL_YLD_SUP_ACT_INIT_DEPOSIT = dEAL_YLD_SUP_ACT_INIT_DEPOSIT;
		DEAL_YLD_SUP_ACT_CURR_BALANCE = dEAL_YLD_SUP_ACT_CURR_BALANCE;
		DEAL_IS_YLD_SUP_ACT = dEAL_IS_YLD_SUP_ACT;
		YSAC_ID = ySAC_ID;
		TRST_ID = tRST_ID;
		USE_WATERFALLEDITOR = uSE_WATERFALLEDITOR;
		CRE_USER_ID = cRE_USER_ID;
		MOD_USER_ID = mOD_USER_ID;
		CRE_DATE = cRE_DATE;
		MOD_DATE = mOD_DATE;
		NB_POOL = nB_POOL;
		MP_POOL_CONFIGURATION = mP_POOL_CONFIGURATION;
		METRICS_COMPUTATION = mETRICS_COMPUTATION;
		NOTES = nOTES;
		SMOOTH_FMV = sMOOTH_FMV;
		BOTE_REMAINING_AVG_LIFE = bOTE_REMAINING_AVG_LIFE;
		BOTE_EXPECTED_LOSS = bOTE_EXPECTED_LOSS;
		BOTE_ALPHA = bOTE_ALPHA;
		BOTE_EXP_RECOVERY_PERCENTAGE = bOTE_EXP_RECOVERY_PERCENTAGE;
		ORIGINATORS_NB = oRIGINATORS_NB;
		AVM_MODULATION = aVM_MODULATION;
		VANTAGE_MODULATION = vANTAGE_MODULATION;
		COUNTRY_CODE = cOUNTRY_CODE;
		SIMPLE_WATERFALL = sIMPLE_WATERFALL;
		REC_TO_INT_COLL = rEC_TO_INT_COLL;
		DEAL_OWNER = dEAL_OWNER;
		DEAL_DATA_QUALITY = dEAL_DATA_QUALITY;
	}
	
	// Gets and Setters
	public BigDecimal getDEAL_ID() {
		return DEAL_ID;
	}

	

	public void setDEAL_ID(BigDecimal dEAL_ID) {
		DEAL_ID = dEAL_ID;
	}

	public String getACLS_CODE() {
		return ACLS_CODE;
	}

	public void setACLS_CODE(String aCLS_CODE) {
		ACLS_CODE = aCLS_CODE;
	}

	public BigDecimal getREVIEW_PRSN_ID_USER() {
		return REVIEW_PRSN_ID_USER;
	}

	public void setREVIEW_PRSN_ID_USER(BigDecimal rEVIEW_PRSN_ID_USER) {
		REVIEW_PRSN_ID_USER = rEVIEW_PRSN_ID_USER;
	}

	public String getBASI_CODE() {
		return BASI_CODE;
	}

	public void setBASI_CODE(String bASI_CODE) {
		BASI_CODE = bASI_CODE;
	}

	public String getEXCH_CODE() {
		return EXCH_CODE;
	}

	public void setEXCH_CODE(String eXCH_CODE) {
		EXCH_CODE = eXCH_CODE;
	}

	public String getMRKT_CODE() {
		return MRKT_CODE;
	}

	public void setMRKT_CODE(String mRKT_CODE) {
		MRKT_CODE = mRKT_CODE;
	}

	public String getTARGET_MRAT_LETTER_GRADE() {
		return TARGET_MRAT_LETTER_GRADE;
	}

	public void setTARGET_MRAT_LETTER_GRADE(String tARGET_MRAT_LETTER_GRADE) {
		TARGET_MRAT_LETTER_GRADE = tARGET_MRAT_LETTER_GRADE;
	}

	public String getDEAL_SHORTNAME() {
		return DEAL_SHORTNAME;
	}

	public void setDEAL_SHORTNAME(String dEAL_SHORTNAME) {
		DEAL_SHORTNAME = dEAL_SHORTNAME;
	}

	public String getDEAL_NAME() {
		return DEAL_NAME;
	}

	public void setDEAL_NAME(String dEAL_NAME) {
		DEAL_NAME = dEAL_NAME;
	}

	public BigDecimal getDEAL_ABSNET_DEAL_ID() {
		return DEAL_ABSNET_DEAL_ID;
	}

	public void setDEAL_ABSNET_DEAL_ID(BigDecimal dEAL_ABSNET_DEAL_ID) {
		DEAL_ABSNET_DEAL_ID = dEAL_ABSNET_DEAL_ID;
	}

	public Timestamp getDEAL_CLOSING_DATE() {
		return DEAL_CLOSING_DATE;
	}

	public void setDEAL_CLOSING_DATE(Timestamp dEAL_CLOSING_DATE) {
		DEAL_CLOSING_DATE = dEAL_CLOSING_DATE;
	}

	public Timestamp getDEAL_MAT_DATE() {
		return DEAL_MAT_DATE;
	}

	public void setDEAL_MAT_DATE(Timestamp dEAL_MAT_DATE) {
		DEAL_MAT_DATE = dEAL_MAT_DATE;
	}

	public String getDEAL_INCLUDE_COLL_ACCT_EARNING() {
		return DEAL_INCLUDE_COLL_ACCT_EARNING;
	}

	public void setDEAL_INCLUDE_COLL_ACCT_EARNING(String dEAL_INCLUDE_COLL_ACCT_EARNING) {
		DEAL_INCLUDE_COLL_ACCT_EARNING = dEAL_INCLUDE_COLL_ACCT_EARNING;
	}

	public String getDEAL_IS_WRAPPED() {
		return DEAL_IS_WRAPPED;
	}

	public void setDEAL_IS_WRAPPED(String dEAL_IS_WRAPPED) {
		DEAL_IS_WRAPPED = dEAL_IS_WRAPPED;
	}

	public Timestamp getDEAL_REVOLVE_END_DATE() {
		return DEAL_REVOLVE_END_DATE;
	}

	public void setDEAL_REVOLVE_END_DATE(Timestamp dEAL_REVOLVE_END_DATE) {
		DEAL_REVOLVE_END_DATE = dEAL_REVOLVE_END_DATE;
	}

	public BigDecimal getDEAL_SPDACT_TARGET_PCT() {
		return DEAL_SPDACT_TARGET_PCT;
	}

	public void setDEAL_SPDACT_TARGET_PCT(BigDecimal dEAL_SPDACT_TARGET_PCT) {
		DEAL_SPDACT_TARGET_PCT = dEAL_SPDACT_TARGET_PCT;
	}

	public BigDecimal getDEAL_SPDACT_INITIAL_DEPOSIT() {
		return DEAL_SPDACT_INITIAL_DEPOSIT;
	}

	public void setDEAL_SPDACT_INITIAL_DEPOSIT(BigDecimal dEAL_SPDACT_INITIAL_DEPOSIT) {
		DEAL_SPDACT_INITIAL_DEPOSIT = dEAL_SPDACT_INITIAL_DEPOSIT;
	}

	public BigDecimal getDEAL_SPDACT_CURR_BALANCE() {
		return DEAL_SPDACT_CURR_BALANCE;
	}

	public void setDEAL_SPDACT_CURR_BALANCE(BigDecimal dEAL_SPDACT_CURR_BALANCE) {
		DEAL_SPDACT_CURR_BALANCE = dEAL_SPDACT_CURR_BALANCE;
	}

	public Timestamp getDEAL_REVIEW_DATE() {
		return DEAL_REVIEW_DATE;
	}

	public void setDEAL_REVIEW_DATE(Timestamp dEAL_REVIEW_DATE) {
		DEAL_REVIEW_DATE = dEAL_REVIEW_DATE;
	}

	public Timestamp getDEAL_LAST_RUN_DATE() {
		return DEAL_LAST_RUN_DATE;
	}

	public void setDEAL_LAST_RUN_DATE(Timestamp dEAL_LAST_RUN_DATE) {
		DEAL_LAST_RUN_DATE = dEAL_LAST_RUN_DATE;
	}

	public Timestamp getDEAL_LAST_RECORD_DATE() {
		return DEAL_LAST_RECORD_DATE;
	}

	public void setDEAL_LAST_RECORD_DATE(Timestamp dEAL_LAST_RECORD_DATE) {
		DEAL_LAST_RECORD_DATE = dEAL_LAST_RECORD_DATE;
	}

	public Timestamp getDEAL_STEP_DOWN_TRIAL_DATE() {
		return DEAL_STEP_DOWN_TRIAL_DATE;
	}

	public void setDEAL_STEP_DOWN_TRIAL_DATE(Timestamp dEAL_STEP_DOWN_TRIAL_DATE) {
		DEAL_STEP_DOWN_TRIAL_DATE = dEAL_STEP_DOWN_TRIAL_DATE;
	}

	public BigDecimal getISSU_ID() {
		return ISSU_ID;
	}

	public void setISSU_ID(BigDecimal iSSU_ID) {
		ISSU_ID = iSSU_ID;
	}

	public BigDecimal getTAXC_ID() {
		return TAXC_ID;
	}

	public void setTAXC_ID(BigDecimal tAXC_ID) {
		TAXC_ID = tAXC_ID;
	}

	public BigDecimal getUNWR_ID() {
		return UNWR_ID;
	}

	public void setUNWR_ID(BigDecimal uNWR_ID) {
		UNWR_ID = uNWR_ID;
	}

	public String getALLO_CODE() {
		return ALLO_CODE;
	}

	public void setALLO_CODE(String aLLO_CODE) {
		ALLO_CODE = aLLO_CODE;
	}

	public String getDEAL_IS_SPDACT() {
		return DEAL_IS_SPDACT;
	}

	public void setDEAL_IS_SPDACT(String dEAL_IS_SPDACT) {
		DEAL_IS_SPDACT = dEAL_IS_SPDACT;
	}

	public BigDecimal getDEAL_AVG_EARNING_DAYS() {
		return DEAL_AVG_EARNING_DAYS;
	}

	public void setDEAL_AVG_EARNING_DAYS(BigDecimal dEAL_AVG_EARNING_DAYS) {
		DEAL_AVG_EARNING_DAYS = dEAL_AVG_EARNING_DAYS;
	}

	public BigDecimal getISSV_ID() {
		return ISSV_ID;
	}

	public void setISSV_ID(BigDecimal iSSV_ID) {
		ISSV_ID = iSSV_ID;
	}

	public String getSTTS_CODE() {
		return STTS_CODE;
	}

	public void setSTTS_CODE(String sTTS_CODE) {
		STTS_CODE = sTTS_CODE;
	}

	public BigDecimal getAMFF_ID() {
		return AMFF_ID;
	}

	public void setAMFF_ID(BigDecimal aMFF_ID) {
		AMFF_ID = aMFF_ID;
	}

	public BigDecimal getDEAL_YLD_SUP_ACT_TARGET_PCT() {
		return DEAL_YLD_SUP_ACT_TARGET_PCT;
	}

	public void setDEAL_YLD_SUP_ACT_TARGET_PCT(BigDecimal dEAL_YLD_SUP_ACT_TARGET_PCT) {
		DEAL_YLD_SUP_ACT_TARGET_PCT = dEAL_YLD_SUP_ACT_TARGET_PCT;
	}

	public BigDecimal getDEAL_YLD_SUP_ACT_INIT_DEPOSIT() {
		return DEAL_YLD_SUP_ACT_INIT_DEPOSIT;
	}

	public void setDEAL_YLD_SUP_ACT_INIT_DEPOSIT(BigDecimal dEAL_YLD_SUP_ACT_INIT_DEPOSIT) {
		DEAL_YLD_SUP_ACT_INIT_DEPOSIT = dEAL_YLD_SUP_ACT_INIT_DEPOSIT;
	}

	public BigDecimal getDEAL_YLD_SUP_ACT_CURR_BALANCE() {
		return DEAL_YLD_SUP_ACT_CURR_BALANCE;
	}

	public void setDEAL_YLD_SUP_ACT_CURR_BALANCE(BigDecimal dEAL_YLD_SUP_ACT_CURR_BALANCE) {
		DEAL_YLD_SUP_ACT_CURR_BALANCE = dEAL_YLD_SUP_ACT_CURR_BALANCE;
	}

	public String getDEAL_IS_YLD_SUP_ACT() {
		return DEAL_IS_YLD_SUP_ACT;
	}

	public void setDEAL_IS_YLD_SUP_ACT(String dEAL_IS_YLD_SUP_ACT) {
		DEAL_IS_YLD_SUP_ACT = dEAL_IS_YLD_SUP_ACT;
	}

	public BigDecimal getYSAC_ID() {
		return YSAC_ID;
	}

	public void setYSAC_ID(BigDecimal ySAC_ID) {
		YSAC_ID = ySAC_ID;
	}

	public BigDecimal getTRST_ID() {
		return TRST_ID;
	}

	public void setTRST_ID(BigDecimal tRST_ID) {
		TRST_ID = tRST_ID;
	}

	public String getUSE_WATERFALLEDITOR() {
		return USE_WATERFALLEDITOR;
	}

	public void setUSE_WATERFALLEDITOR(String uSE_WATERFALLEDITOR) {
		USE_WATERFALLEDITOR = uSE_WATERFALLEDITOR;
	}

	public BigDecimal getCRE_USER_ID() {
		return CRE_USER_ID;
	}

	public void setCRE_USER_ID(BigDecimal cRE_USER_ID) {
		CRE_USER_ID = cRE_USER_ID;
	}

	public BigDecimal getMOD_USER_ID() {
		return MOD_USER_ID;
	}

	public void setMOD_USER_ID(BigDecimal mOD_USER_ID) {
		MOD_USER_ID = mOD_USER_ID;
	}

	public Timestamp getCRE_DATE() {
		return CRE_DATE;
	}

	public void setCRE_DATE(Timestamp cRE_DATE) {
		CRE_DATE = cRE_DATE;
	}

	public Timestamp getMOD_DATE() {
		return MOD_DATE;
	}

	public void setMOD_DATE(Timestamp mOD_DATE) {
		MOD_DATE = mOD_DATE;
	}

	public BigDecimal getNB_POOL() {
		return NB_POOL;
	}

	public void setNB_POOL(BigDecimal nB_POOL) {
		NB_POOL = nB_POOL;
	}

	public BigDecimal getMP_POOL_CONFIGURATION() {
		return MP_POOL_CONFIGURATION;
	}

	public void setMP_POOL_CONFIGURATION(BigDecimal mP_POOL_CONFIGURATION) {
		MP_POOL_CONFIGURATION = mP_POOL_CONFIGURATION;
	}

	public String getMETRICS_COMPUTATION() {
		return METRICS_COMPUTATION;
	}

	public void setMETRICS_COMPUTATION(String mETRICS_COMPUTATION) {
		METRICS_COMPUTATION = mETRICS_COMPUTATION;
	}

	public String getNOTES() {
		return NOTES;
	}

	public void setNOTES(String nOTES) {
		NOTES = nOTES;
	}

	public String getSMOOTH_FMV() {
		return SMOOTH_FMV;
	}

	public void setSMOOTH_FMV(String sMOOTH_FMV) {
		SMOOTH_FMV = sMOOTH_FMV;
	}

	public BigDecimal getBOTE_REMAINING_AVG_LIFE() {
		return BOTE_REMAINING_AVG_LIFE;
	}

	public void setBOTE_REMAINING_AVG_LIFE(BigDecimal bOTE_REMAINING_AVG_LIFE) {
		BOTE_REMAINING_AVG_LIFE = bOTE_REMAINING_AVG_LIFE;
	}

	public BigDecimal getBOTE_EXPECTED_LOSS() {
		return BOTE_EXPECTED_LOSS;
	}

	public void setBOTE_EXPECTED_LOSS(BigDecimal bOTE_EXPECTED_LOSS) {
		BOTE_EXPECTED_LOSS = bOTE_EXPECTED_LOSS;
	}

	public BigDecimal getBOTE_ALPHA() {
		return BOTE_ALPHA;
	}

	public void setBOTE_ALPHA(BigDecimal bOTE_ALPHA) {
		BOTE_ALPHA = bOTE_ALPHA;
	}

	public BigDecimal getBOTE_EXP_RECOVERY_PERCENTAGE() {
		return BOTE_EXP_RECOVERY_PERCENTAGE;
	}

	public void setBOTE_EXP_RECOVERY_PERCENTAGE(BigDecimal bOTE_EXP_RECOVERY_PERCENTAGE) {
		BOTE_EXP_RECOVERY_PERCENTAGE = bOTE_EXP_RECOVERY_PERCENTAGE;
	}

	public BigDecimal getORIGINATORS_NB() {
		return ORIGINATORS_NB;
	}

	public void setORIGINATORS_NB(BigDecimal oRIGINATORS_NB) {
		ORIGINATORS_NB = oRIGINATORS_NB;
	}

	public String getAVM_MODULATION() {
		return AVM_MODULATION;
	}

	public void setAVM_MODULATION(String aVM_MODULATION) {
		AVM_MODULATION = aVM_MODULATION;
	}

	public String getVANTAGE_MODULATION() {
		return VANTAGE_MODULATION;
	}

	public void setVANTAGE_MODULATION(String vANTAGE_MODULATION) {
		VANTAGE_MODULATION = vANTAGE_MODULATION;
	}

	public String getCOUNTRY_CODE() {
		return COUNTRY_CODE;
	}

	public void setCOUNTRY_CODE(String cOUNTRY_CODE) {
		COUNTRY_CODE = cOUNTRY_CODE;
	}

	public String getSIMPLE_WATERFALL() {
		return SIMPLE_WATERFALL;
	}

	public void setSIMPLE_WATERFALL(String sIMPLE_WATERFALL) {
		SIMPLE_WATERFALL = sIMPLE_WATERFALL;
	}

	public String getREC_TO_INT_COLL() {
		return REC_TO_INT_COLL;
	}

	public void setREC_TO_INT_COLL(String rEC_TO_INT_COLL) {
		REC_TO_INT_COLL = rEC_TO_INT_COLL;
	}

	public BigDecimal getDEAL_OWNER() {
		return DEAL_OWNER;
	}

	public void setDEAL_OWNER(BigDecimal dEAL_OWNER) {
		DEAL_OWNER = dEAL_OWNER;
	}

	public BigDecimal getDEAL_DATA_QUALITY() {
		return DEAL_DATA_QUALITY;
	}

	public void setDEAL_DATA_QUALITY(BigDecimal dEAL_DATA_QUALITY) {
		DEAL_DATA_QUALITY = dEAL_DATA_QUALITY;
	}

	@Override
	public String toString() {
		return "ABSDeal [DEAL_ID=" + DEAL_ID + ", ACLS_CODE=" + ACLS_CODE + ", REVIEW_PRSN_ID_USER="
				+ REVIEW_PRSN_ID_USER + ", BASI_CODE=" + BASI_CODE + ", EXCH_CODE=" + EXCH_CODE + ", MRKT_CODE="
				+ MRKT_CODE + ", TARGET_MRAT_LETTER_GRADE=" + TARGET_MRAT_LETTER_GRADE + ", DEAL_SHORTNAME="
				+ DEAL_SHORTNAME + ", DEAL_NAME=" + DEAL_NAME + ", DEAL_ABSNET_DEAL_ID=" + DEAL_ABSNET_DEAL_ID
				+ ", DEAL_CLOSING_DATE=" + DEAL_CLOSING_DATE + ", DEAL_MAT_DATE=" + DEAL_MAT_DATE
				+ ", DEAL_INCLUDE_COLL_ACCT_EARNING=" + DEAL_INCLUDE_COLL_ACCT_EARNING + ", DEAL_IS_WRAPPED="
				+ DEAL_IS_WRAPPED + ", DEAL_REVOLVE_END_DATE=" + DEAL_REVOLVE_END_DATE + ", DEAL_SPDACT_TARGET_PCT="
				+ DEAL_SPDACT_TARGET_PCT + ", DEAL_SPDACT_INITIAL_DEPOSIT=" + DEAL_SPDACT_INITIAL_DEPOSIT
				+ ", DEAL_SPDACT_CURR_BALANCE=" + DEAL_SPDACT_CURR_BALANCE + ", DEAL_REVIEW_DATE=" + DEAL_REVIEW_DATE
				+ ", DEAL_LAST_RUN_DATE=" + DEAL_LAST_RUN_DATE + ", DEAL_LAST_RECORD_DATE=" + DEAL_LAST_RECORD_DATE
				+ ", DEAL_STEP_DOWN_TRIAL_DATE=" + DEAL_STEP_DOWN_TRIAL_DATE + ", ISSU_ID=" + ISSU_ID + ", TAXC_ID="
				+ TAXC_ID + ", UNWR_ID=" + UNWR_ID + ", ALLO_CODE=" + ALLO_CODE + ", DEAL_IS_SPDACT=" + DEAL_IS_SPDACT
				+ ", DEAL_AVG_EARNING_DAYS=" + DEAL_AVG_EARNING_DAYS + ", ISSV_ID=" + ISSV_ID + ", STTS_CODE="
				+ STTS_CODE + ", AMFF_ID=" + AMFF_ID + ", DEAL_YLD_SUP_ACT_TARGET_PCT=" + DEAL_YLD_SUP_ACT_TARGET_PCT
				+ ", DEAL_YLD_SUP_ACT_INIT_DEPOSIT=" + DEAL_YLD_SUP_ACT_INIT_DEPOSIT
				+ ", DEAL_YLD_SUP_ACT_CURR_BALANCE=" + DEAL_YLD_SUP_ACT_CURR_BALANCE + ", DEAL_IS_YLD_SUP_ACT="
				+ DEAL_IS_YLD_SUP_ACT + ", YSAC_ID=" + YSAC_ID + ", TRST_ID=" + TRST_ID + ", USE_WATERFALLEDITOR="
				+ USE_WATERFALLEDITOR + ", CRE_USER_ID=" + CRE_USER_ID + ", MOD_USER_ID=" + MOD_USER_ID + ", CRE_DATE="
				+ CRE_DATE + ", MOD_DATE=" + MOD_DATE + ", NB_POOL=" + NB_POOL + ", MP_POOL_CONFIGURATION="
				+ MP_POOL_CONFIGURATION + ", METRICS_COMPUTATION=" + METRICS_COMPUTATION + ", NOTES=" + NOTES
				+ ", SMOOTH_FMV=" + SMOOTH_FMV + ", BOTE_REMAINING_AVG_LIFE=" + BOTE_REMAINING_AVG_LIFE
				+ ", BOTE_EXPECTED_LOSS=" + BOTE_EXPECTED_LOSS + ", BOTE_ALPHA=" + BOTE_ALPHA
				+ ", BOTE_EXP_RECOVERY_PERCENTAGE=" + BOTE_EXP_RECOVERY_PERCENTAGE + ", ORIGINATORS_NB="
				+ ORIGINATORS_NB + ", AVM_MODULATION=" + AVM_MODULATION + ", VANTAGE_MODULATION=" + VANTAGE_MODULATION
				+ ", COUNTRY_CODE=" + COUNTRY_CODE + ", SIMPLE_WATERFALL=" + SIMPLE_WATERFALL + ", REC_TO_INT_COLL="
				+ REC_TO_INT_COLL + ", DEAL_OWNER=" + DEAL_OWNER + ", DEAL_DATA_QUALITY=" + DEAL_DATA_QUALITY + "]";
	}
	
}
