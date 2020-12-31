class Test3
{
public static void main(String args[])
{
	int m1,m2,m3;
	float avg;
	String res="";

	m1=100;
	m2=88;
	m3=88;
	
	if(m1>49 && m2>49 && m3>49)
	{
	res="pass";
	}	
	else
	{
	res="fail";
	}

	avg=(m1+m2+m3)/3.0f;
	System.out.println("avg = "+avg);



if(res=="pass")
{ 
	if(avg>=85)
	{
	System.out.println(" grade outstanding ");
	System.out.println(" super ");
	}
	else if(avg>=75)
	System.out.println(" grade excellent");
	else if(avg>=50)
	System.out.println(" grade good");
	else
	System.out.println(" grade fair");
}
else
{
	System.out.println(" no grade because fail");
}
}
}