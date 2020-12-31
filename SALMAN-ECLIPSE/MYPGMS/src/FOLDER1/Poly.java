package FOLDER1;
class CompileTime
{
  void area(int a)
  {
	  System.out.println("Area of square :"+(a*a));  
  }
  void area(int l,int b)
  {
	  System.out.println("Area of rectangle :"+(l*b));
  }
  void area(float r)
  {
	  System.out.println("pi value = "+Math.PI);
	  System.out.println("Area of circle :"+(Math.PI*r*r));
  }  
}
public class Poly {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileTime c1=new CompileTime();
		c1.area(3);
		c1.area(3.3f);
		c1.area(4,5);		
	}
}
