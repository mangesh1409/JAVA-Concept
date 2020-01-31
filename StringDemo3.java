import java.lang.*;
class StringDemo3
{
	public static void main(String args[])
	{
		String s1 = "Educating for better tommorrow";
		String s2 = new String("to upper");
		String s3 = new String("To LOWER");
		String s4 = "Hello";
		System.out.println("\n...........Demonstraiton of toUpperCase()..........\n");
		System.out.println(s2+" : is changed to : "+s2.toUpperCase());
		
		System.out.println("\n...........Demonstraiton of toLowerCase()..........\n");
		System.out.println(s3+" : is changed to : "+s3.toLowerCase());
		
		System.out.println("\n...........Demonstraiton of indexOf()..........\n");
		System.out.println("index of l in hello is : "+s4.indexOf('l'));
		
		System.out.println("\n...........Demonstraiton of lastIndexOf()..........\n");
		System.out.println("Last index of l in hello is : "+s4.lastIndexOf('l'));
	}
}	
