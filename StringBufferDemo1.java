class StringBufferDemo1
{
	public static void main(String args[])
	{
		StringBuffer sb1 = new StringBuffer();	// empty StringBuffer with default capacity of 16 bytes 
		StringBuffer sb2 = new StringBuffer("this is paratemerised constructor String");	// paratemeterized constructor.
		StringBuffer sb3 = new StringBuffer(10);	// this constructor is used to create empty string with size of 20 bytes.
		System.out.println(sb3.capacity());		
		System.out.println("..... Demonstration of Default Constructor......");
		//	sb1= "hello world";	// you cannot direclty assign a string to an object
		// instead you have to use append() method.				
		sb1.append("this is 16bytes");
		System.out.println(sb1);
		System.out.println(sb1.capacity());
		System.out.println("\n..... Demonstration of parameterized Constructor......\n");
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		System.out.println("\n..... Demonstration of user defined size Constructor......\n");
		sb3.append("hello world is less than 20");	
		System.out.println(sb3);
		System.out.println(sb3.capacity());
	
	}
}
