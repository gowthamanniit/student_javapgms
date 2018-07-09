package com.niit;

public class GenericsAdvanced<NAVIN,TAMIL> {
	TAMIL high;
	void display(NAVIN a,TAMIL b)
	{
		//System.out.println(high);
		if(high.hashCode()<b.hashCode())
			high=b;
		
		System.out.println(" a value :"+a+" accepted "+a.getClass().getSimpleName());
		System.out.println(" b value :"+b+" accepted "+b.getClass().getSimpleName());
	}
	public static void main(String[] args) {

		GenericsAdvanced<String, Integer> ob1=new GenericsAdvanced<String,Integer>();
		GenericsAdvanced<String, Integer> ob2=new GenericsAdvanced<String,Integer>();
		GenericsAdvanced<String, Integer> ob3=new GenericsAdvanced<String,Integer>();
		
		
		ob1.display("sasi",55);
		ob2.display("navin",65);
		ob3.display("tamil",53);
	}

}
