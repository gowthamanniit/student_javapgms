	class Stud
	{
		private float m1,m2,tot;
		float display(float a,float b)
		{
		m1=a;
		m2=b;
		tot=m1+m2;
		return tot;
		}
	}
	class Student
	{
	public static void main(String args[])
	{
	Stud s1=new Stud();

  float ans=s1.display(8.343f,9.343f); // with arg with retrun	
	
	System.out.println(" total = "+ans);

	}
	}
