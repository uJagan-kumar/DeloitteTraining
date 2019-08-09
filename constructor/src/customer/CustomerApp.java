package customer;

public class CustomerApp 
{

	public static void main(String[] args) 
	{
		Customer customer1 = new Customer(124,20000);
		Customer customer2 = new Customer(123,"Jack",10000);
		Customer customer3 = new Customer();
		Customer customer4 = customer1;
		
		System.out.println(customer2.equals(customer3));
		System.out.println(customer4.equals(customer1));
		
		System.out.println(customer1);
		System.out.println(customer2);
		System.out.println(customer3);
		System.out.println(customer4);
		
		customer2.setCustomerAddress("whitefield");
		System.out.println(customer2.getCustomerAddress());
	}
		
}
