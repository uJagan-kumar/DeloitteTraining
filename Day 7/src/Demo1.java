import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		
		System.out.println("Choose your option 1.Print all records 2.Insert records");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		if(option==1)
		{
			printStudentRecords();
		}
		else if(option==2)
		{
			insertStudentRecords();
		}

	}

	private static void printStudentRecords() throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		Statement statement = connection.createStatement();
		ResultSet res = statement.executeQuery("select * from hr.stu");
		while(res.next())
		{
			System.out.println(res.getString(1)+" ");
			System.out.println(res.getString(2));
		}
	}

	private static void insertStudentRecords() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = 
				DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		Statement statement = connection.createStatement();
		int noOfRecords = statement.executeUpdate("insert into hr.stu values(100,'Sathish')");
		System.out.println(noOfRecords+ " affected");
	}
}
