package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.deloitte.cms.dao.CustomerDao;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public List<Customer> getAllCustomers() {
		Connection connection =  DbUtility.getMyConnection();
		
		List<Customer> allCustomers = new ArrayList<Customer>();
		
		try 
		{
			PreparedStatement statement = 
					connection.prepareStatement("select * from hr.customers");
			
			ResultSet resultSet = statement.executeQuery();
			
			while(resultSet.next())
			{
				Customer customer = new Customer();	
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerAddress(resultSet.getString(2));
			customer.setCustomerName(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
			allCustomers.add(customer);
			
			}
			
			
		}   catch (SQLException e) {
			e.printStackTrace();
		}
		
		return allCustomers;
		
	}
	private static final String INSERT_CUSTOMER_QUERY = "insert into hr.customers values(?,?,?,?)";
	@Override
	public boolean insertCustomer(Customer customer) 
	{
		
 		int noOfRecords=0;
 		
 		try {
		PreparedStatement statement = DbUtility.getMyConnection().prepareStatement(INSERT_CUSTOMER_QUERY);
		statement.setInt(1, customer.getCustomerId() );
 		statement.setString(2, customer.getCustomerAddress());
 		statement.setString(3, customer.getCustomerName());
 		statement.setInt(4, customer.getBillAmount());
 		noOfRecords = statement.executeUpdate();
 		}
 		catch (SQLException e)
 		{
 			e.printStackTrace();
 		}
 		if(noOfRecords==0)
 			return false;
 		else return true;
		
	}
	
	private static final String UPDATE_CUSTOMER_QUERY= "update hr.customers set customerAddress = ?, customerName =?, billAmount = ? where customerId = ?";
	@Override
	public boolean updateCustomer(Customer customer) 
	{
 		int noOfRecords=0;
 		
 		try {
		PreparedStatement statement = DbUtility.getMyConnection().prepareStatement(UPDATE_CUSTOMER_QUERY);
		statement.setInt(4, customer.getCustomerId() );
 		statement.setString(1, customer.getCustomerAddress());
 		statement.setString(2, customer.getCustomerName());
 		statement.setInt(3, customer.getBillAmount());
 		noOfRecords = statement.executeUpdate();
 		}
 		catch (SQLException e)
 		{
 			e.printStackTrace();
 		}
 		if(noOfRecords==0)
 			return false;
 		else return true;
		
	}
	private static final String DELETE_CUSTOMER_QUERY = "delete from hr.customers where customerId=?";
	@Override
	public boolean deleteCustomer(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		int rows = 0;
		try 
		{
			PreparedStatement statement = 
					connection.prepareStatement(DELETE_CUSTOMER_QUERY);
			statement.setInt(1,customerId);
			
			rows = statement.executeUpdate();
			
		}   catch (SQLException e) {
			e.printStackTrace();
		}
		
		if(rows==0)
 			return false;
 		else return true;
		
	}
	
	private static final String SEARCH_CUSTOMER_QUERY = "select * from hr.customers where customerId =?";
	@Override
	public Customer SearchCustomerById(int customerId) {
		Connection connection = DbUtility.getMyConnection();
		
		Customer customer = new Customer();
		try 
		{
			PreparedStatement statement = 
					connection.prepareStatement(SEARCH_CUSTOMER_QUERY);
			statement.setInt(1,customerId);
			
			ResultSet resultSet = statement.executeQuery();
			resultSet.next();
			customer.setCustomerId(resultSet.getInt(1));
			customer.setCustomerAddress(resultSet.getString(2));
			customer.setCustomerName(resultSet.getString(3));
			customer.setBillAmount(resultSet.getInt(4));
			
			
		}   catch (SQLException e) {
			e.printStackTrace();
		}
		
		return customer;
	}
	
	private static final String SELECT_CUSTOMER_QUERY = "select * from hr.customers where customerId =?";
	
	@Override
	public boolean isCustomerExists(int customerId) 
	{
		Connection connection = DbUtility.getMyConnection();
		boolean isUserExists = false;
		try 
		{
			PreparedStatement statement = 
					connection.prepareStatement(SELECT_CUSTOMER_QUERY);
			statement.setInt(1,customerId);
			
			ResultSet resultSet = statement.executeQuery();
			if(resultSet.next()) {
				isUserExists = true;
			}
		}   catch (SQLException e) {
			e.printStackTrace();
		}
		
		return isUserExists;
	}

}
