package com.example.EdgarDealStore.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ABS_ABSNET_POOL")
public class ABSAbsnetPool{

	@EmbeddedId
	private ABSabsnetPoolPK absnetPoolPK;
	
	@Column(name="APOL_CURR_BALANCE")
	private BigDecimal APOL_CURR_BALANCE;
	
	@Column(name="APOL_CURR_WAC")
	private BigDecimal APOL_CURR_WAC;
	
	@Column(name="APOL_CURR_WARM")
	private BigDecimal APOL_CURR_WARM;
	
	@Column(name="APOL_PERIODIC_DEF_AMT")
	private BigDecimal APOL_PERIODIC_DEF_AMT;
	
	@Column(name="APOL_PERIODIC_PREPAY_AMT")
	private BigDecimal APOL_PERIODIC_PREPAY_AMT;
	
	@Column(name="APOL_PERIODIC_RECOVERIES")
	private BigDecimal APOL_PERIODIC_RECOVERIES;
	
	@Column(name="APOL_RECOVERY_PCT")
	private BigDecimal APOL_RECOVERY_PCT;
	
	@Column(name="APOL_TOTAL_CONTRACTS")
	private BigDecimal APOL_TOTAL_CONTRACTS;
	
	@Column(name="APOL_TOTAL_DELINQUENT_BALANCE")
	private BigDecimal APOL_TOTAL_DELINQUENT_BALANCE;
	
	@Column(name="APOL_30_DAY_DELINQUENT_BALANCE")
	private BigDecimal APOL_30_DAY_DELINQUENT_BALANCE;
	
	@Column(name="APOL_30_DAY_DELINQUENT_ACCTS")
	private BigDecimal APOL_30_DAY_DELINQUENT_ACCTS;
	
	@Column(name="APOL_60_DAY_DELINQUENT_BALANCE")
	private BigDecimal APOL_60_DAY_DELINQUENT_BALANCE;
	
	@Column(name="APOL_60_DAY_DELINQUENT_ACCTS")
	private BigDecimal APOL_60_DAY_DELINQUENT_ACCTS;
	
	@Column(name="APOL_90_DAY_DELINQUENT_BALANCE")
	private BigDecimal APOL_90_DAY_DELINQUENT_BALANCE;
	
	@Column(name="APOL_90_DAY_DELINQUENT_ACCTS")
	private BigDecimal APOL_90_DAY_DELINQUENT_ACCTS;
	
	@Column(name="APOL_90PLUS_DELINQUENT_BALANCE")
	private BigDecimal APOL_90PLUS_DELINQUENT_BALANCE;
	
	@Column(name="APOL_120_DAY_DELINQUENT_ACCTS")
	private BigDecimal APOL_120_DAY_DELINQUENT_ACCTS;
	
	@Column(name="APOL_150_DAY_DELINQUENT_ACCTS")
	private BigDecimal APOL_150_DAY_DELINQUENT_ACCTS;
	
	@Column(name="APOL_SMM_PPMT_ACTUAL")
	private BigDecimal APOL_SMM_PPMT_ACTUAL;
	
	@Column(name="APOL_ABS_PPMT_ACTUAL")
	private BigDecimal APOL_ABS_PPMT_ACTUAL;
	
	@Column(name="APOL_TOTAL_COLLECTIONS")
	private BigDecimal APOL_TOTAL_COLLECTIONS;
	
	@Column(name="APOL_PERIOD")
	private BigDecimal APOL_PERIOD;
	
	@Column(name="APOL_30_DAY_DELINQUENT_PCT")
	private BigDecimal APOL_30_DAY_DELINQUENT_PCT;
	
	@Column(name="APOL_60_DAY_DELINQUENT_PCT")
	private BigDecimal APOL_60_DAY_DELINQUENT_PCT;
	
	@Column(name="APOL_90_DAY_DELINQUENT_PCT")
	private BigDecimal APOL_90_DAY_DELINQUENT_PCT;
	
	@Column(name="APOL_90PLUS_DELINQUENT_PCT")
	private BigDecimal APOL_90PLUS_DELINQUENT_PCT;
	
	@Column(name="APOL_CUMM_GROSS_LOSSES")
	private BigDecimal APOL_CUMM_GROSS_LOSSES;
	
	@Column(name="APOL_CUMM_PREPAYMENTS")
	private BigDecimal APOL_CUMM_PREPAYMENTS;
	
	@Column(name="APOL_IS_PAID_OFF")
	private String APOL_IS_PAID_OFF;
	
	@Column(name="APOL_PREFUNDING_BALANCE")
	private BigDecimal APOL_PREFUNDING_BALANCE;
	
	@Column(name="APOL_RESERVE_ACCOUNT_BALANCE")
	private BigDecimal APOL_RESERVE_ACCOUNT_BALANCE;
	
	@Column(name="APOL_SERVICER_EXPENSE")
	private BigDecimal APOL_SERVICER_EXPENSE;
	
	@Column(name="APOL_REO_BALANCE")
	private BigDecimal APOL_REO_BALANCE;
	
	@Column(name="APOL_FORECLOSURE_BALANCE")
	private BigDecimal APOL_FORECLOSURE_BALANCE;
	
	@Column(name="APOL_BANKRUPTCY_BALANCE")
	private BigDecimal APOL_BANKRUPTCY_BALANCE;
	
	@Column(name="APOL_AVG_CONTRACT_BALANCE")
	private BigDecimal APOL_AVG_CONTRACT_BALANCE;
	
	@Column(name="APOL_CL_LTV")
	private BigDecimal APOL_CL_LTV;
	
	@Column(name="APOL_CL_VANTAGE")
	private BigDecimal APOL_CL_VANTAGE;
	
	@Column(name="APOL_SUBROGATION")
	private BigDecimal APOL_SUBROGATION;
	
	@Column(name="APOL_PPMT_PENALTIES")
	private BigDecimal APOL_PPMT_PENALTIES;

	@Column(name="APOL_BUYBACK")
	private BigDecimal APOL_BUYBACK;
	
	@Column(name="APOL_PRINCIPAL_COLLECTIONS")
	private BigDecimal APOL_PRINCIPAL_COLLECTIONS;

	public ABSabsnetPoolPK getAbsnetPoolPK() {
		return absnetPoolPK;
	}

	public void setAbsnetPoolPK(ABSabsnetPoolPK absnetPoolPK) {
		this.absnetPoolPK = absnetPoolPK;
	}

	public BigDecimal getAPOL_CURR_BALANCE() {
		return APOL_CURR_BALANCE;
	}

	public void setAPOL_CURR_BALANCE(BigDecimal aPOL_CURR_BALANCE) {
		APOL_CURR_BALANCE = aPOL_CURR_BALANCE;
	}

	public BigDecimal getAPOL_CURR_WAC() {
		return APOL_CURR_WAC;
	}

	public void setAPOL_CURR_WAC(BigDecimal aPOL_CURR_WAC) {
		APOL_CURR_WAC = aPOL_CURR_WAC;
	}

	public BigDecimal getAPOL_CURR_WARM() {
		return APOL_CURR_WARM;
	}

	public void setAPOL_CURR_WARM(BigDecimal aPOL_CURR_WARM) {
		APOL_CURR_WARM = aPOL_CURR_WARM;
	}

	public BigDecimal getAPOL_PERIODIC_DEF_AMT() {
		return APOL_PERIODIC_DEF_AMT;
	}

	public void setAPOL_PERIODIC_DEF_AMT(BigDecimal aPOL_PERIODIC_DEF_AMT) {
		APOL_PERIODIC_DEF_AMT = aPOL_PERIODIC_DEF_AMT;
	}

	public BigDecimal getAPOL_PERIODIC_PREPAY_AMT() {
		return APOL_PERIODIC_PREPAY_AMT;
	}

	public void setAPOL_PERIODIC_PREPAY_AMT(BigDecimal aPOL_PERIODIC_PREPAY_AMT) {
		APOL_PERIODIC_PREPAY_AMT = aPOL_PERIODIC_PREPAY_AMT;
	}

	public BigDecimal getAPOL_PERIODIC_RECOVERIES() {
		return APOL_PERIODIC_RECOVERIES;
	}

	public void setAPOL_PERIODIC_RECOVERIES(BigDecimal aPOL_PERIODIC_RECOVERIES) {
		APOL_PERIODIC_RECOVERIES = aPOL_PERIODIC_RECOVERIES;
	}

	public BigDecimal getAPOL_RECOVERY_PCT() {
		return APOL_RECOVERY_PCT;
	}

	public void setAPOL_RECOVERY_PCT(BigDecimal aPOL_RECOVERY_PCT) {
		APOL_RECOVERY_PCT = aPOL_RECOVERY_PCT;
	}

	public BigDecimal getAPOL_TOTAL_CONTRACTS() {
		return APOL_TOTAL_CONTRACTS;
	}

	public void setAPOL_TOTAL_CONTRACTS(BigDecimal aPOL_TOTAL_CONTRACTS) {
		APOL_TOTAL_CONTRACTS = aPOL_TOTAL_CONTRACTS;
	}

	public BigDecimal getAPOL_TOTAL_DELINQUENT_BALANCE() {
		return APOL_TOTAL_DELINQUENT_BALANCE;
	}

	public void setAPOL_TOTAL_DELINQUENT_BALANCE(BigDecimal aPOL_TOTAL_DELINQUENT_BALANCE) {
		APOL_TOTAL_DELINQUENT_BALANCE = aPOL_TOTAL_DELINQUENT_BALANCE;
	}

	public BigDecimal getAPOL_30_DAY_DELINQUENT_BALANCE() {
		return APOL_30_DAY_DELINQUENT_BALANCE;
	}

	public void setAPOL_30_DAY_DELINQUENT_BALANCE(BigDecimal aPOL_30_DAY_DELINQUENT_BALANCE) {
		APOL_30_DAY_DELINQUENT_BALANCE = aPOL_30_DAY_DELINQUENT_BALANCE;
	}

	public BigDecimal getAPOL_30_DAY_DELINQUENT_ACCTS() {
		return APOL_30_DAY_DELINQUENT_ACCTS;
	}

	public void setAPOL_30_DAY_DELINQUENT_ACCTS(BigDecimal aPOL_30_DAY_DELINQUENT_ACCTS) {
		APOL_30_DAY_DELINQUENT_ACCTS = aPOL_30_DAY_DELINQUENT_ACCTS;
	}

	public BigDecimal getAPOL_60_DAY_DELINQUENT_BALANCE() {
		return APOL_60_DAY_DELINQUENT_BALANCE;
	}

	public void setAPOL_60_DAY_DELINQUENT_BALANCE(BigDecimal aPOL_60_DAY_DELINQUENT_BALANCE) {
		APOL_60_DAY_DELINQUENT_BALANCE = aPOL_60_DAY_DELINQUENT_BALANCE;
	}

	public BigDecimal getAPOL_60_DAY_DELINQUENT_ACCTS() {
		return APOL_60_DAY_DELINQUENT_ACCTS;
	}

	public void setAPOL_60_DAY_DELINQUENT_ACCTS(BigDecimal aPOL_60_DAY_DELINQUENT_ACCTS) {
		APOL_60_DAY_DELINQUENT_ACCTS = aPOL_60_DAY_DELINQUENT_ACCTS;
	}

	public BigDecimal getAPOL_90_DAY_DELINQUENT_BALANCE() {
		return APOL_90_DAY_DELINQUENT_BALANCE;
	}

	public void setAPOL_90_DAY_DELINQUENT_BALANCE(BigDecimal aPOL_90_DAY_DELINQUENT_BALANCE) {
		APOL_90_DAY_DELINQUENT_BALANCE = aPOL_90_DAY_DELINQUENT_BALANCE;
	}

	public BigDecimal getAPOL_90_DAY_DELINQUENT_ACCTS() {
		return APOL_90_DAY_DELINQUENT_ACCTS;
	}

	public void setAPOL_90_DAY_DELINQUENT_ACCTS(BigDecimal aPOL_90_DAY_DELINQUENT_ACCTS) {
		APOL_90_DAY_DELINQUENT_ACCTS = aPOL_90_DAY_DELINQUENT_ACCTS;
	}

	public BigDecimal getAPOL_90PLUS_DELINQUENT_BALANCE() {
		return APOL_90PLUS_DELINQUENT_BALANCE;
	}

	public void setAPOL_90PLUS_DELINQUENT_BALANCE(BigDecimal aPOL_90PLUS_DELINQUENT_BALANCE) {
		APOL_90PLUS_DELINQUENT_BALANCE = aPOL_90PLUS_DELINQUENT_BALANCE;
	}

	public BigDecimal getAPOL_120_DAY_DELINQUENT_ACCTS() {
		return APOL_120_DAY_DELINQUENT_ACCTS;
	}

	public void setAPOL_120_DAY_DELINQUENT_ACCTS(BigDecimal aPOL_120_DAY_DELINQUENT_ACCTS) {
		APOL_120_DAY_DELINQUENT_ACCTS = aPOL_120_DAY_DELINQUENT_ACCTS;
	}

	public BigDecimal getAPOL_150_DAY_DELINQUENT_ACCTS() {
		return APOL_150_DAY_DELINQUENT_ACCTS;
	}

	public void setAPOL_150_DAY_DELINQUENT_ACCTS(BigDecimal aPOL_150_DAY_DELINQUENT_ACCTS) {
		APOL_150_DAY_DELINQUENT_ACCTS = aPOL_150_DAY_DELINQUENT_ACCTS;
	}

	public BigDecimal getAPOL_SMM_PPMT_ACTUAL() {
		return APOL_SMM_PPMT_ACTUAL;
	}

	public void setAPOL_SMM_PPMT_ACTUAL(BigDecimal aPOL_SMM_PPMT_ACTUAL) {
		APOL_SMM_PPMT_ACTUAL = aPOL_SMM_PPMT_ACTUAL;
	}

	public BigDecimal getAPOL_ABS_PPMT_ACTUAL() {
		return APOL_ABS_PPMT_ACTUAL;
	}

	public void setAPOL_ABS_PPMT_ACTUAL(BigDecimal aPOL_ABS_PPMT_ACTUAL) {
		APOL_ABS_PPMT_ACTUAL = aPOL_ABS_PPMT_ACTUAL;
	}

	public BigDecimal getAPOL_TOTAL_COLLECTIONS() {
		return APOL_TOTAL_COLLECTIONS;
	}

	public void setAPOL_TOTAL_COLLECTIONS(BigDecimal aPOL_TOTAL_COLLECTIONS) {
		APOL_TOTAL_COLLECTIONS = aPOL_TOTAL_COLLECTIONS;
	}

	public BigDecimal getAPOL_PERIOD() {
		return APOL_PERIOD;
	}

	public void setAPOL_PERIOD(BigDecimal aPOL_PERIOD) {
		APOL_PERIOD = aPOL_PERIOD;
	}

	public BigDecimal getAPOL_30_DAY_DELINQUENT_PCT() {
		return APOL_30_DAY_DELINQUENT_PCT;
	}

	public void setAPOL_30_DAY_DELINQUENT_PCT(BigDecimal aPOL_30_DAY_DELINQUENT_PCT) {
		APOL_30_DAY_DELINQUENT_PCT = aPOL_30_DAY_DELINQUENT_PCT;
	}

	public BigDecimal getAPOL_60_DAY_DELINQUENT_PCT() {
		return APOL_60_DAY_DELINQUENT_PCT;
	}

	public void setAPOL_60_DAY_DELINQUENT_PCT(BigDecimal aPOL_60_DAY_DELINQUENT_PCT) {
		APOL_60_DAY_DELINQUENT_PCT = aPOL_60_DAY_DELINQUENT_PCT;
	}

	public BigDecimal getAPOL_90_DAY_DELINQUENT_PCT() {
		return APOL_90_DAY_DELINQUENT_PCT;
	}

	public void setAPOL_90_DAY_DELINQUENT_PCT(BigDecimal aPOL_90_DAY_DELINQUENT_PCT) {
		APOL_90_DAY_DELINQUENT_PCT = aPOL_90_DAY_DELINQUENT_PCT;
	}

	public BigDecimal getAPOL_90PLUS_DELINQUENT_PCT() {
		return APOL_90PLUS_DELINQUENT_PCT;
	}

	public void setAPOL_90PLUS_DELINQUENT_PCT(BigDecimal aPOL_90PLUS_DELINQUENT_PCT) {
		APOL_90PLUS_DELINQUENT_PCT = aPOL_90PLUS_DELINQUENT_PCT;
	}

	public BigDecimal getAPOL_CUMM_GROSS_LOSSES() {
		return APOL_CUMM_GROSS_LOSSES;
	}

	public void setAPOL_CUMM_GROSS_LOSSES(BigDecimal aPOL_CUMM_GROSS_LOSSES) {
		APOL_CUMM_GROSS_LOSSES = aPOL_CUMM_GROSS_LOSSES;
	}

	public BigDecimal getAPOL_CUMM_PREPAYMENTS() {
		return APOL_CUMM_PREPAYMENTS;
	}

	public void setAPOL_CUMM_PREPAYMENTS(BigDecimal aPOL_CUMM_PREPAYMENTS) {
		APOL_CUMM_PREPAYMENTS = aPOL_CUMM_PREPAYMENTS;
	}

	public String getAPOL_IS_PAID_OFF() {
		return APOL_IS_PAID_OFF;
	}

	public void setAPOL_IS_PAID_OFF(String aPOL_IS_PAID_OFF) {
		APOL_IS_PAID_OFF = aPOL_IS_PAID_OFF;
	}

	public BigDecimal getAPOL_PREFUNDING_BALANCE() {
		return APOL_PREFUNDING_BALANCE;
	}

	public void setAPOL_PREFUNDING_BALANCE(BigDecimal aPOL_PREFUNDING_BALANCE) {
		APOL_PREFUNDING_BALANCE = aPOL_PREFUNDING_BALANCE;
	}

	public BigDecimal getAPOL_RESERVE_ACCOUNT_BALANCE() {
		return APOL_RESERVE_ACCOUNT_BALANCE;
	}

	public void setAPOL_RESERVE_ACCOUNT_BALANCE(BigDecimal aPOL_RESERVE_ACCOUNT_BALANCE) {
		APOL_RESERVE_ACCOUNT_BALANCE = aPOL_RESERVE_ACCOUNT_BALANCE;
	}

	public BigDecimal getAPOL_SERVICER_EXPENSE() {
		return APOL_SERVICER_EXPENSE;
	}

	public void setAPOL_SERVICER_EXPENSE(BigDecimal aPOL_SERVICER_EXPENSE) {
		APOL_SERVICER_EXPENSE = aPOL_SERVICER_EXPENSE;
	}

	public BigDecimal getAPOL_REO_BALANCE() {
		return APOL_REO_BALANCE;
	}

	public void setAPOL_REO_BALANCE(BigDecimal aPOL_REO_BALANCE) {
		APOL_REO_BALANCE = aPOL_REO_BALANCE;
	}

	public BigDecimal getAPOL_FORECLOSURE_BALANCE() {
		return APOL_FORECLOSURE_BALANCE;
	}

	public void setAPOL_FORECLOSURE_BALANCE(BigDecimal aPOL_FORECLOSURE_BALANCE) {
		APOL_FORECLOSURE_BALANCE = aPOL_FORECLOSURE_BALANCE;
	}

	public BigDecimal getAPOL_BANKRUPTCY_BALANCE() {
		return APOL_BANKRUPTCY_BALANCE;
	}

	public void setAPOL_BANKRUPTCY_BALANCE(BigDecimal aPOL_BANKRUPTCY_BALANCE) {
		APOL_BANKRUPTCY_BALANCE = aPOL_BANKRUPTCY_BALANCE;
	}

	public BigDecimal getAPOL_AVG_CONTRACT_BALANCE() {
		return APOL_AVG_CONTRACT_BALANCE;
	}

	public void setAPOL_AVG_CONTRACT_BALANCE(BigDecimal aPOL_AVG_CONTRACT_BALANCE) {
		APOL_AVG_CONTRACT_BALANCE = aPOL_AVG_CONTRACT_BALANCE;
	}

	public BigDecimal getAPOL_CL_LTV() {
		return APOL_CL_LTV;
	}

	public void setAPOL_CL_LTV(BigDecimal aPOL_CL_LTV) {
		APOL_CL_LTV = aPOL_CL_LTV;
	}

	public BigDecimal getAPOL_CL_VANTAGE() {
		return APOL_CL_VANTAGE;
	}

	public void setAPOL_CL_VANTAGE(BigDecimal aPOL_CL_VANTAGE) {
		APOL_CL_VANTAGE = aPOL_CL_VANTAGE;
	}

	public BigDecimal getAPOL_SUBROGATION() {
		return APOL_SUBROGATION;
	}

	public void setAPOL_SUBROGATION(BigDecimal aPOL_SUBROGATION) {
		APOL_SUBROGATION = aPOL_SUBROGATION;
	}

	public BigDecimal getAPOL_PPMT_PENALTIES() {
		return APOL_PPMT_PENALTIES;
	}

	public void setAPOL_PPMT_PENALTIES(BigDecimal aPOL_PPMT_PENALTIES) {
		APOL_PPMT_PENALTIES = aPOL_PPMT_PENALTIES;
	}

	public BigDecimal getAPOL_BUYBACK() {
		return APOL_BUYBACK;
	}

	public void setAPOL_BUYBACK(BigDecimal aPOL_BUYBACK) {
		APOL_BUYBACK = aPOL_BUYBACK;
	}

	public BigDecimal getAPOL_PRINCIPAL_COLLECTIONS() {
		return APOL_PRINCIPAL_COLLECTIONS;
	}

	public void setAPOL_PRINCIPAL_COLLECTIONS(BigDecimal aPOL_PRINCIPAL_COLLECTIONS) {
		APOL_PRINCIPAL_COLLECTIONS = aPOL_PRINCIPAL_COLLECTIONS;
	}

	public ABSAbsnetPool(ABSabsnetPoolPK absnetPoolPK, BigDecimal aPOL_CURR_BALANCE, BigDecimal aPOL_CURR_WAC,
			BigDecimal aPOL_CURR_WARM, BigDecimal aPOL_PERIODIC_DEF_AMT, BigDecimal aPOL_PERIODIC_PREPAY_AMT,
			BigDecimal aPOL_PERIODIC_RECOVERIES, BigDecimal aPOL_RECOVERY_PCT, BigDecimal aPOL_TOTAL_CONTRACTS,
			BigDecimal aPOL_TOTAL_DELINQUENT_BALANCE, BigDecimal aPOL_30_DAY_DELINQUENT_BALANCE,
			BigDecimal aPOL_30_DAY_DELINQUENT_ACCTS, BigDecimal aPOL_60_DAY_DELINQUENT_BALANCE,
			BigDecimal aPOL_60_DAY_DELINQUENT_ACCTS, BigDecimal aPOL_90_DAY_DELINQUENT_BALANCE,
			BigDecimal aPOL_90_DAY_DELINQUENT_ACCTS, BigDecimal aPOL_90PLUS_DELINQUENT_BALANCE,
			BigDecimal aPOL_120_DAY_DELINQUENT_ACCTS, BigDecimal aPOL_150_DAY_DELINQUENT_ACCTS,
			BigDecimal aPOL_SMM_PPMT_ACTUAL, BigDecimal aPOL_ABS_PPMT_ACTUAL, BigDecimal aPOL_TOTAL_COLLECTIONS,
			BigDecimal aPOL_PERIOD, BigDecimal aPOL_30_DAY_DELINQUENT_PCT, BigDecimal aPOL_60_DAY_DELINQUENT_PCT,
			BigDecimal aPOL_90_DAY_DELINQUENT_PCT, BigDecimal aPOL_90PLUS_DELINQUENT_PCT,
			BigDecimal aPOL_CUMM_GROSS_LOSSES, BigDecimal aPOL_CUMM_PREPAYMENTS, String aPOL_IS_PAID_OFF,
			BigDecimal aPOL_PREFUNDING_BALANCE, BigDecimal aPOL_RESERVE_ACCOUNT_BALANCE,
			BigDecimal aPOL_SERVICER_EXPENSE, BigDecimal aPOL_REO_BALANCE, BigDecimal aPOL_FORECLOSURE_BALANCE,
			BigDecimal aPOL_BANKRUPTCY_BALANCE, BigDecimal aPOL_AVG_CONTRACT_BALANCE, BigDecimal aPOL_CL_LTV,
			BigDecimal aPOL_CL_VANTAGE, BigDecimal aPOL_SUBROGATION, BigDecimal aPOL_PPMT_PENALTIES,
			BigDecimal aPOL_BUYBACK, BigDecimal aPOL_PRINCIPAL_COLLECTIONS) {
		super();
		this.absnetPoolPK = absnetPoolPK;
		APOL_CURR_BALANCE = aPOL_CURR_BALANCE;
		APOL_CURR_WAC = aPOL_CURR_WAC;
		APOL_CURR_WARM = aPOL_CURR_WARM;
		APOL_PERIODIC_DEF_AMT = aPOL_PERIODIC_DEF_AMT;
		APOL_PERIODIC_PREPAY_AMT = aPOL_PERIODIC_PREPAY_AMT;
		APOL_PERIODIC_RECOVERIES = aPOL_PERIODIC_RECOVERIES;
		APOL_RECOVERY_PCT = aPOL_RECOVERY_PCT;
		APOL_TOTAL_CONTRACTS = aPOL_TOTAL_CONTRACTS;
		APOL_TOTAL_DELINQUENT_BALANCE = aPOL_TOTAL_DELINQUENT_BALANCE;
		APOL_30_DAY_DELINQUENT_BALANCE = aPOL_30_DAY_DELINQUENT_BALANCE;
		APOL_30_DAY_DELINQUENT_ACCTS = aPOL_30_DAY_DELINQUENT_ACCTS;
		APOL_60_DAY_DELINQUENT_BALANCE = aPOL_60_DAY_DELINQUENT_BALANCE;
		APOL_60_DAY_DELINQUENT_ACCTS = aPOL_60_DAY_DELINQUENT_ACCTS;
		APOL_90_DAY_DELINQUENT_BALANCE = aPOL_90_DAY_DELINQUENT_BALANCE;
		APOL_90_DAY_DELINQUENT_ACCTS = aPOL_90_DAY_DELINQUENT_ACCTS;
		APOL_90PLUS_DELINQUENT_BALANCE = aPOL_90PLUS_DELINQUENT_BALANCE;
		APOL_120_DAY_DELINQUENT_ACCTS = aPOL_120_DAY_DELINQUENT_ACCTS;
		APOL_150_DAY_DELINQUENT_ACCTS = aPOL_150_DAY_DELINQUENT_ACCTS;
		APOL_SMM_PPMT_ACTUAL = aPOL_SMM_PPMT_ACTUAL;
		APOL_ABS_PPMT_ACTUAL = aPOL_ABS_PPMT_ACTUAL;
		APOL_TOTAL_COLLECTIONS = aPOL_TOTAL_COLLECTIONS;
		APOL_PERIOD = aPOL_PERIOD;
		APOL_30_DAY_DELINQUENT_PCT = aPOL_30_DAY_DELINQUENT_PCT;
		APOL_60_DAY_DELINQUENT_PCT = aPOL_60_DAY_DELINQUENT_PCT;
		APOL_90_DAY_DELINQUENT_PCT = aPOL_90_DAY_DELINQUENT_PCT;
		APOL_90PLUS_DELINQUENT_PCT = aPOL_90PLUS_DELINQUENT_PCT;
		APOL_CUMM_GROSS_LOSSES = aPOL_CUMM_GROSS_LOSSES;
		APOL_CUMM_PREPAYMENTS = aPOL_CUMM_PREPAYMENTS;
		APOL_IS_PAID_OFF = aPOL_IS_PAID_OFF;
		APOL_PREFUNDING_BALANCE = aPOL_PREFUNDING_BALANCE;
		APOL_RESERVE_ACCOUNT_BALANCE = aPOL_RESERVE_ACCOUNT_BALANCE;
		APOL_SERVICER_EXPENSE = aPOL_SERVICER_EXPENSE;
		APOL_REO_BALANCE = aPOL_REO_BALANCE;
		APOL_FORECLOSURE_BALANCE = aPOL_FORECLOSURE_BALANCE;
		APOL_BANKRUPTCY_BALANCE = aPOL_BANKRUPTCY_BALANCE;
		APOL_AVG_CONTRACT_BALANCE = aPOL_AVG_CONTRACT_BALANCE;
		APOL_CL_LTV = aPOL_CL_LTV;
		APOL_CL_VANTAGE = aPOL_CL_VANTAGE;
		APOL_SUBROGATION = aPOL_SUBROGATION;
		APOL_PPMT_PENALTIES = aPOL_PPMT_PENALTIES;
		APOL_BUYBACK = aPOL_BUYBACK;
		APOL_PRINCIPAL_COLLECTIONS = aPOL_PRINCIPAL_COLLECTIONS;
	}

	public ABSAbsnetPool() {
		super();
	}

	@Override
	public String toString() {
		return "ABSAbsnetPool [absnetPoolPK=" + absnetPoolPK.getPOOL_ID() + " " + absnetPoolPK.getAPOL_RECORD_DATE() 
		        + ", APOL_CURR_BALANCE=" + APOL_CURR_BALANCE
				+ ", APOL_CURR_WAC=" + APOL_CURR_WAC + ", APOL_CURR_WARM=" + APOL_CURR_WARM + ", APOL_PERIODIC_DEF_AMT="
				+ APOL_PERIODIC_DEF_AMT + ", APOL_PERIODIC_PREPAY_AMT=" + APOL_PERIODIC_PREPAY_AMT
				+ ", APOL_PERIODIC_RECOVERIES=" + APOL_PERIODIC_RECOVERIES + ", APOL_RECOVERY_PCT=" + APOL_RECOVERY_PCT
				+ ", APOL_TOTAL_CONTRACTS=" + APOL_TOTAL_CONTRACTS + ", APOL_TOTAL_DELINQUENT_BALANCE="
				+ APOL_TOTAL_DELINQUENT_BALANCE + ", APOL_30_DAY_DELINQUENT_BALANCE=" + APOL_30_DAY_DELINQUENT_BALANCE
				+ ", APOL_30_DAY_DELINQUENT_ACCTS=" + APOL_30_DAY_DELINQUENT_ACCTS + ", APOL_60_DAY_DELINQUENT_BALANCE="
				+ APOL_60_DAY_DELINQUENT_BALANCE + ", APOL_60_DAY_DELINQUENT_ACCTS=" + APOL_60_DAY_DELINQUENT_ACCTS
				+ ", APOL_90_DAY_DELINQUENT_BALANCE=" + APOL_90_DAY_DELINQUENT_BALANCE
				+ ", APOL_90_DAY_DELINQUENT_ACCTS=" + APOL_90_DAY_DELINQUENT_ACCTS + ", APOL_90PLUS_DELINQUENT_BALANCE="
				+ APOL_90PLUS_DELINQUENT_BALANCE + ", APOL_120_DAY_DELINQUENT_ACCTS=" + APOL_120_DAY_DELINQUENT_ACCTS
				+ ", APOL_150_DAY_DELINQUENT_ACCTS=" + APOL_150_DAY_DELINQUENT_ACCTS + ", APOL_SMM_PPMT_ACTUAL="
				+ APOL_SMM_PPMT_ACTUAL + ", APOL_ABS_PPMT_ACTUAL=" + APOL_ABS_PPMT_ACTUAL + ", APOL_TOTAL_COLLECTIONS="
				+ APOL_TOTAL_COLLECTIONS + ", APOL_PERIOD=" + APOL_PERIOD + ", APOL_30_DAY_DELINQUENT_PCT="
				+ APOL_30_DAY_DELINQUENT_PCT + ", APOL_60_DAY_DELINQUENT_PCT=" + APOL_60_DAY_DELINQUENT_PCT
				+ ", APOL_90_DAY_DELINQUENT_PCT=" + APOL_90_DAY_DELINQUENT_PCT + ", APOL_90PLUS_DELINQUENT_PCT="
				+ APOL_90PLUS_DELINQUENT_PCT + ", APOL_CUMM_GROSS_LOSSES=" + APOL_CUMM_GROSS_LOSSES
				+ ", APOL_CUMM_PREPAYMENTS=" + APOL_CUMM_PREPAYMENTS + ", APOL_IS_PAID_OFF=" + APOL_IS_PAID_OFF
				+ ", APOL_PREFUNDING_BALANCE=" + APOL_PREFUNDING_BALANCE + ", APOL_RESERVE_ACCOUNT_BALANCE="
				+ APOL_RESERVE_ACCOUNT_BALANCE + ", APOL_SERVICER_EXPENSE=" + APOL_SERVICER_EXPENSE
				+ ", APOL_REO_BALANCE=" + APOL_REO_BALANCE + ", APOL_FORECLOSURE_BALANCE=" + APOL_FORECLOSURE_BALANCE
				+ ", APOL_BANKRUPTCY_BALANCE=" + APOL_BANKRUPTCY_BALANCE + ", APOL_AVG_CONTRACT_BALANCE="
				+ APOL_AVG_CONTRACT_BALANCE + ", APOL_CL_LTV=" + APOL_CL_LTV + ", APOL_CL_VANTAGE=" + APOL_CL_VANTAGE
				+ ", APOL_SUBROGATION=" + APOL_SUBROGATION + ", APOL_PPMT_PENALTIES=" + APOL_PPMT_PENALTIES
				+ ", APOL_BUYBACK=" + APOL_BUYBACK + ", APOL_PRINCIPAL_COLLECTIONS=" + APOL_PRINCIPAL_COLLECTIONS + "]";
	}
	
	
}
