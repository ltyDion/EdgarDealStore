package com.example.EdgarDealStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.CSServiceProviderNames;


public interface CSServiceProviderNamesDao extends CrudRepository<CSServiceProviderNames, Long> {

	@Query(value="SELECT * FROM CS_SERVICE_PROVIDER_NAMES WHERE SPRN_ID = (SELECT MAX(SPRN_ID) FROM CS_SERVICE_PROVIDER_NAMES)", nativeQuery=true)
	public List<CSServiceProviderNames> findMaxId();
	
}
