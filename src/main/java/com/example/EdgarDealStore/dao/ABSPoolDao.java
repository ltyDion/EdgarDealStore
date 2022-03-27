package com.example.EdgarDealStore.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSPool;

public interface ABSPoolDao extends CrudRepository<ABSPool, Long> {
	@Query(value="SELECT * FROM ABS_POOL WHERE POOL_ID = (SELECT MAX(POOL_ID) FROM ABS_POOL)", nativeQuery=true)
	public List<ABSPool> findMaxId();
	
	@Query(value="SELECT * FROM ABS_POOL WHERE DEAL_ID = :dealId", nativeQuery=true)
	public List<ABSPool> findByDealId(BigDecimal dealId);
}
