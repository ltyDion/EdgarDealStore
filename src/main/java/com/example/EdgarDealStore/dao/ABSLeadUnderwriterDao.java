package com.example.EdgarDealStore.dao;


import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.EdgarDealStore.entity.ABSLeadUnderwriter;

@Repository
public interface ABSLeadUnderwriterDao extends CrudRepository<ABSLeadUnderwriter, Long> {

	@Query(value="SELECT * FROM ABS_LEAD_UNDERWRITER WHERE UNWR_DESC= :writerDesc", nativeQuery=true)
	public List<ABSLeadUnderwriter> findUnderwriterIdByExactDesc(String writerDesc);
	
	@Query(value="SELECT * FROM ABS_LEAD_UNDERWRITER WHERE UNWR_DESC like %:writerDesc%", nativeQuery=true)
	public List<ABSLeadUnderwriter> findUnderwriterIdByVagueDesc(String writerDesc);
	
	@Query(value="SELECT * FROM ABS_LEAD_UNDERWRITER WHERE UNWR_ID = (SELECT MAX(UNWR_ID) FROM ABS_LEAD_UNDERWRITER)", nativeQuery=true)
	public List<ABSLeadUnderwriter> findMaxId();
	
	@Modifying
	@Query(value="INSERT INTO ABS_LEAD_UNDERWRITER (UNWR_ID, UNWR_DESC) VALUES (:id, :desc)", nativeQuery=true)
	@Transactional
	public void insertDesc(BigDecimal id, String desc);

}
