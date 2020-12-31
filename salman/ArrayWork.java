import java.util.Scanner;
class ArrayWork
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter row size:");
		int r=scan.nextInt();
		System.out.print("Enter col size:");
		int c=scan.nextInt();
		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
                                            System.out.println("enter array value at pos:"+i+j);
			a[i][j]=scan.nextInt();
 			}		
		}
		System.out.println(" Result Array :");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"   ");
 			}
			System.out.println();
		}

	scan.close();
	}
}