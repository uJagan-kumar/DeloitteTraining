package strings;

import java.util.StringTokenizer;

public class Demo3 
{
     public static void main(String[] args) 
     {
	    
	    String quote="Once,upon,a,time,in,hollywood";
	    StringTokenizer token = new StringTokenizer(quote,",");
	    System.out.println(token.countTokens());
	    String[] arr= new String[token.countTokens()];
	    int i=0;
	    while(token.hasMoreTokens())
	    {
	    	
	    	arr[i]= token.nextToken();
	    	i++;
	    	
	    }
	    
	    for(int j=i-1;j>=0;--j)
    	{
    		System.out.println(arr[j]);
    	}
	   
	 } 
}
