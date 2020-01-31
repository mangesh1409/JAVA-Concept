class StringDemo2
{
	public static void main(String args[])
	{
		String s1 = "Educating for better tommorrow";
		String s2 = new String("Hello World");
		String s3 = new String("HELLO WORLD");
		System.out.println("\n...Demonstraiton of charAt() method....");
		System.out.println(s1.charAt(4));	
		System.out.println("\n");
		System.out.println("...Demonstraiton of length() method....");
		System.out.println("lenght of s1 : "+s1.length());
		System.out.println("\n");
		System.out.println("...Demonstraiton of equalsIgnoreCase() method....");
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("Both String are equal ignoring case..");
		}
		else
		{
			System.out.println("Both String are not equal..");
		}
		System.out.println("\n");	
	}
}
