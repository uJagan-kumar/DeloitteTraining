package strings;

import java.io.File;
import java.io.IOException;

public class Demo2 
{

	public static void main(String[] args) throws IOException 
	{
		File file2 = new File("C:\\Deloitte\\batch");
		file2.mkdirs();
		
		File file6 = new File("C:\\Deloitte\\corejava");
		
		
		File file3 = new File("C:\\Deloitte\\batch\\batch2");
		file3.mkdirs();
		
		File file4 = new File("C:\\Deloitte\\batch\\batch3");
		file4.mkdirs();
		
		File file1= new File("C:\\Deloitte\\batch\\batchmates.txt");
		file1.createNewFile();
		
		File file5= new File("C:\\Deloitte\\batch\\batchmates2.txt");
		file5.createNewFile();
		
		File allFiles[] =file6.listFiles();
		for( File temp:allFiles)
		{
			if(temp.isDirectory())
			{
				System.out.println(temp+" is directory");
			}
			else
			{
				System.out.println(temp+" is file");
			}
					
		}
	
		
				

	}

}
