package com.connectionutil;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConnectionUtil {
	public static JdbcTemplate getJdbcTemplate(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		return jdbcTemplate;
	}
	
	public static javax.sql.DataSource getDataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/irinedb");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
		
	}
}
