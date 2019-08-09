package day7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Props 
{

	public static void main(String[] args) throws IOException 
	{
		Properties prop =new Properties();
		FileReader reader = new FileReader("c:\\Deloitte\\Details.properties");
		prop.load(reader);
		
		System.out.println(prop.get("username2"));
		System.out.println(prop.get("password"));
		System.out.println(prop.get("url"));
		System.out.println(prop.get("driver"));
		System.out.println(prop);

	}

}
