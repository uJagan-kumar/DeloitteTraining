package model;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import model.Customer;
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		List<Customer> customerlist = new ArrayList<Customer>();
		
		customerlist.add(new Customer(1,"Neha shah","Delhi",12000));
		customerlist.add(new Customer(2,"Meha shah","Belhi",11000));
		customerlist.add(new Customer(3,"Teha shah","Gelhi",10000));
		customerlist.add(new Customer(4,"Peha shah","Lelhi",13000));
		customerlist.add(new Customer(5,"Leha shah","Pelhi",14000));
		System.out.println("PLease select a sorting option 1.Name 2.Address 3.Bill amount 4.Id");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option ==1) 
		{
			Collections.sort(customerlist);
			System.out.println(customerlist);
		}
		else if(option ==2)
		{
			Collections.sort(customerlist, new SortByAddressComparator());
			System.out.println(customerlist);

		}
		else if(option ==3)
		{
			Collections.sort(customerlist, new SortByBillAmountComparator());
			System.out.println(customerlist);

		}
		else if(option ==4)
		{
			Collections.sort(customerlist, new Comparator<Customer>() {

				@Override
				public int compare(Customer o1, Customer o2) {

					if(o1.getCustomerId() >o2.getCustomerId())
						return -1;
						else
						return 0;
					
				}
			});
			System.out.println(customerlist);
			
		}
		
		
		
		/*Iterator<Customer> iterator =customerlist.iterator();
		Iterator<Customer> iterator2 =customerlist.iterator();
		
		System.out.println("Salary shortlist");
		while(iterator.hasNext())
		{
			Customer cust =iterator.next();
			if(cust.getBillAmount()>10000)
			{
				System.out.println(cust);
			}
		}
		
		System.out.println("\nNow for address shortlist");
		while(iterator2.hasNext())
		{
			Customer cust =iterator2.next();
			if(cust.getCustomerAddress()=="Delhi")
			{
				System.out.println(cust);
			}
			else if(cust.getCustomerAddress()=="Belhi")
			{
				System.out.println(cust);
			}
		}*/
		
	
		
		
		

	}

}
