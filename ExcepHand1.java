import java.util.*;
public class ExcepHand1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String ans="";
		try
		{
			System.out.println("Enter no.1");
			int a=scan.nextInt();
			int b=scan.nextInt();
			int c=a/b;
			System.out.println("C = a/b : "+c);
			ans="out";
					try
						{
								ans="";
								c=b/a;
								System.out.println("C = b/a : "+c);
								ans="out";
						}
					catch(Exception e)
					{
						System.out.println(" nested try error "+e.toString());
					}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Error "+e.toString());
		}
		catch(InputMismatchException e)
		{
			System.out.println("Input Wrong please enter only number");
		}
		finally
		{
			System.out.println("Program finished with"+ans+" error");
		}
		scan.close();
	}
}
