package model;

import java.util.Comparator;

public class SortByBillAmountComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) 
	{
		
		if(o1.getBillAmount()>o2.getBillAmount())
			return -1;
			else
			return 0;
	}

}
