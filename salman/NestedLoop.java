class NestedLoop
{
	public static void main(String args[])
	{
		int i,j;
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=1;j--)
			{
				if(j<=i)
				System.out.print("  "+i+","+j);
				else
				System.out.print("     ");

				//System.out.print(" * ");
				//System.out.print("  "+i);
				//System.out.print("  "+j);
				//System.out.print(i+j);
			}
			System.out.println();
		}

	}
}
/*

.  .  .  .  *
.  .  .  *  *
.  .  *  *  *
.  *  *  *  *
*  *  *  *  *

*/