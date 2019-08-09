package model;
import java.util.Map;
import java.util.TreeMap;


public class Mapping 
{

	public static void main(String[] args) 
	{
      Map<Integer, String> data = new TreeMap<Integer, String>();
      
      data.put(123, "Tarun");
      data.put(153, "Varun");
      data.put(323, "karun");
      data.put(34, "Farun");
      
      System.out.println(data);
      for(Integer name :data.keySet())
      {
    	  System.out.println(name);
      }
      for(String name :data.values())
      {
    	  System.out.println(name);
      }
      


	}

}
