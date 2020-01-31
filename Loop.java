class Loop
{
	public static void main(String args[])
	{
		System.out.println("For Loop");
		for(int i=0;i<=10;i++)
		{
			System.out.print(i);
		}
		System.out.println();
		
		System.out.println("While Loop");
		int no=1;
		while(no<=10)
		{
			System.out.print(no);
			no++;
		}
		System.out.println();
		
		System.out.println("do while Loop");
		int j=0;
		do
		{
			System.out.print(j);
			j++;
		}while(j<=10);
		System.out.println();
		
		System.out.println("For each Loop");
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		for(int no1:arr)
		{
			System.out.print(no1);
		}		
	}
}
