package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.cms.model.Customer;


public class Client 
{
	
	public static void main(String[] args) 
	{
	
		//Customer customer = new Customer(13,"mumbai","anu",2000);
		//hibernate.cfg.xml creates db connection; can also give name of a file
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		//session.save(customer);
		Customer customer = (Customer)session.load(Customer.class, 12);
		//customer.setCustomerName("jayz");
		System.out.println(customer);
		transaction.commit();
		session.close();
		
		System.out.println(customer);

		factory.close();
		System.out.println("Data saved");
	}
}
