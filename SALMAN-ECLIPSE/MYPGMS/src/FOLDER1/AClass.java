package FOLDER1;
abstract class TeacherClass1
{
	int k;
	abstract void display();  // incomplete method	 (must use in derive class)
	void disp()    // complete method (no need to use derive class)
	{
		k=20;
	}	
}

class StudentClass extends TeacherClass1
{
	void display()
	{	
		disp();
		k=k+20;			
		System.out.println(" override abstract method :"+k);
	}	
}
public class AClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentClass s=new StudentClass();
		s.display();		
}
}
