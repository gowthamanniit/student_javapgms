/* 
String function: (built in)
String : immutable
StringBuffer: mutable
*/
class StrFun
{
 public static void main(String args[])
 {
  String name="salmAN Quraish";
  int ans=name.length();
  System.out.println(" length of name = "+ans);

  System.out.println(" full caps : "+name.toUpperCase());
  System.out.println(" full small: "+name.toLowerCase());
  System.out.println(" name  = "+name);  // immutable
  System.out.println(" index of 3 : "+name.charAt(3));

  for(int i=0;i<ans;i++)
  {
    System.out.println("  index : "+i+"    "+name.charAt(i));
  }

  System.out.println(" find index : "+name.indexOf('A'));

  String t="  gowthaman  ";
  System.out.println(" trim  before    :"+t.length());
  t=t.trim();
  System.out.println(" trim after       :"+t.length());

  System.out.println(" substring      :"+t.substring(3));
  System.out.println(" substring      :"+t.substring(3,6));

  System.out.println(" replace         :"+t.replace("a","o"));

 String k1="karur";
 String k2="KARUR";

 System.out.println(k1==k2);

k1="karur";
k2="karur";
 System.out.println("answer = "+k1==k2);
 System.out.println("answer = "+k1!=k2);
 System.out.println("answer = "+(k1==k2));
 
k1="GOWTHAMAN";
k2="gowthaman";

System.out.println(k1.equals(k2));
System.out.println(k1.equalsIgnoreCase(k2));


System.out.println("G".hashCode());
System.out.println("g".hashCode());
System.out.println(k1.compareTo(k2));  
System.out.println(k2.compareTo(k1));  

System.out.println(k1.compareToIgnoreCase(k2));
/*
   A-65
   B=66
   c=67
      
   Z=90

   a=97
   z=122
*/


   String s1="45";
   System.out.println(s1);

 //  any datatype to String
 //  45+""  or ""+45

   // String to int
    int i=Integer.parseInt("45");
   System.out.println(" string to int : "+i);

  // String to float

  float f=Float.parseFloat("123.2342");
   System.out.println(" string to float : "+f);

 // String to char array
   String s="gowthaman";
   char c[]=s.toCharArray();
 
  for(i=0;i<s.length();i++)
 {
    System.out.println(c[i]);
 }
   

 }
}