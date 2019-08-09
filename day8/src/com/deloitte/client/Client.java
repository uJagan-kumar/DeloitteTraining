package com.deloitte.client;

import java.sql.SQLException;
import java.util.Scanner;


import com.deloitte.customer.CustomerJdbcOperations;

public class Client 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		System.out.println("Menu");
		System.out.println("\n1. Printing customer details \n2. Inserting customer values");
		
		System.out.println("Choose your option 1.Print all records 2.Insert records 3. Insert through Ps");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option==1)
		{
			CustomerJdbcOperations.printStudentRecords();
		}
		else if(option==2)
		{
			CustomerJdbcOperations.insertStudentRecords();
		}
		else if(option==3)
		{
			CustomerJdbcOperations.insertStudentRecordsThruPs();
		}

	}

}
