package app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


import model.Customer;

class CustomerApp2 
{
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		writeObjectFromFile();
	}
	
	private static void writeObjectFromFile() throws IOException, FileNotFoundException
	{
		FileOutputStream fileoutput = new FileOutputStream("newfile.txt");
		ObjectOutputStream stream= new ObjectOutputStream(fileoutput);
		Customer customer2 = new Customer(123,"Jackgsfd","Pune",10000);
		stream.writeObject(customer2);
		stream.close();
		System.out.println(customer2);
	}
}
