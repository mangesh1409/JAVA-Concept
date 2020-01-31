import java.util.*;

class Array
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("2 D Array");
		
		System.out.println("Enter number of rows");
		int iRow=sobj.nextInt();
		System.out.println("Enter number of Column");
		int iCol=sobj.nextInt();
		
		int arr[][]=new int[iRow][iCol];
		
		System.out.println("Enter "+ (iRow*iCol) +" elements");
		int cnt=1;
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				System.out.print("Enter "+ cnt +" number :");
				arr[i][j]=sobj.nextInt();
				cnt++;
			}
		}
		
		System.out.println("Entered elements:");
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0;j<iCol;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
