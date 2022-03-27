package com.example.EdgarDealStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.CSBasisRate;

public interface CSBasisRateDao extends CrudRepository<CSBasisRate, Long>{

	@Query(value="SELECT * FROM CS_BASIS_RATE WHERE BASI_CODE='1MLI' AND BASR_DATE<to_timestamp(:date, 'YYYY-MM-DD') AND rownum <= 1 ORDER BY BASR_DATE DESC", nativeQuery=true)
	public List<CSBasisRate> findRate(String date);
}
