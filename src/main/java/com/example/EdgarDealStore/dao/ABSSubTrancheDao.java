package com.example.EdgarDealStore.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSSubTranche;

public interface ABSSubTrancheDao extends CrudRepository<ABSSubTranche, Long> {
	@Query(value="SELECT * FROM ABS_SUB_TRANCHE WHERE STRN_ID = (SELECT MAX(STRN_ID) FROM ABS_SUB_TRANCHE)", nativeQuery=true)
	public List<ABSSubTranche> findMaxId();
	
	@Query(value="SELECT * FROM ABS_SUB_TRANCHE WHERE TRNC_ID = :trancheId", nativeQuery=true)
	public List<ABSSubTranche> findSubTrancheByTrancheId(BigDecimal trancheId);
	
}
