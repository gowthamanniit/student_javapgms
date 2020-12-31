package FOLDER2;
class ThreadDemo extends Thread 
{
	public void run()
	{
		System.out.println("Thread Called");
		for(int i=1;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+"  "+i);
			try
			{
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(" error ");
			}
		}
	}	
}
public class ThreadWork {
	public static void main(String[] args)throws Exception {
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();		
		ThreadDemo t3=new ThreadDemo();
		t1.setName("ram");
		t2.setName("kumar");
		t3.setName("abi");		
		t1.start();		
		t1.join();
		t2.start();
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());			
		
		t2.join();
		t3.start();
	}
}
