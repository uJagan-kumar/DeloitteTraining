package customer;

public class Customer 
{
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int billAmount;
 
    public Customer(int customerId, String customerName, String customerAddress, int billAmount) {
	
    	this.customerId = customerId;
    	this.customerName = customerName;
    	this.customerAddress = customerAddress;
    	this.billAmount = billAmount;
    }
    
	public Customer(int customerId, String customerName, int billAmount) 
    {
    	this();
    	this.customerId = customerId;
    	this.customerName = customerName;
    	this.billAmount = billAmount;
    }
    
    public Customer(int customerId, int billAmount) 
    {
    	this();
    	this.customerId = customerId;
    	this.billAmount = billAmount;
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
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
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

	public int getCustomerId() {
		return customerId;
	}

	
 
}
