package childClass;

public class ExceptionH 

{
	int i=0;
	public void display()
	{
	    try 
	    {
			i=50/0;
		} 
	    
	    catch (ArithmeticException e) 
	    {
			System.out.println(e.getMessage());
		}
		catch (Exception e)
	    {
			System.out.println("e.getMessage");
	    }
	}	
	
	public static void main(String[] args) 
	{
		System.out.println("Main started");
		ExceptionH e = new ExceptionH();
		e.display();
		System.out.println("Main Ended");
	}
}
