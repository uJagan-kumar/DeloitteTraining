package addition;
import java.util.Scanner;

public class Addition 
{

	int a=0;
	int b=0;
	Scanner sc = new Scanner(System.in);
	public void main(String[] args) 
	{
		
		System.out.println("Enter a varible");
		a = sc.nextInt();
		
		System.out.println("Enter a varible");
		b = sc.nextInt();
		
		System.out.println("The sum is :"+ (a+b) );
	}
	
	

}
