package com.deloitte.cms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;

@Configuration
public class AppConfiguration 
{
	@Bean
	//@Scope("prototype")
	public Customer getCustomerObject()
	{
		return new Customer();
	}
	
	@Bean
	public Address getAddressObject()
	{
		return new Address();
	}
}
