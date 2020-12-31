// no arg no return
/*
rule:1
 1) () - should be empty in both calling and called
 2) called method --> must use void	
                  --> don't use return
 3) calling method --> just only calling
		(no need to create var)

*/
// no arg with return
/*
rule:
 1) () - should be empty in both calling and called
 2) called method --> don't use void
		  --> must use datatype or classname
		  --> return must
 3) calling method --> must create one var.
		    ex:
		int ans=t.dis();
		  print ans
		or
		s.o.p(t.dis());
*/

/* with arg no return type

rule:
  1) () -->should not be empty in both calling and called method.
		calling --> only value or var
		called  --> must datatype 
  2) called method	
		must use void
		don't return
 3) calling method: 
                   just only calling	

*/
/*
with arg  with return type:

rule:
1)  () --> should not be empty in both calling and called method.
		calling --> only value or var
		called  --> must datatype 
2) called method.
		must use datatype or calssname
		return must
3) calling method.
		must create var to store return values.
		print(var).
	

*/



class Test
{
	int m1,m2,tot;
	int dis(int m,int n)  // called method
	{
		m1=m;
		m2=n;
		tot=m1+m2;
		return tot;
	}
}
class Test2
{
public static void main(String args[])
{
	Test t=new Test();
	int ans=t.dis(44,88);  // calling method 
	System.out.println(" answer = "+ans);

	int a=90;
	int b=80;
	ans=t.dis(a,b); // calling method
	System.out.println(" answer = "+ans);	
}
}