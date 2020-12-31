package Folder3_File;

class StaticTest
{
	static int k=20;
	int s=20;
	void dis()
	{
		System.out.println(++k);	
		System.out.println(++s);
	}
}

public class Stmem {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticTest st=new StaticTest();
		st.dis();
		StaticTest st1=new StaticTest();
		st1.dis();
		StaticTest st2=new StaticTest();
		st2.dis();
		
		
		
	}

}
