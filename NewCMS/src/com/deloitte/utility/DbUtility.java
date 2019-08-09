package com.deloitte.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility 
{
	    public static Connection getMyConnection() {
		Connection connection = null;
		Properties prop =new Properties();
		FileReader reader = null;;
		try 
		{
			reader = new FileReader("c:\\Deloitte\\Details.properties");
		} 
		
		catch (FileNotFoundException e2) 
		{
			
			e2.printStackTrace();
		}
		
		try 
		{  prop.load(reader);  } 
		
		catch (IOException e1) 
		
		{  e1.printStackTrace(); }
		
		String username = prop.getProperty("username");
		
		String password = prop.getProperty("password");
		String url = prop.getProperty("url");
		String driver = prop.getProperty("driver");
		
		try 
		{
			Class.forName(driver);
			connection = DriverManager.getConnection(url, username,password);
		} 
		
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return connection;
	}
}
