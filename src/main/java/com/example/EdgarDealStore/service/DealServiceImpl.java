package com.example.EdgarDealStore.service;

import java.io.File;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.EdgarDealStore.dao.ABSAbsnetDealStatusDao;
import com.example.EdgarDealStore.dao.ABSAbsnetPoolDao;
import com.example.EdgarDealStore.dao.ABSAbsnetSubTrancheDao;
import com.example.EdgarDealStore.dao.ABSCikDealDao;
import com.example.EdgarDealStore.dao.ABSDealCsServiceProviderDao;
import com.example.EdgarDealStore.dao.ABSDealDao;
import com.example.EdgarDealStore.dao.ABSDelinquencyDao;
import com.example.EdgarDealStore.dao.ABSIssuingVehicleDao;
import com.example.EdgarDealStore.dao.ABSLeadUnderwriterDao;
import com.example.EdgarDealStore.dao.ABSMarkovMatrixDao;
import com.example.EdgarDealStore.dao.ABSPoolDao;
import com.example.EdgarDealStore.dao.ABSSubTrancheDao;
import com.example.EdgarDealStore.dao.ABSTrancheDao;
import com.example.EdgarDealStore.dao.ABSTrusteeDao;
import com.example.EdgarDealStore.dao.CSBasisRateDao;
import com.example.EdgarDealStore.dao.CSInterestTypeDao;
import com.example.EdgarDealStore.dao.CSServiceProviderDao;
import com.example.EdgarDealStore.dao.CSServiceProviderNamesDao;
import com.example.EdgarDealStore.dao.FileRepository;
import com.example.EdgarDealStore.dao.FolderRepository;
import com.example.EdgarDealStore.entity.ABSAbsnetDealStatus;
import com.example.EdgarDealStore.entity.ABSAbsnetPool;
import com.example.EdgarDealStore.entity.ABSAbsnetSubTranche;
import com.example.EdgarDealStore.entity.ABSAbsnetSubTranchePK;
import com.example.EdgarDealStore.entity.ABSCikDeal;
import com.example.EdgarDealStore.entity.ABSDeal;
import com.example.EdgarDealStore.entity.ABSDealCsServiceProvider;
import com.example.EdgarDealStore.entity.ABSDealCsServiceProviderPK;
import com.example.EdgarDealStore.entity.ABSDelinquency;
import com.example.EdgarDealStore.entity.ABSDelinquencyPK;
import com.example.EdgarDealStore.entity.ABSIssuingVehicle;
import com.example.EdgarDealStore.entity.ABSLeadUnderwriter;
import com.example.EdgarDealStore.entity.ABSMarkovMatrix;
import com.example.EdgarDealStore.entity.ABSMarkovMatrixPK;
import com.example.EdgarDealStore.entity.ABSPool;
import com.example.EdgarDealStore.entity.ABSSubTranche;
import com.example.EdgarDealStore.entity.ABSSubTranche.ABSSubTrancheSortById;
import com.example.EdgarDealStore.entity.ABSTrustee;
import com.example.EdgarDealStore.entity.ABSabsnetPoolPK;
import com.example.EdgarDealStore.entity.CSBasisRate;
import com.example.EdgarDealStore.entity.ABSTranche;
import com.example.EdgarDealStore.entity.CSInterestType;
import com.example.EdgarDealStore.entity.CSServiceProvider;
import com.example.EdgarDealStore.entity.CSServiceProviderNames;
import com.example.EdgarDealStore.entity.FileLocation;
import com.example.EdgarDealStore.entity.FolderLocation;
import com.example.EdgarDealStore.exception.DataException;
import com.example.EdgarDealStore.exception.FileException;

@Service
public class DealServiceImpl implements DealService{
	protected Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private FileRepository fileRepo;
	@Autowired
	private FolderRepository folderRepo;
	@Autowired
	private ABSDealDao absDealDao;
	private ABSLeadUnderwriterDao absLeadUnderwriterDao;
	private ABSIssuingVehicleDao absIssuingVehicleDao;
	private ABSTrusteeDao absTrusteeDao;
	private CSInterestTypeDao csInterestTypeDao;
	private ABSPoolDao absPoolDao;
	private ABSAbsnetPoolDao absabsnetPoolDao;
	private ABSTrancheDao absTrancheDao;
	private ABSSubTrancheDao absSubTrancheDao;
	private CSBasisRateDao csBasisRateDao;
	private ABSAbsnetSubTrancheDao absAbsnetSubTrancheDao;
	private ABSAbsnetDealStatusDao absAbsnetDealStatusDao;
	private ABSDelinquencyDao absDelinquencyDao;
	private ABSMarkovMatrixDao absMarkovMatrixDao;
	private ABSCikDealDao absCikDealDao;
	private ABSDealCsServiceProviderDao absDealCsServiceProvider;
	private CSServiceProviderDao csServiceProviderDao;
	private CSServiceProviderNamesDao csServiceProviderNamesDao;
	
	@Value("0")
	private Double dealId;
	
	@Value("0")
	private Double poolId;
	
	@Autowired
	public DealServiceImpl(FileRepository fileRepo, FolderRepository folderRepo, ABSDealDao absDealDao,
			ABSLeadUnderwriterDao absLeadUnderwriterDao, ABSIssuingVehicleDao absIssuingVehicleDao,
			ABSTrusteeDao absTrusteeDao, CSInterestTypeDao csInterestTypeDao, ABSPoolDao absPoolDao,
			ABSAbsnetPoolDao absabsnetPoolDao, ABSTrancheDao absTrancheDao, ABSSubTrancheDao absSubTrancheDao,
			CSBasisRateDao csBasisRateDao, ABSAbsnetSubTrancheDao absAbsnetSubTrancheDao,
			ABSAbsnetDealStatusDao absAbsnetDealStatusDao, ABSDelinquencyDao absDelinquencyDao,
			ABSMarkovMatrixDao absMarkovMatrixDao, ABSCikDealDao absCikDealDao,
			ABSDealCsServiceProviderDao absDealCsServiceProvider, CSServiceProviderDao csServiceProviderDao,
			CSServiceProviderNamesDao csServiceProviderNamesDao) {
		this.fileRepo = fileRepo;
		this.folderRepo = folderRepo;
		this.absDealDao = absDealDao;
		this.absLeadUnderwriterDao = absLeadUnderwriterDao;
		this.absIssuingVehicleDao = absIssuingVehicleDao;
		this.absTrusteeDao = absTrusteeDao;
		this.csInterestTypeDao = csInterestTypeDao;
		this.absPoolDao = absPoolDao;
		this.absabsnetPoolDao = absabsnetPoolDao;
		this.absTrancheDao = absTrancheDao;
		this.absSubTrancheDao = absSubTrancheDao;
		this.csBasisRateDao = csBasisRateDao;
		this.absAbsnetSubTrancheDao = absAbsnetSubTrancheDao;
		this.absAbsnetDealStatusDao = absAbsnetDealStatusDao;
		this.absDelinquencyDao = absDelinquencyDao;
		this.absMarkovMatrixDao = absMarkovMatrixDao;
		this.absCikDealDao = absCikDealDao;
		this.csServiceProviderNamesDao = csServiceProviderNamesDao;
		this.csServiceProviderDao = csServiceProviderDao;
		this.absDealCsServiceProvider = absDealCsServiceProvider;
	}

	@Override
	public double saveFile(FileLocation fileLocation) throws Exception {
		logger.info(fileLocation.getFilePath());
		Map<?, ?> rawFileDataMap = fileRepo.readData(fileLocation);
		String dealIdStr = fileLocation.getDealId();
		if (dealIdStr != "" && dealIdStr != null) {
			// user entered the deal id
			// check if deal id is valid
			double dealId = -1;
			try {
				dealId = Double.valueOf(dealIdStr);
			} catch (Exception e) {
				throw new FileException("Deal Id is not a number");
			}
			if (dealId > 0 && (dealId == Math.floor(dealId)) && !Double.isInfinite(dealId)) {
				// save a non-deal level file
				if (validateRawFileAsNonDeal(rawFileDataMap)) {
					logger.info("Trying to insert non-deal file");
					saveNonDealFile(dealId, rawFileDataMap);
				} else {
					throw new FileException("Non-deal File format is incorrect");
				}
			} else {
				throw new FileException("Deal Id is not valid. It must be greater than 0 and is an integer");
			}
		} else {
			// check if file is correctly formatted as a deal file
			if (validateFileMapAsDeal(rawFileDataMap)) {
				logger.info("Trying to insert deal file");
				// save to ABS_POOL
				validateDealIdFileExists(fileLocation);
				saveABSDeal(rawFileDataMap); // exception handling
				saveABSPool(rawFileDataMap);
				saveABSTranche(rawFileDataMap);
				saveABSCikDeal(rawFileDataMap);
				createDealIdFile(fileLocation, dealId);
			} else {
				throw new FileException("Deal file format is incorrect");
			}
		}
		return dealId.doubleValue();
	}
	
	private void saveNonDealFile(Double dealId, Map<?, ?> dataMap) throws Exception {
		// 1. get pool Id based on dealId
		BigDecimal poolId;
		List<ABSPool> poolRowList = absPoolDao.findByDealId(new BigDecimal(dealId)); // handle exception here?
		if (poolRowList.size() > 0) {
			poolId = poolRowList.get(0).getPOOL_ID();
		} else {
			throw new DataException("Cannot find a deal with this dealId");
		}
		// 2.populate ABS_ABSNET_POOL row
		ABSAbsnetPool absnetPool = new ABSAbsnetPool();
		String collectionEndDateStr = dataMap.get("Collection Period End date").toString();
		String formattedDate = "" + collectionEndDateStr.substring(6) + "-"
				+ collectionEndDateStr.substring(0,2) + "-" + collectionEndDateStr.substring(3,5) + " 00:00:00";
		// add one month delay to make the graph looks correct
		ABSabsnetPoolPK absnetPoolPK = new ABSabsnetPoolPK(poolId, new Timestamp(Timestamp.valueOf(formattedDate).getTime() + (long) (1000 * 60 * 60 * 24 * 15)));
		absnetPool.setAbsnetPoolPK(absnetPoolPK);
		absnetPool.setAPOL_PERIOD(stringToBigDecimal(dataMap.get("Performance Period").toString()));
		logger.info("absnet pool period: " + absnetPool.getAPOL_PERIOD().toString());
		// TODO: consider modify the extracted data file to "Ending Pool Balance"
		absnetPool.setAPOL_CURR_BALANCE(stringToBigDecimal(dataMap.get("Ending Pool balance").toString()));
		absnetPool.setAPOL_CURR_WAC(stringToBigDecimal(dataMap.get("Weighted Average Coupon").toString())
				.divide(new BigDecimal(100), 4, RoundingMode.HALF_DOWN));
		absnetPool.setAPOL_CURR_WARM(stringToBigDecimal(dataMap.get("Weighted Average Remaining Maturity").toString()));
		absnetPool.setAPOL_PERIODIC_DEF_AMT(stringToBigDecimal(dataMap.get("Defaulted Receivables").toString()));
		absnetPool.setAPOL_PERIODIC_PREPAY_AMT(stringToBigDecimal(dataMap.get("Prepayment").toString()));
		absnetPool.setAPOL_PERIODIC_RECOVERIES(stringToBigDecimal(dataMap.get("Recoveries").toString()));
		// percentage has scale 2, rounding mode half-down
		System.out.println("ending pool: " + stringToBigDecimal(dataMap.get("Ending Pool balance").toString()).toString());
		if (stringToBigDecimal(dataMap.get("Ending Pool balance").toString()).compareTo(BigDecimal.ZERO) == 0) {
			absnetPool.setAPOL_RECOVERY_PCT(new BigDecimal("0"));
		} else {
			absnetPool.setAPOL_RECOVERY_PCT(stringToBigDecimal(dataMap.get("Recoveries").toString())
					.divide(stringToBigDecimal(dataMap.get("Ending Pool balance").toString()), 4, RoundingMode.HALF_DOWN));
		}
		absnetPool.setAPOL_TOTAL_CONTRACTS(stringToBigDecimal(dataMap.get("Remaining No. of Loans").toString()));
		absnetPool.setAPOL_TOTAL_DELINQUENT_BALANCE(stringToBigDecimal(dataMap.get("30 Day Delinquencies").toString())
				.add(stringToBigDecimal(dataMap.get("60 Day Delinquencies").toString())
						.add(stringToBigDecimal(dataMap.get("90 Day Delinquencies").toString())
								.add(stringToBigDecimal(dataMap.get("90+ Day Delinquencies").toString())))));
		absnetPool.setAPOL_30_DAY_DELINQUENT_BALANCE(stringToBigDecimal(dataMap.get("30 Day Delinquencies").toString()));
		absnetPool.setAPOL_60_DAY_DELINQUENT_BALANCE(stringToBigDecimal(dataMap.get("60 Day Delinquencies").toString()));
		absnetPool.setAPOL_90_DAY_DELINQUENT_BALANCE(stringToBigDecimal(dataMap.get("90 Day Delinquencies").toString()));
		absnetPool.setAPOL_90PLUS_DELINQUENT_BALANCE(stringToBigDecimal(dataMap.get("90+ Day Delinquencies").toString()));
		absnetPool.setAPOL_30_DAY_DELINQUENT_ACCTS(new BigDecimal("0"));
		absnetPool.setAPOL_60_DAY_DELINQUENT_ACCTS(new BigDecimal("0"));
		absnetPool.setAPOL_90_DAY_DELINQUENT_ACCTS(new BigDecimal("0"));
		absnetPool.setAPOL_120_DAY_DELINQUENT_ACCTS(new BigDecimal("0"));
		absnetPool.setAPOL_150_DAY_DELINQUENT_ACCTS(new BigDecimal("0"));
		logger.info("30 day delin balance: " + absnetPool.getAPOL_30_DAY_DELINQUENT_BALANCE().toString());
		logger.info("curr balance: " + absnetPool.getAPOL_CURR_BALANCE().toString());
		if (absnetPool.getAPOL_CURR_BALANCE().compareTo(BigDecimal.ZERO) == 0) {
			absnetPool.setAPOL_30_DAY_DELINQUENT_PCT(new BigDecimal("0"));
			absnetPool.setAPOL_60_DAY_DELINQUENT_PCT(new BigDecimal("0"));
			absnetPool.setAPOL_90_DAY_DELINQUENT_PCT(new BigDecimal("0"));
			absnetPool.setAPOL_90PLUS_DELINQUENT_PCT(new BigDecimal("0"));
		} else {
			absnetPool.setAPOL_30_DAY_DELINQUENT_PCT(
					absnetPool.getAPOL_30_DAY_DELINQUENT_BALANCE().divide(absnetPool.getAPOL_CURR_BALANCE(), 4, RoundingMode.HALF_DOWN));
			absnetPool.setAPOL_60_DAY_DELINQUENT_PCT(
					absnetPool.getAPOL_60_DAY_DELINQUENT_BALANCE().divide(absnetPool.getAPOL_CURR_BALANCE(), 4, RoundingMode.HALF_DOWN));
			absnetPool.setAPOL_90_DAY_DELINQUENT_PCT(
					absnetPool.getAPOL_90_DAY_DELINQUENT_BALANCE().divide(absnetPool.getAPOL_CURR_BALANCE(), 4, RoundingMode.HALF_DOWN));
			absnetPool.setAPOL_90PLUS_DELINQUENT_PCT(
					absnetPool.getAPOL_90PLUS_DELINQUENT_BALANCE().divide(absnetPool.getAPOL_CURR_BALANCE(), 4, RoundingMode.HALF_DOWN));
		}
		
		BigDecimal cprCol = BigDecimal.valueOf(Double.valueOf("1") - Math.pow(Double.valueOf("1") - Double.valueOf(dataMap.get("CPR").toString()), Double.valueOf("1")/Double.valueOf("12")));
		absnetPool.setAPOL_SMM_PPMT_ACTUAL(cprCol.round(new MathContext(8, RoundingMode.HALF_DOWN)));
		logger.info("cpr: " + cprCol.toString());

		if (absnetPool.getAPOL_PERIOD().compareTo(new BigDecimal("1")) == 0) {
			absnetPool.setAPOL_CUMM_GROSS_LOSSES(stringToBigDecimal(dataMap.get("Defaulted Receivables").toString()));
			absnetPool.setAPOL_CUMM_PREPAYMENTS(stringToBigDecimal(dataMap.get("Prepayment").toString()));
		} else {
			List<ABSAbsnetPool> lastAbsnetPoolList = absabsnetPoolDao.findByPoolIdAndPeriod(
					absnetPool.getAbsnetPoolPK().getPOOL_ID(), absnetPool.getAPOL_PERIOD().subtract(new BigDecimal("1"))); // handle exception here?
			absnetPool.setAPOL_CUMM_GROSS_LOSSES(
					lastAbsnetPoolList.get(0).getAPOL_CUMM_GROSS_LOSSES()
					.add(stringToBigDecimal(dataMap.get("Defaulted Receivables").toString())));
			absnetPool.setAPOL_CUMM_PREPAYMENTS(lastAbsnetPoolList.get(0).getAPOL_CUMM_PREPAYMENTS()
					.add(stringToBigDecimal(dataMap.get("Prepayment").toString())));
		}
		absnetPool.setAPOL_IS_PAID_OFF("N");
		absnetPool.setAPOL_RESERVE_ACCOUNT_BALANCE(stringToBigDecimal(dataMap.get("Ending Reserve Account Balance").toString()));
		absnetPool.setAPOL_REO_BALANCE(new BigDecimal("0")); // blank in the raw data
		absnetPool.setAPOL_FORECLOSURE_BALANCE(new BigDecimal("0")); // blank in the raw data
		absnetPool.setAPOL_PRINCIPAL_COLLECTIONS(stringToBigDecimal(dataMap.get("Scheduled Principal Collections").toString()));
		if (stringToBigDecimal(dataMap.get("Remaining No. of Loans").toString()).compareTo(BigDecimal.ZERO) == 0) {
			absnetPool.setAPOL_AVG_CONTRACT_BALANCE(new BigDecimal(0));
		} else {
			absnetPool.setAPOL_AVG_CONTRACT_BALANCE(stringToBigDecimal(dataMap.get("Ending Pool balance").toString())
				.divide(stringToBigDecimal(dataMap.get("Remaining No. of Loans").toString()), 2, RoundingMode.HALF_DOWN));
		}
		absnetPool.setAPOL_TOTAL_COLLECTIONS(absnetPool.getAPOL_PRINCIPAL_COLLECTIONS()
				.add(absnetPool.getAPOL_PERIODIC_PREPAY_AMT()
						.add(stringToBigDecimal(dataMap.get("Interest Collections").toString()))));
		absnetPool.setAPOL_BANKRUPTCY_BALANCE(new BigDecimal("0")); // blank in the raw data
		// 3. insert into abs_absnet_pool table
		absabsnetPoolDao.save(absnetPool);
		logger.info("Inserting absabsnetPoolDao: " + absnetPool.toString());
		
		// absabsnetSubTranche
		// use dealId, poolId to find all absTrancheId, then find all subTrancheId
		List<ABSTranche> allTranches = absTrancheDao.findAllTranche(new BigDecimal(dealId), poolId);
		List<ABSSubTranche> allSubTranches = new ArrayList<>();
		for (ABSTranche tranche: allTranches) {
			List<ABSSubTranche> subTrancheList = absSubTrancheDao.findSubTrancheByTrancheId(tranche.getTRNC_ID());
			allSubTranches.addAll(subTrancheList);
		}
		Collections.sort(allSubTranches, allSubTranches.get(0).new ABSSubTrancheSortById());
		// get the original spread/coupon in each subTranche
		List<BigDecimal> origSpreadCouponList = new ArrayList<>();
		for (int i = 0; i < allSubTranches.size(); i++) {
			origSpreadCouponList.add(allSubTranches.get(i).getSTRN_RATE());
		}
		
		// sorted list has the same sequence as className/subTranches in the raw file
		Map<String, String> trancheCurrPplBalMap = (Map<String, String>) dataMap.get("Current Principal Balance");
		Map<String, String> tranchePastDueIntsMap = (Map<String, String>) dataMap.get("Past Due Interest");
		Map<String, String> tranchePaidOffMap = (Map<String, String>) dataMap.get("Paid off Flag");


		List<List<String>> currBlcSubTrancheList = new ArrayList<>();
		for (String key: trancheCurrPplBalMap.keySet()) {
			currBlcSubTrancheList.add(new ArrayList<>(Arrays.asList(key, trancheCurrPplBalMap.get(key))));
		}
		List<List<String>> pastDueList = new ArrayList<>();
		for (String key: tranchePastDueIntsMap.keySet()) {
			pastDueList.add(new ArrayList<>(Arrays.asList(key, tranchePastDueIntsMap.get(key))));
		}
		List<List<String>> paidOffList = new ArrayList<>();
		for (String key: tranchePaidOffMap.keySet()) {
			paidOffList.add(new ArrayList<>(Arrays.asList(key, tranchePaidOffMap.get(key))));
		}
		
		currBlcSubTrancheList = currBlcSubTrancheList.stream().sorted((list1, list2) -> {
			return list1.get(0).compareTo(list2.get(0));
		}).collect(Collectors.toList());
		pastDueList = pastDueList.stream().sorted((list1, list2) -> {
			return list1.get(0).compareTo(list2.get(0));
		}).collect(Collectors.toList());
		paidOffList = paidOffList.stream().sorted((list1, list2) -> {
			return list1.get(0).compareTo(list2.get(0));
		}).collect(Collectors.toList());
		
		
		// now the sequence is the same
		if (currBlcSubTrancheList.size() != allSubTranches.size() && pastDueList.size() != allSubTranches.size()) 
			throw new DataException("Tranche size is different");
		
		for (int i = 0; i < allSubTranches.size(); i++) {
			ABSAbsnetSubTranche absAbsnetSubTranche = new ABSAbsnetSubTranche();
			ABSAbsnetSubTranchePK absAbsnetSubTranchePK = new ABSAbsnetSubTranchePK();
			absAbsnetSubTranchePK.setSTRN_ID(allSubTranches.get(i).getSTRN_ID());
			//absAbsnetSubTranche.setSTRN_ID(allSubTranches.get(i).getSTRN_ID());
			String collectEndDate = dataMap.get("Collection Period End date").toString();
			logger.info("collectEndDate: " + collectEndDate);
			String formattedEndDate = "" + collectEndDate.substring(6) + "-"
					+ collectEndDate.substring(0,2) + "-" + collectEndDate.substring(3,5) + " 00:00:00";
			logger.info("formatted Closing Date is " + formattedEndDate);
			absAbsnetSubTranchePK.setASTR_RECORD_DATE(new Timestamp(Timestamp.valueOf(formattedEndDate).getTime() + (long) (1000 * 60 * 60 * 24 * 15)));
			absAbsnetSubTranche.setAbsAbsnetSubTranchePK(absAbsnetSubTranchePK);
			
			absAbsnetSubTranche.setASTR_CURR_BALANCE(stringToBigDecimal(currBlcSubTrancheList.get(i).get(1)));
			absAbsnetSubTranche.setASTR_DEFFERRED_INTEREST(stringToBigDecimal(pastDueList.get(i).get(1)));
			absAbsnetSubTranche.setASTR_DEFFERRED_INTEREST_PAID(absAbsnetSubTranche.getASTR_DEFFERRED_INTEREST());
			absAbsnetSubTranche.setASTR_PERIOD(stringToBigDecimal(dataMap.get("Performance Period").toString()));
			absAbsnetSubTranche.setASTR_COUPON_RATE(origSpreadCouponList.get(i));
			absAbsnetSubTranche.setASTR_IS_PAID_OFF(paidOffList.get(i).get(1).substring(0,1));
			// ASTR_PRINCIPAL_PAID = CURRENT
			if (absAbsnetSubTranche.getASTR_PERIOD().compareTo(new BigDecimal("1")) == 0) {
				// first non-deal, find the original principal balance in the ABS_SUB_TRANCHE
				logger.info("First non-deal file in the subtranche");
				BigDecimal prevBalance = allSubTranches.get(i).getSTRN_ORIG_BALANCE();
				absAbsnetSubTranche.setASTR_PRINCIPAL_PAID(prevBalance.subtract(absAbsnetSubTranche.getASTR_CURR_BALANCE()));
			} else {
				// find prev balance from period -1
				logger.info("find prev absabsnetsubtranche by id and period: " + absAbsnetSubTranchePK.getSTRN_ID() + " " + absAbsnetSubTranche.getASTR_PERIOD().subtract(new BigDecimal("1")));
				List<ABSAbsnetSubTranche> prevMonthSubTrancheList = absAbsnetSubTrancheDao
						.findPrevMonthSubTranche(absAbsnetSubTranchePK.getSTRN_ID(), absAbsnetSubTranche.getASTR_PERIOD().subtract(new BigDecimal("1")));
				BigDecimal prevMonthPrincipalBlc = prevMonthSubTrancheList.get(0).getASTR_CURR_BALANCE();
				absAbsnetSubTranche.setASTR_PRINCIPAL_PAID(prevMonthPrincipalBlc.subtract(absAbsnetSubTranche.getASTR_CURR_BALANCE()));
			}
			logger.info("ABSABSNETSUBTRANCHE: " + absAbsnetSubTranche.toString());
			absAbsnetSubTrancheDao.save(absAbsnetSubTranche);
		}
		
		saveABSAbsnetDealStatus(new BigDecimal(dealId), dataMap);
	}
	
	public void saveABSAbsnetDealStatus(BigDecimal dealId, Map<?, ?> dataMap) throws Exception {
		ABSAbsnetDealStatus absAbsnetDealStatus = new ABSAbsnetDealStatus();
		absAbsnetDealStatus.setDEAL_ID(dealId);
		absAbsnetDealStatus.setAADS_LAST_POOL_PERIOD(stringToBigDecimal(dataMap.get("Performance Period").toString()));
		absAbsnetDealStatus.setAASC_CODE("WB");
		String collectionEndDateStr = dataMap.get("Collection Period End date").toString();
		String formattedDate = "" + collectionEndDateStr.substring(6) + "-"
				+ collectionEndDateStr.substring(0,2) + "-" + collectionEndDateStr.substring(3,5) + " 00:00:00";
		absAbsnetDealStatus.setAADS_LAST_RECORD_DATE(Timestamp.valueOf(formattedDate));
		absAbsnetDealStatus.setAADS_LAST_RUN_DATE(Timestamp.valueOf(dataMap.get("Update Date").toString()));
		absAbsnetDealStatusDao.save(absAbsnetDealStatus); // save can also do update
	}
	
	public void saveABSCikDeal(Map<?, ?> rawFileDataMap) throws Exception {
		ABSCikDeal cikDeal = new ABSCikDeal();
		cikDeal.setCIK(rawFileDataMap.get("CIK").toString());
		cikDeal.setDEAL_ID(new BigDecimal(dealId));
		absCikDealDao.save(cikDeal);
	}
		
		
	@Override
	public String getRowWithMaxID() {
		return absDealDao.printMaxIdRow();
	}
	
	public void validateDealIdFileExists(FileLocation fileLocation) throws Exception {
		File file = new File(fileLocation.getFilePath());
		File parentFolder = file.getParentFile();
		File dealFile = new File(parentFolder.getAbsolutePath() + "\\dealId.txt");
		if (dealFile.exists()) {
			throw new DataException("This deal has been saved already. Please delete the duplicated deal in database.");
		}
	}

	public void createDealIdFile(FileLocation fileLocation, double dealId) throws Exception {
		File file = new File(fileLocation.getFilePath());
		File parentFolder = file.getParentFile();
		File dealFile = new File(parentFolder.getAbsolutePath() + "\\dealId.txt");
		if (dealFile.createNewFile()) {
			FileWriter wrt = new FileWriter(dealFile.getAbsolutePath());
			wrt.write(String.valueOf(dealId));
			wrt.close();
		} else {
			throw new DataException("This deal has been saved already. Please delete the duplicated deal in database.");
		}
	}

	
	private void saveABSDeal(Map<?, ?> rawFileDataMap) throws Exception {
		ABSDeal deal = new ABSDeal();
		BigDecimal newDealId = absDealDao.findMaxId().add(new BigDecimal("1"));
		dealId = newDealId.doubleValue(); // store to class variable
		logger.info("new deal id to be saved: " + newDealId);
		deal.setDEAL_ID(newDealId);
		deal.setDEAL_ABSNET_DEAL_ID(newDealId.add(new BigDecimal(12345678))); // make it unique by adding the lagest number in db
		deal.setACLS_CODE("AUTO");
		deal.setBASI_CODE("1MLI");
		deal.setEXCH_CODE("NYSE");
		deal.setMRKT_CODE("M1");
		deal.setDEAL_NAME(rawFileDataMap.get("SPV").toString());
		deal.setDEAL_SHORTNAME(rawFileDataMap.get("SPV").toString().substring(rawFileDataMap.get("SPV").toString().length()-6)); // how to shorten deal name?
		// current closing date format is mm/dd/yyyy
		// TODO: improve raw data format
		// Timestamp wants yyyy-mm-dd hh:mm:ss[.f...]
		String closingDate = rawFileDataMap.get("Closing Date").toString();
		logger.info(closingDate);
		String formattedClosingDate = "" + closingDate.substring(6) + "-"
				+ closingDate.substring(0,2) + "-" + closingDate.substring(3,5) + " 00:00:00";
		logger.info("formatted Closing Date is " + formattedClosingDate);
		deal.setDEAL_CLOSING_DATE(Timestamp.valueOf(formattedClosingDate));
		// legal final maturity date has format EG
		// January 15, 2027
		String maturityDate = rawFileDataMap.get("Legal Final Maturity Date").toString();
		logger.info("maturity Date is " + maturityDate);
		String maturityMonth = maturityDate.substring(0, maturityDate.indexOf(" "));
		// TODO
		//Date date = new SimpleDateFormat("MM")
		String maturityDay = maturityDate.substring(maturityDate.indexOf(" ") + 1, maturityDate.indexOf(","));
		String maturityYear = maturityDate.substring(maturityDate.indexOf(",") + 2);
		String formattedMaturityDate = maturityYear + "-" + maturityMonth + "-" + maturityDay + " 00:00:00";
		logger.info("formatted maturity Date is " + formattedMaturityDate);
		deal.setDEAL_MAT_DATE(Timestamp.valueOf("2027-1-15 00:00:00"));
		
		// Get id from underwriter table base on description
		// If no description found, insert new row and use new row id as underwriter id
		BigDecimal underwriterId;
		List<ABSLeadUnderwriter> exactList = absLeadUnderwriterDao.findUnderwriterIdByExactDesc(
				rawFileDataMap.get("Underwriter").toString());
		if (exactList.size() != 0) {
			underwriterId= exactList.get(0).getUNWR_ID();
		} else {
			List<ABSLeadUnderwriter> vagueList = absLeadUnderwriterDao.findUnderwriterIdByVagueDesc(
					rawFileDataMap.get("Underwriter").toString());
			if (vagueList.size() != 0) {
				underwriterId = vagueList.get(0).getUNWR_ID();
			} else {
				List<ABSLeadUnderwriter> maxIdList = absLeadUnderwriterDao.findMaxId();
				underwriterId = maxIdList.get(0).getUNWR_ID().add(new BigDecimal("1"));
				absLeadUnderwriterDao.insertDesc(underwriterId, rawFileDataMap.get("Underwriter").toString());
			}
		}
		logger.info("underwriter id is " + underwriterId);
		deal.setUNWR_ID(underwriterId);
		
		deal.setUSE_WATERFALLEDITOR("Y");
		deal.setNB_POOL(new BigDecimal("1"));
		deal.setCOUNTRY_CODE(rawFileDataMap.get("Currency Code").toString().substring(0,2));
		
		// find ISSUING_VEHICLE id
		// current assumption is that series number will be at the end. 
		// eg. xxxxxxxx 2017-3
		String rawVehicleDesc = rawFileDataMap.get("SPV").toString();
		String vehicleDesc = rawVehicleDesc.substring(0, rawVehicleDesc.lastIndexOf(" "));
		List<ABSIssuingVehicle> vehicleResults = absIssuingVehicleDao.findIssuingVehicleByDesc(vehicleDesc);
		BigDecimal vehicleId;
		if (vehicleResults.size() != 0) {
			vehicleId = vehicleResults.get(0).getISSV_ID();
		} else {
			List<ABSIssuingVehicle> maxIdList = absIssuingVehicleDao.findMaxId();
			vehicleId = maxIdList.get(0).getISSV_ID().add(new BigDecimal("1"));
			ABSIssuingVehicle newVehicle = new ABSIssuingVehicle(vehicleId, vehicleDesc);
			absIssuingVehicleDao.save(newVehicle);
		}
		logger.info("vehicle id is " + vehicleId);
		deal.setISSV_ID(vehicleId);
		
		// find trustee id
		String rawTrustee = rawFileDataMap.get("Trustee").toString();
		BigDecimal trusteeId;
		List<ABSTrustee> trusteeResult = absTrusteeDao.findTrusteeByDesc(rawTrustee);
		if (trusteeResult.size() != 0) {
			trusteeId = trusteeResult.get(0).getTRST_ID();
		} else {
			List<ABSTrustee> maxIdList = absTrusteeDao.findMaxId();
			trusteeId = maxIdList.get(0).getTRST_ID().add(new BigDecimal("1"));
			ABSTrustee newTrustee = new ABSTrustee(trusteeId, rawTrustee);
			absTrusteeDao.save(newTrustee);
		}
		logger.info("trustee id is " + trusteeId);
		deal.setTRST_ID(trusteeId);
		
		// Below columns are not in the extracted data
		// They are set after discussion with Carrie Liu
		deal.setDEAL_IS_SPDACT("N");
		deal.setDEAL_AVG_EARNING_DAYS(new BigDecimal("0"));
		deal.setDEAL_IS_YLD_SUP_ACT("N");
		deal.setAMFF_ID(new BigDecimal("1"));
		deal.setISSU_ID(new BigDecimal("43"));
		deal.setTAXC_ID(new BigDecimal("6"));
		deal.setDEAL_IS_WRAPPED("N");
		//deal.setDEAL_ABSNET_DEAL_ID(deal.getDEAL_ID());
		deal.setSTTS_CODE("DRFT");
		deal.setREVIEW_PRSN_ID_USER(new BigDecimal("1"));
		deal.setTARGET_MRAT_LETTER_GRADE("Aaa");
		
		deal.setCRE_USER_ID(new BigDecimal(130));
		logger.debug(new Date(System.currentTimeMillis()).toString() + "00:00:00");
		deal.setCRE_DATE(Timestamp.valueOf(new Date(System.currentTimeMillis()).toString() + " 00:00:00"));
		deal.setMOD_USER_ID(new BigDecimal(130));
		deal.setMOD_DATE(Timestamp.valueOf(new Date(System.currentTimeMillis()).toString() + " 00:00:00"));
		
		deal.setDEAL_INCLUDE_COLL_ACCT_EARNING("N");
		deal.setALLO_CODE("S");
		deal.setYSAC_ID(new BigDecimal(0));
		deal.setMP_POOL_CONFIGURATION(new BigDecimal(1));
		deal.setMETRICS_COMPUTATION("N");
		deal.setSMOOTH_FMV("Y");
		deal.setBOTE_REMAINING_AVG_LIFE(new BigDecimal(0));
		deal.setBOTE_EXPECTED_LOSS(new BigDecimal(0));
		deal.setBOTE_ALPHA(new BigDecimal(0));
		deal.setBOTE_EXP_RECOVERY_PERCENTAGE(new BigDecimal(0));
		deal.setORIGINATORS_NB(new BigDecimal(1));
		deal.setAVM_MODULATION("N");
		deal.setVANTAGE_MODULATION("N");
		deal.setSIMPLE_WATERFALL("N");
		deal.setREC_TO_INT_COLL("Y");
		deal.setDEAL_DATA_QUALITY(new BigDecimal(0));
		
		deal.setDEAL_REVOLVE_END_DATE(deal.getDEAL_CLOSING_DATE());
		deal.setNOTES("EDGAR");
		logger.info("ABSDeal to save: " + deal.toString());
		absDealDao.save(deal);
		// save Servicer info
		saveABSDealCsServiceProvider(rawFileDataMap);
	}
	
	private void saveABSDealCsServiceProvider(Map<?, ?> rawFileDataMap) throws Exception {
		// populate CS_SERVICE_PROVIDER_NAMES table
		CSServiceProviderNames csName = new CSServiceProviderNames();

		List<CSServiceProviderNames> maxIdList = this.csServiceProviderNamesDao.findMaxId();
		String rawServicer = rawFileDataMap.get("Servicer").toString();
		csName.setSPRN_NAME(rawServicer);
		csName.setSPRT_CODE("SVCR");
		csName.setSPRN_ID(maxIdList.get(0).getSPRN_ID().add(new BigDecimal("1")));
		
		this.csServiceProviderNamesDao.save(csName);
		
		// populate CS_SERVICE_PROVIDER table
		CSServiceProvider csProvider = new CSServiceProvider();
		
		List<CSServiceProvider> maxProviderIdList = this.csServiceProviderDao.findMaxId();
		csProvider.setSPRO_ID(maxProviderIdList.get(0).getSPRO_ID().add(new BigDecimal("1")));
		csProvider.setSPRO_IS_FLAT("N");
		csProvider.setSPRO_NAME(rawServicer);
		csProvider.setSPRO_ANNUAL_RATE_PCT(new BigDecimal("0.01"));
		csProvider.setSPRO_ANNUAL_FEE_AMT(BigDecimal.ZERO);
		csProvider.setSPRO_RATING("Aaa");
		csProvider.setSPRN_ID(csName.getSPRN_ID());
		csProvider.setSPRO_SHORTFALL_RATE(new BigDecimal("0.2"));
		
		this.csServiceProviderDao.save(csProvider);
		
		// populate ABS_DEAL_CS_SERVICE_PROVIDER
		ABSDealCsServiceProvider provider = new ABSDealCsServiceProvider();
		ABSDealCsServiceProviderPK providerPk = new ABSDealCsServiceProviderPK();
		providerPk.setDEAL_ID(new BigDecimal(this.dealId));
		providerPk.setSPRO_ID(csProvider.getSPRO_ID());
		provider.setPk(providerPk);
		
		this.absDealCsServiceProvider.save(provider);
		
	}
	
	private void saveABSPool(Map<?, ?> rawFileDataMap) throws Exception {
		ABSPool absPool = new ABSPool();
		List<ABSPool> absPoolMaxIdList = absPoolDao.findMaxId();
		absPool.setPOOL_ID(absPoolMaxIdList.get(0).getPOOL_ID().add(new BigDecimal("1")));
		this.poolId = absPool.getPOOL_ID().doubleValue();
		logger.info("Pool id is " + absPool.getPOOL_ID());
		
		absPool.setDEAL_ID(new BigDecimal(dealId));
		logger.info("Deal id in ABS_POOL table is " + absPool.getDEAL_ID());
		
		String interestTypeDesc = rawFileDataMap.get("Asset Interest Type").toString().toLowerCase();
		BigDecimal interestTypeId;
		if (interestTypeDesc.contains("fixed")) {
			interestTypeId = new BigDecimal("1");
		} else if (interestTypeDesc.contains("floating")) {
			interestTypeId = new BigDecimal("2");
		} else if (interestTypeDesc.contains("x-libor")) {
			interestTypeId = new BigDecimal("3");
		} else if (interestTypeDesc.contains("mixed")) {
			interestTypeId = new BigDecimal("4");
		} else if (interestTypeDesc.contains("kotei-tokuyaku")) {
			interestTypeId = new BigDecimal("4");
		} else if (interestTypeDesc.contains("Kotei-tokuyaku/Floating")) {
			interestTypeId = new BigDecimal("4");
		} else {
			// description not found in db
			// insert and get new id
			List<CSInterestType> csTypeMaxIdList = csInterestTypeDao.findMaxId();
			interestTypeId = csTypeMaxIdList.get(0).getITYP_ID().add(new BigDecimal("1"));
			CSInterestType newInterestType = new CSInterestType();
			newInterestType.setITYP_DESC(interestTypeDesc);
			newInterestType.setITYP_ID(interestTypeId);
			csInterestTypeDao.save(newInterestType);
		}
		logger.info("InterestTypeId is " + interestTypeId);
		absPool.setITYP_ID(interestTypeId);
		absPool.setPOOL_CODE("ALL collateral");
		// Carrie said that wam and warm should be switched
		absPool.setPOOL_WAM(stringToBigDecimal(rawFileDataMap.get("Original WAM").toString()));
		
		absPool.setPOOL_ORIG_WARM(stringToBigDecimal(rawFileDataMap.get("Original WARM").toString()));
		absPool.setPOOL_CURR_WARM(stringToBigDecimal(rawFileDataMap.get("Original WARM").toString()));
		// ORIG_WAC needs a decimal value instead a percentage
		absPool.setPOOL_ORIG_WAC(stringToBigDecimal(rawFileDataMap.get("Original WAC").toString()).divide(new BigDecimal(100)));
		absPool.setPOOL_CURR_WAC(stringToBigDecimal(rawFileDataMap.get("Original WAC").toString()).divide(new BigDecimal(100)));
		absPool.setPOOL_ORIG_LOAN_COUNT(stringToBigDecimal(rawFileDataMap.get("Initial Number of Loans").toString()));
		// ORIG_BALANCE should be divided by number of loan
		// Avoid nonterminating decimal expansion
		absPool.setPOOL_ORIG_BALANCE(stringToBigDecimal(rawFileDataMap.get("Initial Pool Balance").toString())
				.divide(stringToBigDecimal(rawFileDataMap.get("Initial Number of Loans").toString()), 5, RoundingMode.HALF_UP));
		absPool.setPOOL_TERMINAL_VALUE(new BigDecimal("0"));
		

		absPool.setNB_TRANCHES(new BigDecimal(((Map<?,?>)rawFileDataMap.get("Tranche Designation")).size()));
		logger.info("TrancheSize is " + absPool.getNB_TRANCHES());
		
		// Following columns are not in the extracted data
		// They are set after discussion with Carrie Liu
		absPool.setPOOL_IS_PREPAY_PENALTY("N");
		absPool.setPOOL_DELIN_START(new BigDecimal("6"));
		absPool.setPOOL_ABSNET_START(new BigDecimal("6"));
		absPool.setPOOL_DELIN_END(absPool.getPOOL_ORIG_WARM().subtract(new BigDecimal("6")));
		absPool.setPOOL_ABSNET_END(absPool.getPOOL_DELIN_END());
		absPool.setPOOL_IS_PREFUNDING("N");
		
		// Default values in table. Still need to populate
		absPool.setPOOL_INDEX(new BigDecimal(1));
		absPool.setNB_TRANCHES(new BigDecimal(0));
		absPool.setIS_SPDACT("N");
		absPool.setPOOL_MPSHARE("Y");
		absPool.setWRITEDOWN_MECHANICS("N");
		absPool.setWRITEUP_INTEREST_MECHANICS("N");
		absPool.setWRITEUP_PRINCIPAL_MECHANICS("N");
		absPool.setSUBROGATION("N");
		absPool.setSUBROG_MAX_PCT_BASE("I");
		absPool.setNORMAL_MODE("N");
		absPool.setSIMPLE_SUBROGATION("N");
		absPool.setDCM_BYPASS("Y");
		absPool.setDCM_NF_BEGINNING(new BigDecimal(12));
		absPool.setDCM_NF_END(new BigDecimal(18));
		absPool.setBROKER_CPR_ORIGINAL(new BigDecimal("0.00"));
		
		absPool.setPOOL_MAF(new BigDecimal(0.015)); // magic value
		
		logger.info("ABSPool to save: " + absPool.toString());
		absPoolDao.save(absPool);
		
		// save to ABS_DELIQUENCY and ABS_MARKOV_MATRIX as default values
		// They have to be saved after pool row because they have pool id fk constraint
		saveABSDeliquency(absPool.getPOOL_ID());
		saveABSMarkovMatrix(absPool.getPOOL_ID());
	}
	
	private void saveABSDeliquency(BigDecimal poolId) throws Exception {
		String[] deltCodeArray = new String[] {"30", "60", "90", "120", "CURR"};
		for (int i = 0; i < deltCodeArray.length; i++) {
			ABSDelinquency absDelin = new ABSDelinquency();
			ABSDelinquencyPK absDelinPK = new ABSDelinquencyPK();
			absDelinPK.setPOOL_ID(poolId);
			absDelinPK.setDELT_CODE(deltCodeArray[i]);
			absDelin.setAbsDelinquencyPK(absDelinPK);
			if (i != 4) {
				absDelin.setDELI_AMT(new BigDecimal(0));
			} else {
				absDelin.setDELI_AMT(new BigDecimal(1));
			}
			this.absDelinquencyDao.save(absDelin);
		}
	}
	
	private void saveABSMarkovMatrix (BigDecimal poolId) throws Exception {
		int col = 5;
		int row = 5;
		double[][] values = new double[][] {
			{0.985, 0.003, 0, 0, 0, 0.012}, 
			{0.05, 0.35, 0.6, 0, 0, 0}, 
			{0, 0.05, 0.15, 0.8, 0, 0}, 
			{0, 0, 0.015, 0.085, 0.9, 0}, 
			{0, 0, 0, 0, 1, 0}, 
			{0, 0, 0, 0, 0, 1}
		};
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <= col; j++) {
				ABSMarkovMatrix absMarkovMatrix = new ABSMarkovMatrix();
				ABSMarkovMatrixPK absMarkovMatrixPK = new ABSMarkovMatrixPK();
				absMarkovMatrixPK.setPOOL_ID(poolId);
				absMarkovMatrixPK.setROW_INDEX(String.valueOf(i));
				absMarkovMatrixPK.setCOL_INDEX(String.valueOf(j));
				absMarkovMatrix.setAbsMarkovMatrixPK(absMarkovMatrixPK);
				absMarkovMatrix.setVALUE(new BigDecimal(values[i][j]));
				absMarkovMatrixDao.save(absMarkovMatrix);
			}
		}
	}
	
	private void saveABSTranche(Map<?, ?> dataMap) throws Exception {
		// 1. populate ABSTranche table
		
		List<ABSTranche> maxTrancheIdList = absTrancheDao.findMaxId();
		double addId = 0;
		BigDecimal currTrancheId = null;
		// Tranche{"subtranche": {"Initial Pool Balance": "value", "Coupon Type": "", "Floating Index Name": ""}}
		for ( String key: ((Map<String ,String>)dataMap.get("Tranche Designation")).keySet()) {
			// if key does not have any number or is the first subtranche in the tranche
			// Create tranche and subTranche row
			Map<String, String> subTrancheData = ((Map<String, Map>) dataMap.get("Tranche Designation")).get(key);
			if (!key.matches(".*\\d.*") || key.contains("-1")) {
				++addId;
				ABSTranche absTranche = new ABSTranche();
				absTranche.setDEAL_ID(new BigDecimal(dealId));
				absTranche.setPOOL_ID(new BigDecimal(poolId));
				absTranche.setTRNC_ID(maxTrancheIdList.get(0).getTRNC_ID().add(new BigDecimal(addId)));
				absTranche.setALLO_CODE("S");
				absTranche.setTRNC_CODE(key.substring(6,7));
				absTranche.setTRNC_HAS_IO("N");
				absTranche.setTRNC_PARI_PAST_DUE_INTEREST("N");
				absTranche.setTRNC_IS_NAS("N");
				// Below values are from discussion with Carrie
				absTranche.setTRNC_IS_ERISA_ELIGIBLE("N");
				absTranche.setORIG_MRAT_LETTER_GRADE("Aaa");
				absTranche.setCURR_MRAT_LETTER_GRADE("Aaa");
				absTranche.setORIG_SRAT_LETTER_GRADE("AAA");
				absTranche.setCURR_SRAT_LETTER_GRADE("AAA");
				logger.info("absTranche: " + absTranche.toString());
				absTrancheDao.save(absTranche);
				currTrancheId = absTranche.getTRNC_ID();
				
				
				//TODO: populate abs_sub_tranche 1
				insertABSSubTranche(subTrancheData, dataMap, currTrancheId, key, "1");
				
			} else {
				// Just create the subTranche Row
				// TODO populate abs_sub_tranche based on digit in the key
				String subTrancheId = "";
				for (char c: key.toCharArray()) {
					if (Character.isDigit(c)) {
						subTrancheId = Character.toString(c);
						break;
					}
				}
				insertABSSubTranche(subTrancheData, dataMap, currTrancheId, key, subTrancheId);
			}
		}
	}
	
	private void insertABSSubTranche(Map<String, String> subTrancheData, Map<?, ?> dataMap, BigDecimal currTrancheId, String className, String subTrancheId) throws Exception {
		ABSSubTranche absSubTranche = new ABSSubTranche();
		List<ABSSubTranche> maxIdList = absSubTrancheDao.findMaxId();
		logger.info("subTrancheData: " + subTrancheData.toString());
		absSubTranche.setSTRN_ID(maxIdList.get(0).getSTRN_ID().add(new BigDecimal("1")));
		absSubTranche.setTRNC_ID(currTrancheId);
		String interestTypeDesc = subTrancheData.get("Coupon Type").toString().toLowerCase();
		BigDecimal interestTypeId;
		if (interestTypeDesc.contains("fixed")) {
			interestTypeId = new BigDecimal("1");
		} else if (interestTypeDesc.contains("floating")) {
			interestTypeId = new BigDecimal("2");
		} else if (interestTypeDesc.contains("x-libor")) {
			interestTypeId = new BigDecimal("3");
		} else if (interestTypeDesc.contains("mixed")) {
			interestTypeId = new BigDecimal("4");
		} else if (interestTypeDesc.contains("kotei-tokuyaku")) {
			interestTypeId = new BigDecimal("4");
		} else if (interestTypeDesc.contains("Kotei-tokuyaku/Floating")) {
			interestTypeId = new BigDecimal("4");
		} else {
			// description not found in db
			// insert and get new id
			List<CSInterestType> csTypeMaxIdList = csInterestTypeDao.findMaxId();
			interestTypeId = csTypeMaxIdList.get(0).getITYP_ID().add(new BigDecimal("1"));
			CSInterestType newInterestType = new CSInterestType();
			newInterestType.setITYP_DESC(interestTypeDesc);
			newInterestType.setITYP_ID(interestTypeId);
			csInterestTypeDao.save(newInterestType);
		}
		logger.info("absSubTranche interestTypeId is " + interestTypeId);
		absSubTranche.setITYP_ID(interestTypeId);
		absSubTranche.setSTRN_SEQ_ID(new BigDecimal(subTrancheId));
		absSubTranche.setSTRN_CUSIP("BLANK");
		logger.info("subtranche: initial principal balance: " + subTrancheData.get("Initial Principal Balance"));
		absSubTranche.setSTRN_ORIG_BALANCE(stringToBigDecimal(subTrancheData.get("Initial Principal Balance")));
		// When inserting deal level file, we can only put curr balance = orig balance
		// This can only be updated after non-deal files come in
		absSubTranche.setSTRN_CURR_BALANCE(absSubTranche.getSTRN_ORIG_BALANCE());
		// TODO: DELETE FLOARTING ADD PART, NOT NEEDED
		// TODO: SWITCH POOL TABLE POOL_WAM WITH POOL_ORIG_WARM AND POOL_CURR_WARM
		/*if (interestTypeId.intValue() != 1) {
			// floating cases
			// spread + floating index
			String closingDate = dataMap.get("Closing Date").toString();
			String formattedClosingDate = "" + closingDate.substring(6) + "-"
					+ closingDate.substring(0,2) + "-" + closingDate.substring(3,5);
			logger.info("SubTranche closingDate: " + formattedClosingDate);
			List<CSBasisRate> rateList = csBasisRateDao.findRate(formattedClosingDate);
			absSubTranche.setSTRN_RATE(rateList.get(0).getBASR_RATE()
					.add(stringToBigDecimal(subTrancheData.get("Original Spread/Coupon"))));
		} else {
		*/	
		absSubTranche.setSTRN_RATE(stringToBigDecimal(subTrancheData.get("Original Spread/Coupon")));
		//}
		absSubTranche.setSTRN_PAST_DUE_RATE(absSubTranche.getSTRN_RATE());
		// subcode is optional
		// todo: incorrect
		if (!Character.isDigit(className.charAt(className.length() - 1)) && className.length() > 7) {
			absSubTranche.setSTRN_SUBCODE(Character.toString(className.charAt(className.length()-1)));
		}
		String seniority = subTrancheData.get("Seniority");
		if (seniority.equals("Senior")) {
			absSubTranche.setSTRN_ME_NOTCHING(new BigDecimal("1"));
		} else if (seniority.equals("Mezzanine")) {
			absSubTranche.setSTRN_ME_NOTCHING(new BigDecimal("3"));
		} else if (seniority.equals("Junior")){
			absSubTranche.setSTRN_ME_NOTCHING(new BigDecimal("4"));
		} else {
			throw new DataException("Type of seniority does not exist");
		}
		absSubTranche.setSKIP_CALIBRATION(new BigDecimal("0"));
		// TODO: confirm with Carrie about these
		absSubTranche.setSTRN_IS_SUBJ_STEP_UP("N");
		absSubTranche.setSTRN_IS_SUBJ_FUND_CAP("N");
		logger.info("subTranche: " + absSubTranche.toString());
		absSubTrancheDao.save(absSubTranche);
	}
	
	private boolean validateFileMapAsDeal(Map<?, ?> dataMap) {
		if (!dataMap.containsKey("CIK") || !dataMap.containsKey("Sponsor") || !dataMap.containsKey("SPV")
				|| !dataMap.containsKey("Asset Interest Type") || !dataMap.containsKey("Floating Index")
				|| !dataMap.containsKey("Trustee") || !dataMap.containsKey("Servicer") || !dataMap.containsKey("Originator")
				|| !dataMap.containsKey("Underwriter") || !dataMap.containsKey("Legal Final Maturity Date")
				|| !dataMap.containsKey("Collateral Type") || !dataMap.containsKey("Currency Code") 
				|| !dataMap.containsKey("First Payment Date") ||  !dataMap.containsKey("Closing Date")
				|| !dataMap.containsKey("Initial Pool Balance") || !dataMap.containsKey("Original WAC")
				|| !dataMap.containsKey("Original WAM") || !dataMap.containsKey("Original WARM")
				|| !dataMap.containsKey("Initial Number of Loans") || !dataMap.containsKey("Servicing Fee")
				|| !dataMap.containsKey("Remittance Frequency") || !dataMap.containsKey("Tranche Designation")) {
			return false;
		}
		return true;
	}
	
	private boolean validateRawFileAsNonDeal(Map<?, ?> dataMap) {
		if (!dataMap.containsKey("Update Date") || !dataMap.containsKey("Collection Period End date") 
				|| !dataMap.containsKey("Performance Period")
				|| !dataMap.containsKey("Ending Pool balance") || !dataMap.containsKey("Interest Collections")
				|| !dataMap.containsKey("Scheduled Principal Collections") || !dataMap.containsKey("30 Day Delinquencies") 
				|| !dataMap.containsKey("60 Day Delinquencies")
				|| !dataMap.containsKey("90 Day Delinquencies") || !dataMap.containsKey("90+ Day Delinquencies")
				|| !dataMap.containsKey("Defaulted Receivables") || !dataMap.containsKey("Recoveries") 
				|| !dataMap.containsKey("Prepayment") ||  !dataMap.containsKey("Bankruptcies")
				|| !dataMap.containsKey("Weighted Average Coupon") || !dataMap.containsKey("Weighted Average Remaining Maturity")
				|| !dataMap.containsKey("Remaining No. of Loans") || !dataMap.containsKey("Ending Reserve Account Balance")
				|| !dataMap.containsKey("Foreclosure Balance") || !dataMap.containsKey("REO Balance")
				|| !dataMap.containsKey("CPR") || !dataMap.containsKey("CDR") || !dataMap.containsKey("Current Principal Balance")
			    || !dataMap.containsKey("Past Due Interest") || !dataMap.containsKey("Current NRSRO Rating")
				|| !dataMap.containsKey("Paid off Flag")) {
			return false;
		}
		return true;
	}
	
	private BigDecimal stringToBigDecimal(String numStr) throws DataException{
		numStr = numStr.strip();
		numStr = numStr.replaceAll("[^\\d.]", "");
		if (numStr.equals("")) return new BigDecimal("0");
		if (numStr.equals("-")) return new BigDecimal("0");
		try{
			return BigDecimal.valueOf(
				Double.valueOf(numStr.replaceAll(",", "").replaceAll("%", "")));
		} catch (Exception e) {
			logger.info("String to bigdecimal convertion meets an error: " + numStr);
			throw new DataException("String to bigdecimal convertion meets an error");
		}
		
	}
}
