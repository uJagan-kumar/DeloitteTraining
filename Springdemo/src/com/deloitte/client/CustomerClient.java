package com.deloitte.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.deloitte.cms.model.Address;
import com.deloitte.cms.model.Customer;

public class CustomerClient 
{
	public static void main(String[] args) 
	{
		//AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext(new String[] {"Beans.xml", "Beans2.xml"});
		
				AbstractApplicationContext context = 
						new ClassPathXmlApplicationContext("Beans3.xml");
		Customer customer = (Customer)context.getBean("cust");
		Customer customer2 = (Customer)context.getBean("cust");

		System.out.println(customer);
		
		context.registerShutdownHook();
		
	}

}


