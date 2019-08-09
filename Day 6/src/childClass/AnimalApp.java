package childClass;



abstract class Animal 
{
	
	
    public abstract void makeNoise();
    public abstract void eat();
    public abstract void roam();
    public void sleep() 
    {
    	System.out.println("Animal sleeps for eight hours");
    }
	
	
}

abstract class Feline extends Animal 
{
	
	public void roam()
	{
		System.out.println("Animal roams like feline");
	}
}

class Hippo extends Animal 
{
	
	public void makeNoise() 
	{
		System.out.println("Animal makes Hippo sound");
	}
	
	public void eat() 
	{
		System.out.println("Animal eats like Hippo");
	}
	
	public void roam() 
	{
		System.out.println("Animal roams like Hippo");
	}
}

abstract class Canine extends Animal 
{
	
	public void roam()
	{
		System.out.println("Animal roams like Canine");
	}
}

class Lion extends Feline
{

	public void makeNoise() 
	{
		System.out.println("Animal makes Lion sound");
	}
	
	public void eat() 
	{
		System.out.println("Animal eats like Lion");
	}

}

class Tiger extends Feline
{

	public void makeNoise() 
	{
		System.out.println("Animal makes Tiger sound");
	}
	
	public void eat() 
	{
		System.out.println("Animal eats like Tiger");
	}

}

class Cat extends Feline
{

	public void makeNoise() 
	{
		System.out.println("Animal makes cat sound");
	}
	
	public void eat() 
	{
		System.out.println("Animal eats like cat");
	}

}

class Dog extends Canine
{

	public void makeNoise() 
	{
		System.out.println("Animal makes dog sound");
	}
	
	public void eat() 
	{
		System.out.println("Animal eats like dog");
	}

}

class Wolf extends Canine
{

	public void makeNoise() 
	{
		System.out.println("Animal makes wolf sound");
	}
	
	public void eat() 
	{
		System.out.println("Animal eats like wolf");
	}

}

class AnimalApp
{
	public static void main(String args[])
	{
	Lion l = new Lion();
	l.makeNoise();
	
	Hippo h = new Hippo();
	h.eat();
	}
	
}
