package com.deloitte.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.deloitte.cms.dao.CustomerDao;
import com.deloitte.cms.model.Customer;
import com.deloitte.utility.DbUtility;

public class CustomerDaoImpl implements CustomerDao {
	
	
	
	Configuration configuration = new Configuration().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	Session session;

	@Override
	public List<Customer> getAllCustomers() {
		

		List<Customer> allCustomers = new ArrayList<Customer>();
        session = factory.openSession();
        //equivalent to select * from customer100;
		Query query = session.createQuery("from com.deloitte.cms.model.Customer");
		
		/*Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("customerAddress", "detroit"));
		return criteria.list();*/
		
		System.out.println(session.createQuery("select count(customerId) from com.deloitte.cms.model.Customer").list().get(0));
		System.out.println(session.createQuery("select count(customerId) from com.deloitte.cms.model.Customer").uniqueResult());
		return query.list(); //but this offers no control can only be used for all record
		
		
		/*Iterator <Customer> iterator = query.iterate();
		 while(iterator.hasNext())
		{
			Customer customer = iterator.next();
			allCustomers.add(customer);
		}
		
		
		return allCustomers;*/
		
	}
	@Override
	public boolean insertCustomer(Customer customer) 
	{
		
 		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();

		
		System.out.println("Data saved");
		
		return true;
		
	}
	
	@Override
	public boolean updateCustomer(Customer customer) 
	{
 		
		session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.update(customer);
		transaction.commit();
 
 		return true;
		
	}
	@Override
	public boolean deleteCustomer(int customerId) {

		session = factory.openSession();
		Transaction transaction = session.beginTransaction();


		Customer customer=  new Customer();
		customer.setCustomerId(customerId);
		session.delete(customer);
		transaction.commit();
		session.close();
	

		 return true;
		
	}
	
	@Override
	public Customer SearchCustomerById(int customerId) {
		
		session = factory.openSession();
		Customer customer= (Customer)session.get(Customer.class,customerId);
		session.close();

		
		return customer;
	
		
	}
	
	
	@Override
	public boolean isCustomerExists(int customerId) 
	{

 	
		session = factory.openSession();
		Customer customer= (Customer)session.get(Customer.class,customerId);
		session.close();

		if(customer==null)
		{
			return false;
		}
		else
		return true;
	}
	
	

}
