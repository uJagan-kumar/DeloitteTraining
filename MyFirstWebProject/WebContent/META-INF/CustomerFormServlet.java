package com;

import java.io.IOException;
import com.delloite.client.*;
import com.delloite.cms.dao.impl.*;
import com.delloite.cms.dao.*;
import com.delloite.cms.model.*;
import com.delloite.utility.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delloite.cms.model.Customer;


public class CustomerFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerFormServlet() {
        super();
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	int customerId= Integer.parseInt(request.getParameter("customerId"));
	String customerName= request.getParameter("customerName");
	String customerAddress= request.getParameter("customerAddress");
	int billAmount= Integer.parseInt(request.getParameter("billAmount"));
	//response.getWriter().println("\n" +customerId + "\n" +customerName +"\n" +customerAddress +"\n" +billAmount);
	
	Customer customer = new Customer(customerId,customerAddress,customerName, billAmount);
	CustomerDAO customerDAO = new CustomerDAOImpl();
	boolean result = customerDAO.insertCustomer(customer);
	if(result)
	{
		response.getWriter().println("<h2>" +customerName+ "got saved");
	}
	else
	{
		response.getWriter().println("Customer not saved");
	}
	}

}
