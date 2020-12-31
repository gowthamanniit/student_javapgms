/*string handling

  String text="gowthaman";
 String t1=scan.next();
 String t2=scan.nextLine();

*/

class StrHandle
{
   public static void main(String args[])
   {
	String k1="gowthaman";

	int m1=70;
	int m2=100;

	System.out.println(k1+m1+m2);
	System.out.println(k1+"   "+m1+"    "+m2);
System.out.println("name = "+k1+"\n mark1 =  "+m1+" \n mark2 =    "+m2);	
	System.out.println(m1+m2+k1);
	System.out.println(m1+(m2+k1));
	System.out.println(k1+(m1+m2));

	System.out.println("name = "+k1);
	System.out.println(k1+" scored "+(m1+m2)+" marks");
   }
}