package com.deloitte.cms.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.cms.model.Customer;
import com.deloitte.cms.model.PremiumCustomer;


public class Client 
{
	
	public static void main(String[] args) 
	{
	
		//hibernate.cfg.xml creates db connection; can also give name of a file
		Customer customer = new Customer(25,"kolkata","varun",3000);
		//customer.setRewardPoints(2000);

		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(customer);
		//Customer customer = (Customer)session.load(Customer.class, 12);
		//customer.setCustomerName("jayz");
		System.out.println(customer);
		transaction.commit();
		session.close();


		factory.close();
		System.out.println("Data saved");
	}
}
