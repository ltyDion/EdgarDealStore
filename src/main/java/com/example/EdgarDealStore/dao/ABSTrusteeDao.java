package com.example.EdgarDealStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.EdgarDealStore.entity.ABSTrustee;

public interface ABSTrusteeDao extends CrudRepository<ABSTrustee, Long> {

	@Query(value="SELECT * FROM ABS_TRUSTEES WHERE TRST_ID = (SELECT MAX(TRST_ID) FROM ABS_TRUSTEES)", nativeQuery=true)
	public List<ABSTrustee> findMaxId();
	
	@Query(value="SELECT * FROM ABS_TRUSTEES WHERE TRST_DESC= :trusteeDesc", nativeQuery=true)
	public List<ABSTrustee> findTrusteeByDesc(String trusteeDesc);
}
