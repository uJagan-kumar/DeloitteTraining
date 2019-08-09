package constructor;

public class Demo1 
{
	int i =100;
	public Demo1()
	{
		 
		System.out.println(i);
	
	}
	
	public static void main(String  []args)
	{
		Demo1 a = new Demo1();
		System.out.println("The value is: "+a.i);
	}
}