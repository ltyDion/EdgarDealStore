package com.example.EdgarDealStore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.EdgarDealStore.entity.CSInterestType;

@SpringBootApplication
public class EdgarDealStoreApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(EdgarDealStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "SELECT * FROM \"CS_INTEREST_TYPE\"";
		
		List<CSInterestType> csInterestTypes = jdbcTemplate.query(sql, 
				BeanPropertyRowMapper.newInstance(CSInterestType.class));
		csInterestTypes.forEach(System.out::println);
		
	}
}
