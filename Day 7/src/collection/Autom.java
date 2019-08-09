package collection;

import java.util.LinkedList;
import java.util.List;

public class Autom 
{
  public static void main(String[] args) 
  {
	  List a = new LinkedList();
	  a.add("first");
	  a.add("second");
	  a.add("third");
	  a.add("fourth");
	  a.add(2, "fifth fuck third");
	  a.add(2, "let's put third back");
	  a.remove(3);
	  System.out.println(a);

	  
  }
  
}
