package FOLDER2;
import java.util.Date;
/*class RunnableDemo  implements Runnable 
{	
	public void run()  
	{		
		for(int i=1;i<=10;i++)
		{
		System.out.println("\r this is runnable interface "+new Date());
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e) {}		
		}
	}	
}*/
public class RunnableWork {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	RunnableDemo rd=new RunnableDemo();		
		Thread t1=new Thread(rd);
		t1.start();
		*/
		//======================or================================
		Runnable r1=new Runnable() {
			public void run()
			{
				System.out.println("basic method");
			}
		};
		
		Thread t2=new Thread(r1);
		t2.start();
		//======================or================================
	
		Thread t1=new Thread(new Runnable() {
			public void run()
			{
				System.out.println("Runnable interface using anonymous");
			}
		});		
		t1.start();	
	}
}