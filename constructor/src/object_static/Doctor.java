package object_static;

public class Doctor 
{
	String doctorName;
	int fees;
	static int noOfDocs =0;
	
	public Doctor(String doctorName, int fees) 
	{
		
		this.doctorName = doctorName;
		this.fees = fees;
		noOfDocs++;
	}

	public Doctor(String doctorName) 
	{
	
		this.doctorName = doctorName;
		noOfDocs++;
	}

	public Doctor(int fees) 
	{
		
		doctorName = "NA";
		this.fees = fees;
		noOfDocs++;
	}

	public Doctor() 
	{
		doctorName= "NA";
		fees = 10000;
		noOfDocs++;
	}
	
	public void doctorDetails()
	{
		System.out.println(doctorName+" "+fees+" ");
	}
	
	public static void main(String[] args) 
	{
		Doctor d1 = new Doctor("Jack",40000);
		Doctor d2 = new Doctor("Jack");
		Doctor d3 = new Doctor(40000);
		Doctor d4 = new Doctor();
		d1.doctorDetails();
		d2.doctorDetails();
		d3.doctorDetails();
		d4.doctorDetails();
		
		System.out.println(noOfDocs);
	}

}
