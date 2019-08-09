package model;

import java.util.Comparator;

public class SortByAddressComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getCustomerAddress().compareTo(o2.getCustomerAddress())<0)
		{return -1;}
	else
		{return 0;}
	
	}


	


}
