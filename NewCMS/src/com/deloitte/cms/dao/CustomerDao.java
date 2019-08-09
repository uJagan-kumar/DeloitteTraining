package com.deloitte.cms.dao;

import java.util.List;

import com.deloitte.cms.model.Customer;

public interface CustomerDao 
{
    public List<Customer> getAllCustomers();
    public boolean insertCustomer(Customer customer);
    public boolean updateCustomer(Customer customer);
    public boolean deleteCustomer(int customerId);
    public Customer SearchCustomerById(int customerId);
    public boolean isCustomerExists(int customerId);


    
}
