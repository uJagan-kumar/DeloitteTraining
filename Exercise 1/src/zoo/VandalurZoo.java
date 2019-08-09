package zoo;

import org.animals.*;

public class VandalurZoo 
{

	public static void main(String[] args) 
	{
		Lion l = new Lion();
		l.is();
		l.isVegetarian();
		l.canClimb();
		l.getSound();
		
		Elephant e = new Elephant();
		e.is();
		e.isVegetarian();
		e.canClimb();
		e.getSound();
		
		Monkey m = new Monkey();
		m.is();
		m.isVegetarian();
		m.canClimb();
		m.getSound();
	}

}
