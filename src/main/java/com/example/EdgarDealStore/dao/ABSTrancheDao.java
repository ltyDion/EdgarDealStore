package com.example.EdgarDealStore.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSPool;
import com.example.EdgarDealStore.entity.ABSTranche;

public interface ABSTrancheDao extends CrudRepository<ABSTranche, Long>{
	@Query(value="SELECT * FROM ABS_TRANCHE WHERE TRNC_ID = (SELECT MAX(TRNC_ID) FROM ABS_TRANCHE)", nativeQuery=true)
	public List<ABSTranche> findMaxId();
	
	@Query(value="SELECT * FROM ABS_TRANCHE WHERE DEAL_ID = :dealId AND POOL_ID = :poolId", nativeQuery=true)
	public List<ABSTranche> findAllTranche(BigDecimal dealId, BigDecimal poolId);
	
}
