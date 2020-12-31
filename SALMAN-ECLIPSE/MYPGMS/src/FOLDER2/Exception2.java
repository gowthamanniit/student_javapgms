package FOLDER2;
import java.util.Scanner;
class TestExcep
{
	Scanner scan=new Scanner(System.in);
	boolean test=false;
	TestExcep()	
	{
		try
		{
		System.out.println("Enter age:");
		int age=scan.nextInt();
		if(age>=18)
			System.out.println("Accepted age:");
		else
			
		{
				//CUSTOM EXCEPTION OR USER DEFINED EXCEPTION
			throw new Exception("invalid age not accept");
		}
		}
		catch(Exception e)
		{
			test=true;
			System.out.println(e.toString());
		}		
		finally
		{
			if(test==true)
			{
			System.out.println("Program Finished with error");
			test=false;
			new TestExcep();
			}
			else
			{
			System.out.println("Program Finished without error");
			}
		}
	}
}
public class Exception2 {
	public static void main(String[] args) {
		new TestExcep();
	}
}