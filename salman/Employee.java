class Emp
{
	int eno;
	String ename;
	float esal;
	void setDetails(int e,String n,float s)
	{
	eno=e;
	ename=n;
	esal=s;
	}
	Emp display()
	{
	Emp e3=new Emp();
	e3.eno=eno+10;
	e3.ename=ename+" Karur";
	e3.esal=esal+(esal*10/100);
	return e3;
	}
}
class Employee
{
 public static void main(String args[])
 {
	Emp e1=new Emp();
	Emp e2=new Emp();

	e1.setDetails(1001,"raja",9000.34f);
	e2.setDetails(1002,"abi",9799.44f);

	e1=e1.display();
	System.out.println(e1.eno);
	System.out.println(e1.ename);
	System.out.println(e1.esal);		

	e2=e2.display();
	System.out.println(e2.eno);
	System.out.println(e2.ename);
	System.out.println(e2.esal);		

 }
}

