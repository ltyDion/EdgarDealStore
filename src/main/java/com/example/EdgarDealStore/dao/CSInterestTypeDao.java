package com.example.EdgarDealStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.CSInterestType;

public interface CSInterestTypeDao extends CrudRepository<CSInterestType, Long> {
	@Query(value="SELECT * FROM CS_INTEREST_TYPE WHERE ITYP_ID = (SELECT MAX(ITYP_ID) FROM CS_INTEREST_TYPE)", nativeQuery=true)
	public List<CSInterestType> findMaxId();
	
}
