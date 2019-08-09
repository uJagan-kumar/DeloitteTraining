package com.deloitte.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deloitte.cms.dao.CustomerDao;
import com.deloitte.cms.dao.impl.CustomerDaoImpl;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.service.CustomerService;

@Controller
public class CustomerController 
{
	@Autowired(required=false)
	CustomerService customerService;
	
	@RequestMapping("addCustomer")
	public ModelAndView addCustomer(Customer customer)
	{
		
		if(customerService.insertCustomer(customer))
		return new ModelAndView("success","cust",customer);
		else
		return new ModelAndView("failure");

		
	}
	
	@RequestMapping("updateCustomer")
	public ModelAndView updateCustomer(Customer customer)
	{
		
		customerService.updateCustomer(customer);
		return new ModelAndView("success","cust",customer);
	}
	
	@RequestMapping("searchCustomerById")
	public ModelAndView searchCustomerByIdForm(Customer customer)
	{
		Customer customer2 = new Customer();
		customer2=customerService.SearchCustomerById(customer.getCustomerId());
		
		return new ModelAndView("customerDetailsById","command",customer2);
	}
}
