class StringDemo
{
	public static void main(String args[])
	{
		char arr[]={'a','b','c','d'};
		String s1=new String(arr);
		System.out.println(s1);
		
		String s2="ABCD";
		System.out.println(s2);
		
		String s3=new String("pqrs");
		System.out.println(s3);
		
		String s = "hello java";
		s = s.substring(0,5)+"world";		
		System.out.println(s);
	}


}
