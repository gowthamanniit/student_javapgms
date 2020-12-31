package FOLDER1;
interface father
{
	int cash1=50000;  // final var 
	void display1(); // incomplement method
}
interface Mother
{
	int cash2=30000;    // final or contant var  
	void display2();  // incomplete method
}
class son implements father,Mother
{
	public void display1()
	{
		System.out.println(cash1);	
		System.out.println(cash2);
	}
	public void display2()
	{
		System.out.println(cash1);	
		System.out.println(cash2);
	}
}
public class IFace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		son s=new son();
		s.display1();
		s.display2();
	}
}
