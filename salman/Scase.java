class Scase
{
	public static void main(String args[])
	{
	int a,b,ch;
	ch=3;
	a=10;
	b=5;
	  switch(ch)
	  {
		case 1:
			System.out.println("addtion ="+(a+b));
			break;
		case 2:
			System.out.println("subtraction ="+(a-b));
			break;
		case 3:
			System.out.println("multiplication ="+(a*b));
			break;
		case 4:
			System.out.println("division ="+(a/b));
			break;		
		case 5:
			System.out.println("remainder ="+(a%b));
			break;		
		default:
			System.out.println("enter correct choice only");	   
	  }
	}
}
