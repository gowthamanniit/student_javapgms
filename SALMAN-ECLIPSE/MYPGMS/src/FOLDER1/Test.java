package FOLDER1;

import java.util.Scanner;

class Student
{
	int rno;
	String name;	
	 Student(int r,String n)  // constructor with arg method
	 {
	  rno=r;
      name=n;
	 }
	 void dis()   // normal method
	 {
		  System.out.println("roll no:"+rno);
		  System.out.println("name   :"+name);
	 }
}
public class Test {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter roll number:");
		int rno=scan.nextInt();
		System.out.println("Enter Name:");
		String name=scan.next();
		
		Student s=new Student(rno,name);		
		s.dis();
		scan.close();
	}
}
