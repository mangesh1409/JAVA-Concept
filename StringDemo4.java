import java.lang.*;
class StringDemo4
{
	public static void main(String args[])
	{
		String s1 = "Educating for better tommorrow";
		String s2 = new String("to upper");
		String s3 = new String("To LOWER");
		String s4 = "Hello";
		System.out.println("\n...........Demonstraiton of replace()..........\n");
		System.out.println("Original String : "+s4);
		System.out.println("String after using replace method : "+s4.replace('l','i'));

		System.out.println("\n...........Demonstraiton of startsWith()..........\n");
		System.out.println("does s2 starts with to : "+s2.startsWith("to"));

		System.out.println("\n...........Demonstraiton of endsWith()..........\n");
		System.out.println("does s1 sends with row : "+s1.endsWith("row"));

		System.out.println("\n...........Demonstraiton of '+'..........\n");
		s2 = s2+s3;
		System.out.println(s2);
	}
}	
