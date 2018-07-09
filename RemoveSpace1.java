
public class RemoveSpace1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text=" Mallow Technologies        private          ltd     ";
		int l=text.length();
		System.out.println("length:"+l);
	
		char c[]=new char[l];
		c=text.toCharArray();
		
		String ans="";
		for(int i=0;i<l-1;i++)
		{
			//System.out.println(text.charAt(i));
			//System.out.println(c[i]);
			if(!(c[i]==' ' && c[i+1]==' '))
			{
				ans=ans+c[i];
			}			
		}
		System.out.println("Final answer:"+ans+":");
	}

}
