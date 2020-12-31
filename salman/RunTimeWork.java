import java.util.Scanner;
class RunTimeWork
{
  public static void main(String args[])
  {
	Scanner scan=new Scanner(System.in);
	System.out.print("enter your name:");
	String name=scan.nextLine();
	System.out.print("Enter Your Mark:");
	int mark=scan.nextInt();
	System.out.print("Enter Your Height:");
	float hei=scan.nextFloat();
System.out.println("Enter your initial:");
char i=scan.next().charAt(0);

System.out.println(" name   = "+name+"."+i);	
	System.out.println(" mark   = "+mark);	
	System.out.println(" height = "+hei);	
	scan.close();
  }
}	