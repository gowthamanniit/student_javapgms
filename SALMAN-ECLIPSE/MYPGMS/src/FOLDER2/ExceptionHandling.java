package FOLDER2;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);		
		try
		{
		System.out.println("Enter array size");
		int size=scan.nextInt();		
		int k[]=new int[size];
		System.out.println("Accepted array size");
		System.out.println("enter array index:");
		int index=scan.nextInt();
		k[index]=100;
		System.out.println("index postion accepted and 100 stroed");		
		}
		catch(InputMismatchException e)
		{
			System.out.println("Entered Mark is invalid");
			System.out.println(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array size is exceed");
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("do not give negative array size");
		}
		finally
		{
			System.out.println("program finished");		
		}
		scan.close();		
	}
}
