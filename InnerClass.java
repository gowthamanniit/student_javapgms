package com.niit;

import com.niit.Navin;

class Navin  // outter class
{
		int a=10;
	void display1()
	{
		class Tamil   // method local - inner class
		{
			int b=20; //dont use outside the class
			void display2()
			{
				System.out.println(" a ="+a);
				System.out.println(" b ="+b);
			}			
		}	
		Tamil obj=new Tamil();
		obj.display2();
	}
}
public class InnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Navin obj1=new Navin();
	  obj1.display1();		
	}
}
