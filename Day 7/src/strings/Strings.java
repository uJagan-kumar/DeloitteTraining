package strings;

public class Strings 
{	
	
	public static void main(String[] args) 
	{
		String str1 ="murakami";
		String str2 =str1.concat("Haruki");
		str1 =null;
		System.out.println(str2);
		System.out.println(str2.startsWith("mura"));
		String str3 = str2.substring(3, 11);
		System.out.println(str3);
		System.gc();
		

	}
}
