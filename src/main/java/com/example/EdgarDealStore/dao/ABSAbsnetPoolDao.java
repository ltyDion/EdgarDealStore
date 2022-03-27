package com.example.EdgarDealStore.dao;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSAbsnetPool;

public interface ABSAbsnetPoolDao extends CrudRepository<ABSAbsnetPool, Long> {

	@Query(value="SELECT * FROM ABS_ABSNET_POOL WHERE POOL_ID= :poolId and APOL_PERIOD= :period", nativeQuery=true)
	public List<ABSAbsnetPool> findByPoolIdAndPeriod(BigDecimal poolId, BigDecimal period);
}
