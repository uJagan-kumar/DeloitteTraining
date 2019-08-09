package com.deloitte.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.deloitte.client.DbUtility;

public class CustomerJdbcOperations 
{
     public static void printStudentRecords() throws ClassNotFoundException, SQLException 
     {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from hr.customers");
		while(res.next())
		{
			System.out.print(res.getString(1)+" ");
			System.out.print(res.getString(2)+" ");
			System.out.print(res.getString(3)+" ");
			System.out.print(res.getString(4) +"\n");
			
		}
     }
     
     public static void insertStudentRecords() throws ClassNotFoundException, SQLException 
     {
 		
 		Statement statement = DbUtility.getMyConnection().createStatement();
 		
 		
 		Scanner sc = new Scanner(System.in);

 		System.out.println("1. Enter Id\n");
 		int customerId = sc.nextInt();
 		
 		System.out.println("2.Enter Address\n");
 		String customerAddress = sc.next();
 		
 		
 		System.out.println("3.Enter Name\n");
 		String customerName = sc.next();
 		
 		
 		System.out.println("4.Enter bill amount\n");
 		int billAmount = sc.nextInt();
		
 		int noOfRecords = statement.executeUpdate("insert into hr.customers values("+customerId+ ",'" +customerAddress+"', '" +customerName+"'," +billAmount+")");
 		System.out.println(noOfRecords+ " affected");
 	 }
     
     public static void insertStudentRecordsThruPs() throws ClassNotFoundException, SQLException 
     {
 		
 		PreparedStatement statement = DbUtility.getMyConnection().prepareStatement("insert into hr.customers values(?,?,?,?)");
 		
 		
 		Scanner sc = new Scanner(System.in);

 		System.out.println("1. Enter Id\n");
 		int customerId = sc.nextInt();
 		
 		System.out.println("2.Enter Address\n");
 		String customerAddress = sc.next();
 		
 		
 		System.out.println("3.Enter Name\n");
 		String customerName = sc.next();
 		
 		
 		System.out.println("4.Enter bill amount\n");
 		
 		int billAmount = sc.nextInt();
 		statement.setInt(1, customerId );
 		statement.setString(2, customerAddress);
 		statement.setString(3, customerName);
 		statement.setInt(4, billAmount);
 		
 		
		
 		int noOfRecords = statement.executeUpdate();
 		System.out.println(noOfRecords+ " affected");
 	 }
     
     public static void deleteStudentRecordsThruPs() throws ClassNotFoundException, SQLException 
     {
 		
 		PreparedStatement statementCustomerId = DbUtility.getMyConnection().prepareStatement("delete from hr.customers where customerId= (?)");
 		PreparedStatement statementCustomerAddress = DbUtility.getMyConnection().prepareStatement("delete from hr.customers where customerAddress= (?)");
 		PreparedStatement statementCustomerName = DbUtility.getMyConnection().prepareStatement("delete from hr.customers where customerName= (?)");
 		PreparedStatement statementBillAmount = DbUtility.getMyConnection().prepareStatement("delete from hr.customers where billAmount= (?)");
 		
 		
 		Scanner sc = new Scanner(System.in);

 		System.out.println("1. Enter Id\n");
 		int customerId = sc.nextInt();
 		
 		System.out.println("2.Enter Address\n");
 		String customerAddress = sc.next();
 		
 		
 		System.out.println("3.Enter Name\n");
 		String customerName = sc.next();
 		
 		
 		System.out.println("4.Enter bill amount\n");
 		
 		int billAmount = sc.nextInt();
 		statementCustomerId.setInt(1, customerId );
 		statementCustomerAddress.setString(2, customerAddress);
 		statementCustomerName.setString(3, customerName);
 		statementBillAmount.setInt(4, billAmount);
 		
 		
		
 		int noOfRecords = statementCustomerId.executeUpdate();
 		int noOfRecords2 = statementCustomerAddress.executeUpdate();
 		int noOfRecords3 = statementCustomerName.executeUpdate();
 		int noOfRecords4 = statementBillAmount.executeUpdate();
 		
 		if(noOfRecords!=0)
 				System.out.println(noOfRecords+ " affected");
 		if(noOfRecords2!=0)
				System.out.println(noOfRecords2+ " affected");
 		if(noOfRecords3!=0)
				System.out.println(noOfRecords3+ " affected");
 		if(noOfRecords4!=0)
				System.out.println(noOfRecords4+ " affected");
 	 }
}
