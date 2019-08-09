package com.deloitte.client;

import com.deloitte.cms.dao.CustomerDao;
import com.deloitte.cms.dao.impl.CustomerDaoImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient 
{
	public static void main(String[] args) 
	{
		int customerId =115;
		CustomerDao customerDao = new CustomerDaoImpl();
		boolean result = customerDao.isCustomerExists(customerId);
		
		//System.out.println(result);
		
		Customer customer = new Customer(76,"Bengaluru","Pathi",4800);
		customer.setBillAmount(3700);
		customer.setCustomerAddress("Chennai");
		customer.setCustomerName("Lenka");
		//System.out.println(customerDao.updateCustomer(customer));
		//System.out.println(customerDao.SearchCustomerById(customerId));
		System.out.println(customerDao.getAllCustomers());



		
		//System.out.println(customerDao.insertCustomer(customer));
	}
}

