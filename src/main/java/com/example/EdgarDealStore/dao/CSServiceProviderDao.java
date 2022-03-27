package com.example.EdgarDealStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.CSServiceProvider;

public interface CSServiceProviderDao extends CrudRepository<CSServiceProvider, Long> {

	@Query(value="SELECT * FROM CS_SERVICE_PROVIDER WHERE SPRO_ID = (SELECT MAX(SPRO_ID) FROM CS_SERVICE_PROVIDER)", nativeQuery=true)
	public List<CSServiceProvider> findMaxId();
}
