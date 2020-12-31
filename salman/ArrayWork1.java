import java.util.Scanner;
class ArrayWork1
{
	public static void main(String args[])
	{
	Scanner scan=new Scanner(System.in);

	System.out.print(" Enter size of the array:");
	int size=scan.nextInt();
	int a[]=new int[size];

	for(int i=0;i<size;i++)
	{
		System.out.println("enter array value at pos:"+i);
		a[i]=scan.nextInt();
	}	
	System.out.println(" Result Array:");

	for(int i=0;i<size;i++)
	{
	System.out.println(a[i]);
	}	
	scan.close();
	}
}