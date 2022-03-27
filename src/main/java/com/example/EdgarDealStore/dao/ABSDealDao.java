package com.example.EdgarDealStore.dao;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.EdgarDealStore.entity.ABSDeal;

@Repository
public class ABSDealDao {
	protected Logger logger = LoggerFactory.getLogger(getClass());

	
	private EntityManager entityMgr;
	
	@Autowired
	public ABSDealDao(EntityManager entityMgr) {
		this.entityMgr = entityMgr;
	}
	
	public String printMaxIdRow() {
		Session session = entityMgr.unwrap(Session.class);
		String sqlQuery = "SELECT * FROM ABS_DEAL ad WHERE"
							+ " DEAL_ID = "
							+ "(SELECT MAX(DEAL_ID) FROM ABS_DEAL ad2) ";
		
		Query<ABSDeal> query = session.createNativeQuery(sqlQuery, ABSDeal.class);
		List<ABSDeal> dealWithMaxId = query.getResultList();
		logger.info("result row size: " + dealWithMaxId.size()); // exception handling on resultSet size? get(0)?
		return dealWithMaxId.get(0).toString();
	}
	
	public BigDecimal findMaxId() {
		Session session = entityMgr.unwrap(Session.class);
		String sqlQuery = "SELECT * FROM ABS_DEAL ad WHERE"
							+ " DEAL_ID = "
							+ "(SELECT MAX(DEAL_ID) FROM ABS_DEAL ad2) ";
		
		Query<ABSDeal> query = session.createNativeQuery(sqlQuery, ABSDeal.class);
		List<ABSDeal> dealWithMaxId = query.getResultList();
		logger.info("result row size: " + dealWithMaxId.size());
		return dealWithMaxId.get(0).getDEAL_ID();
	}
	
	public void save(ABSDeal absDeal) throws SQLException {
		Session session = entityMgr.unwrap(Session.class);
		
		session.save(absDeal);
	}
	
	
}
