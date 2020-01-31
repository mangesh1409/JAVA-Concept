class Demo
{
	public int i;
	public int j;
	
	public Demo()
	{
			System.out.println("Inside Default Constructor...");
			this.i=0;
			this.j=0;
	}
	public void Demo()		
	{
		System.out.println("Inside Method of a Class Demo...");

	}
	public Demo(int x,int y)
	{
		System.out.println("Inside  parameter constructor with interger as a parameter  gets called...");
		this.i=x;
		this.j=y;
	}
}

class ConstructorDemo
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();			// default constructor gets called
		Demo d2 = new Demo(10,11);		// one parameter constructor with interger as a parameter  gets called
		Demo d3=d2;					// Shallo copy
		d1.Demo();						// this method gets called
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
	}
}
