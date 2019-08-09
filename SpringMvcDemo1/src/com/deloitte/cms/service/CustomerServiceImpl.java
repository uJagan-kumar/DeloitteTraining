package com.deloitte.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.cms.dao.CustomerDao;
import com.deloitte.cms.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	
	
	@Autowired (required=false)
	CustomerDao customerDao;
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertCustomer(Customer customer) {
		if(customer.getCustomerId()>0)
		{
			return customerDao.insertCustomer(customer);
		}
		else
		return false;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer SearchCustomerById(int customerId) {
		
		return customerDao.SearchCustomerById(customerId);
	}

	@Override
	public boolean isCustomerExists(int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

}
