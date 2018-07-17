package com.techelevator.dao;

import com.techelevator.dao.model.Actor;
import com.techelevator.dao.model.Customer;

import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCCustomerDao
 */
@Component
public class JDBCCustomerDao implements CustomerDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCCustomerDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Customer> searchAndSortCustomers(String search, String sort) {
    	List<Customer> matchingCustomers = new ArrayList<>();
    	String customerSearchSql = "SELECT first_name, last_name, email, activebool from customer order by ?";
    	SqlRowSet customerResults = jdbcTemplate.queryForRowSet(customerSearchSql, search, sort);
    	while(customerResults.next()) {
    		matchingCustomers.add(mapRowToCustomer(customerResults));
    	}
    	return matchingCustomers;
    }
    
	private Customer mapRowToCustomer(SqlRowSet customerResults) {
		return new Customer();
	}

	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Customer> searchAndSortCustomers(String search, String sort, String requestCustomerActive) {
		// TODO Auto-generated method stub
		return null;
	}



    
}