
public class StringFunctions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		/*for( ;true;)
		{
			System.out.print(++i +""+ ++j+" ");
			if(i==30) break;
		}*/
		
		String text="naveen TAMIL  ";
		int len=text.length();	
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.charAt(5));
		System.out.println(text.indexOf('n'));
		System.out.println(text.lastIndexOf('n'));
		System.out.println(text.trim());
		System.out.println(text.substring(4));
		System.out.println(text.substring(4, 8));
		System.out.println(text.startsWith("na"));
		System.out.println(text.endsWith("IL"));
		System.out.println(text.concat(" gnana "));
		System.out.println(text.replaceAll("een", "uu"));
		
		String t1="sasi";
		String t2="SASI";
		
		System.out.println(t1.equals(t2));
		
		System.out.println(t1.equals(t2.toLowerCase()));
		
		System.out.println(t1.equalsIgnoreCase(t2));
		
		
		System.out.println(t1.compareTo(t2));
		System.out.println(t1.compareTo(t2.toLowerCase()));
		System.out.println(t1.compareToIgnoreCase(t2));
		t1=" ";
		System.out.println("ASCII VALUE="+t1.hashCode());
		
		t1="97";
		t2="3";
		
		String t3=t1+t2;
		System.out.println(t3);
		 
		int t4=Integer.parseInt(t1)+Integer.parseInt(t2);
					
		System.out.println(t4);
			
		int t5=44;
		
		String t6="STRING="+String.valueOf(t5);
		
		System.out.println(t6);
			
	}

}
