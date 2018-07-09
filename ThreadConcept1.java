class AThread extends Thread//implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println("A Thread   "+i);
			Thread.sleep(3000);
			}
		}
		catch(InterruptedException e)
		{
	System.out.println(e.toString());
		}
	}
	
}


public class ThreadConcept1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AThread obj=new AThread();
		//Thread t1=new Thread(obj);
		//t1.start();
		
		obj.start();
		
		
		try
		{
			
			//obj.join();
			//obj.getPriority();
			//Thread t1=new Thread();
			for(int i=1;i<=10;i++)
			{
				System.out.println("Main Thread  "+i);
			Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
	System.out.println(e.toString());
		}
	
		
	}

}
