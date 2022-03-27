package com.example.EdgarDealStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSDealCsServiceProvider;


public interface ABSDealCsServiceProviderDao extends CrudRepository<ABSDealCsServiceProvider, Long> {
	@Query(value="SELECT * FROM ABS_DEAL_CS_SERVICE_PROVIDER WHERE SPRO_ID = (SELECT MAX(SPRO_ID) FROM ABS_DEAL_CS_SERVICE_PROVIDER)", nativeQuery=true)
	public List<ABSDealCsServiceProvider> findMaxId();
	
}
