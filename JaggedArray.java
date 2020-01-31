import java.util.*;

class JaggedArray
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Jagged Array");
		
		System.out.println("Enter number of rows");
		int iRow=sobj.nextInt();
		int arr[][]=new int[iRow][];
		
		for(int i=0;i<iRow;i++)
		{
			System.out.println("Enter number of Column for "+(i+1)+" row");
			int iCol=sobj.nextInt();
			arr[i]=new int[iCol];
		}
			
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter elements for "+(i+1)+" row");	
			System.out.println("Enter "+ arr[i].length  +" number :");
			int cnt=0;
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("Enter "+(cnt+1) +" number :");
				arr[i][j]=sobj.nextInt();
				cnt++;
			}
		}
		
		System.out.println("Entered elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
