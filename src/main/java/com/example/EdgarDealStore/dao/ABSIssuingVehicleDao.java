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

import com.example.EdgarDealStore.entity.ABSIssuingVehicle;

public interface ABSIssuingVehicleDao extends CrudRepository<ABSIssuingVehicle, Long> {

	@Query(value="SELECT * FROM ABS_ISSUING_VEHICLE WHERE ISSV_DESC= :vehicleDesc", nativeQuery=true)
	public List<ABSIssuingVehicle> findIssuingVehicleByDesc(String vehicleDesc);
	
	@Query(value="SELECT * FROM ABS_ISSUING_VEHICLE WHERE ISSV_ID = (SELECT MAX(ISSV_ID) FROM ABS_ISSUING_VEHICLE)", nativeQuery=true)
	public List<ABSIssuingVehicle> findMaxId();

}
