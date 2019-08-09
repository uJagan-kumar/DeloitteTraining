package model;

import allExceptions.InvalidCustomerIdException;
import java.io.Serializable;
import allExceptions.InvalidCustomerNameException;
import allExceptions.NegativeBillAmountException;


public class Customer implements Serializable, Comparable<Customer>
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
 
    public Customer(int customerId, String customerName, String customerAddress, int billAmount) 
    {
	
    	if (customerId>0) {
			this.customerId = customerId;
		}
    	else
    	{
    		try {
				throw new InvalidCustomerIdException("The Id is invalid");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
		if (customerName.length()>5) {
			this.customerName = customerName;
		}
    	else
    	{
    	  try {
			throw new InvalidCustomerNameException("name can't be small");
		} catch (Exception e) {
			e.printStackTrace();
    	}
    	}
		this.customerAddress = customerAddress;
    	if (billAmount >0) {
			this.billAmount = billAmount;
		}
    	else
    	{
    		try {
				throw new NegativeBillAmountException("Bill amount can't be negative");
			} catch (NegativeBillAmountException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }
    
	
    public Customer() 
    {
    	customerId= 123;
    	customerName = "Jack";
    	customerAddress = "No 32, nexwave";
    	billAmount = 10000;
    }
    
    
    @Override
	public String toString() 
    {
		return "\nCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", billAmount=" + billAmount + "]";
	}


	@Override
	public int hashCode() 
    {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + customerId;
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (billAmount != other.billAmount)
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerId != other.customerId)
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		return true;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		if (customerName.length()>5) {
			this.customerName = customerName;
		}
    	else
    	{
    	  try {
			throw new InvalidCustomerNameException("name can't be small");
		} catch (Exception e) {
			e.printStackTrace();
    	}
    	}
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
		if (billAmount >0) {
			this.billAmount = billAmount;
		}
    	else
    	{
    		try {
				throw new NegativeBillAmountException("Bill amount can't be negative");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
	}

	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		if (customerId>0) {
			this.customerId = customerId;
		}
    	else
    	{
    		try {
				throw new InvalidCustomerIdException("The Id is invalid");
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
	}


	@Override
	public int compareTo(Customer o) 
	{
		/*if(this.getBillAmount()>o.getBillAmount())
		return -1;
		else
		return 0;*/
		
		if(this.getCustomerName().compareTo(o.getCustomerName())>0)
			{return -1;}
		else
			{return 0;}
	}
	
	
 
}
