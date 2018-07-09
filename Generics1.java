package com.niit;

public class Generics1<NAV> {  // Generics SYNTAX for create

	NAV a;   				   // Generics variable declaration (accept all type values)
	NAV b;
	void getinfo(NAV c,NAV d)
	{
		this.a=c;
		this.b=d;
	}
	void dispinfo()
	{
		System.out.println(" a value ="+a);
		System.out.println(" b value ="+b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generics1<Integer> ob1=new Generics1<Integer>();  // Generics Obj creation
		ob1.getinfo(33, 44);
		ob1.dispinfo();
		Generics1<String> ob2=new Generics1<String>();
		ob2.getinfo("navin", "tamil");
		ob2.dispinfo();
	}

}
