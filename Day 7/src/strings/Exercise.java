package strings;

public class Exercise 
{
	public static void main(String[] args) 
	{
		String str1 ="The quick brown fox jumped over the lazy dog";
		System.out.println(str1);
		System.out.println(str1.charAt(12));
		System.out.println(str1.contains("is"));
		System.out.println(str1.concat(" and killed it"));
		System.out.println(str1);
		System.out.println(str1.endsWith("dogs"));
		String str2 ="The quick brown fox jumped over the lazy dog";
		String str3 = str2.toUpperCase();
		System.out.println(str3.equals(str1));

		System.out.println(str1.equals(str2));
		System.out.println(str1.length());
		System.out.println(str1.replace("The","A"));
		System.out.println(str3);
		System.out.println(str1.toLowerCase());
		System.out.println(str1.indexOf("a"));
		System.out.println(str1.lastIndexOf("e"));

		
		
		
		

	}
}
