package strings;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite 
{
	public static void main(String[] args) throws IOException 	
	{
		int i =0;
		
		FileWriter fw =new FileWriter("c:\\Deloitte\\batch\\batchmates.txt");
		fw.write("have i written something");
		fw.close();
		
		FileReader fr= new FileReader("c:\\Deloitte\\batch\\batchmates.txt");
				while((i=fr.read())!=-1)
				{
					System.out.print((char)i);
				}
		

	}
}
