package database_File;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class DataBasePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("sql driver accepted");
Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;database=emp", "sa", "789");
			System.out.println("connection success");
			
			Statement st=con.createStatement();
			System.out.println("enter emp no to be search:");
			int eno=scan.nextInt();
			
			ResultSet rs=st.executeQuery("select * from edetails");
			
			boolean test=false;
			while(rs.next())
			{
				if(eno==rs.getInt(1))  // rs.getInt("eno")
				{
				test=true;
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getString("esal"));
				break;
				}
			}
			if(test==false)
			{
				System.out.println("not found");
			}
			rs.close();
			st.close();
			con.close();			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		
	}
}