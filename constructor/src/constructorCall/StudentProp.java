package constructorCall;

public class StudentProp 
{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fees;
		result = prime * result + marks;
		result = prime * result + studentId;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentProp other = (StudentProp) obj;
		if (fees != other.fees)
			return false;
		if (marks != other.marks)
			return false;
		if (studentId != other.studentId)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

	private int studentId;
	private String studentName;
	private int marks;
	private int fees;
	
	
	public StudentProp() 
	{
		studentId = 1;
		studentName = "NA";
		marks = 40;
		fees = 10000;
	}

	
	public StudentProp(int studentId, String studentName, int fees) 
	{
		this();
		this.studentId = studentId;
		this.studentName = studentName;
		this.fees = fees;
	}


	public StudentProp(String studentName, int fees) 
	{
		this();
		this.studentName = studentName;
		this.fees = fees;
	}


	public StudentProp(int studentId, String studentName, int marks, int fees) 
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		this.fees = fees;
	}

	public void display()
	{
		System.out.println(studentId+" "+studentName+" "+marks+" "+fees);
	}

	public static void main(String[] args) 
	{
		StudentProp a = new StudentProp();
		StudentProp b = new StudentProp(2,"Jack",90,8000);
		StudentProp c = new StudentProp(3,"Kate",4000);
		StudentProp d = new StudentProp(2,"Jack",90,8000);
        a.display();
        b.display();
        c.display();
        
        d.display();
        System.out.println(b.equals(d));
 
       
        
		
	}

}
