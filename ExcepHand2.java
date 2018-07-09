import java.io.*;
import java.util.Random;
public class ExcepHand2 {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//for(;;)
		while(true)
		{
		try
		{
		Random rn=new Random();
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("Enter number 0 to 10:");
			int n=Integer.parseInt(dis.readLine());
			int k=rn.nextInt(10);
		System.out.println("Computer Thinking number:"+k);
		if(n==k)
		{
		System.out.println("Success Game Finished");
		System.exit(0);
		}
		else
			throw new Exception("Input is Wrong Please Try Again: ");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		}
	}
}
