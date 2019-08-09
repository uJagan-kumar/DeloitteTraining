package com.deloitte.client;

public class Payment 
{
   private Payment()
   {
	   System.out.println("Object of payment created");
   }
   
   static Payment payment = new Payment();
   
   public static Payment getPayment()
   {
	   return payment;
   }
   
   public void pay(int amount)
   {
	   System.out.println("Payment of INR" +amount +" received");
   }
   
}
