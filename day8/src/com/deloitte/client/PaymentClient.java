package com.deloitte.client;

public class PaymentClient 
{
	public static void main(String[] args) 
	
	{
		Payment a = Payment.getPayment();
		Payment b = Payment.getPayment();
		Payment c = Payment.getPayment();
		
		a.pay(10000);
		b.pay(800);
		
		

	}

}
