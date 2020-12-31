package FOLDER2;

interface if1
{
	void dis1();
}

public class AnonymousWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if1 i=new if1(){
			public void dis1()
			{
			System.out.println("anonymous class");	
			}			
		};
		
		i.dis1();
	}

}
