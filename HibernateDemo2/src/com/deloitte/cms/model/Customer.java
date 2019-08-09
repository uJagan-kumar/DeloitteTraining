package com.deloitte.cms.model;


import java.io.Serializable;

public class Customer 
{
   private int customerId;
   private String customerAddress;
   private String customerName;
   private int billAmount;
   
    public Customer() 
    {
	
    }

    public Customer(int customerId, String customerAddress, String customerName , int billAmount) {
	
	super();
	this.customerId = customerId;
	this.customerAddress = customerAddress;
	this.customerName = customerName;
	this.billAmount = billAmount;
    }

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "\nCustomer [customerId=" + customerId + ", customerAddress=" + customerAddress + ", customerName="
				+ customerName + ", billAmount=" + billAmount + "]";
	}
    
	
    
   
   
}
