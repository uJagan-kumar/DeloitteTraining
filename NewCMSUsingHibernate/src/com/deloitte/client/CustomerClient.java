package com.deloitte.client;

import com.deloitte.cms.dao.CustomerDao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.deloitte.cms.model.Customer;

import com.deloitte.cms.dao.impl.CustomerDaoImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient 
{
	public static void main(String[] args) 
	{
		
		CustomerDao customerDao = new CustomerDaoImpl();
		while (true) {
			System.out.println("M E N U ");
			System.out.println("1. Add Customer ");
			System.out.println("2. Delete Customer ");
			System.out.println("3. Update Customer ");
			System.out.println("4. Search Customer ");
			System.out.println("5. Display All Customers ");
			System.out.println("6. E X I T ");

			Scanner scanner = new Scanner(System.in);
			int option = scanner.nextInt();

			if (option == 1) {
				System.out.println("Enter customer id ");
				int customerId = scanner.nextInt();

				boolean isExists = customerDao.isCustomerExists(customerId);
				if (isExists) {
					System.out.println("Record already exists with customer id :" + customerId);
					System.out.println("Try again with different customer id ");
				} else {
					System.out.println("Enter customer name ");
					String customerName = scanner.next();
					System.out.println("Enter customer address ");
					String customerAddress = scanner.next();
					System.out.println("Enter customer bill amount ");
					int billAmount = scanner.nextInt();
					Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
					customerDao.insertCustomer(customer);
					System.out.println(customerName + " congrats !! Enjoy You are so Lucky");
				}
			}

			if (option == 2) {
				System.out.println("Enter customer id ");
				int customerId = scanner.nextInt();

				boolean isExists = customerDao.isCustomerExists(customerId);
				if (isExists) 
				{
						customerDao.deleteCustomer(customerId);
						System.out.println("Go Go Gone .. Enjoy Deleted");
				} 
				else
				{
					System.out.println("No Recordexists with customer id :" + customerId);
					System.out.println("Try again with different customer id ");
				}
			}
			if (option == 3) {
				System.out.println("Enter customer id to update ");
				int customerId = scanner.nextInt();

				boolean isExists = customerDao.isCustomerExists(customerId);
				if (isExists) {
					System.out.println("Enter new customer name ");
					String customerName = scanner.next();
					System.out.println("Enter new customer address ");
					String customerAddress = scanner.next();
					System.out.println("Enter new customer bill amount ");
					int billAmount = scanner.nextInt();
					Customer customer = new Customer(customerId, customerName, customerAddress, billAmount);
					customerDao.updateCustomer(customer);
					System.out.println(customerName + " congrats !! Enjoy You are so Lucky records Updated");
					
					
				} else {
					System.out.println("Record not  exists with customer id :" + customerId);
					System.out.println("Try again with different customer id ");
				}
			}
			if (option == 4) {
				System.out.println("Enter customer id to fetch ");
				int customerId = scanner.nextInt();

				boolean isExists = customerDao.isCustomerExists(customerId);
				if (isExists) 
				{
						Customer customer = customerDao.SearchCustomerById(customerId);
						System.out.println("Record of :"+customerId+ " is : ");
						System.out.println(customer);
					
				} 
				else
				{
					System.out.println("No Recordexists with customer id :" + customerId);
					System.out.println("Try again with different customer id ");
				}
			}
			if (option == 5) {
					List<Customer> allCustomers = customerDao.getAllCustomers();
					System.out.println(allCustomers);
			}
			if (option == 6) {
				System.out.println("Thanks for using for my customer project ");
				System.exit(0);
				
			
			}
		}

	}

	}


