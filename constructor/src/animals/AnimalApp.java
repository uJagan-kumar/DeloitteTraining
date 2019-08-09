package animals;

public class AnimalApp 
{
	public void eats()
	{
		System.out.println("The animal eats other animals");
	}
	
	public static void main(String[] args) 
	{
		
			Cat cat = new Cat();
			cat.eats();
	}

}
