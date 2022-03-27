package com.example.EdgarDealStore.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSAbsnetSubTranche;

public interface ABSAbsnetSubTrancheDao extends CrudRepository<ABSAbsnetSubTranche, Long> {

	@Query(value="SELECT * FROM ABS_ABSNET_SUB_TRANCHE WHERE STRN_ID = :subTrancheId AND ASTR_PERIOD = :period", nativeQuery=true)
	public List<ABSAbsnetSubTranche> findPrevMonthSubTranche(BigDecimal subTrancheId, BigDecimal period);
}
