import java.sql.*;
import java.util.*;
public class NavinDataBase {

	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter Roll no:");
		int roll=scan.nextInt();
		System.out.print("Enter name:");
		String name=scan.next();
		System.out.print("Enter mark:");
		int mark=scan.nextInt();
		
		try
		{
		Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		Connection con=DriverManager.getConnection("jdbc:ucanaccess://D:/JAVAPGMS/12to2/Student.accdb");
		Statement st=con.createStatement();
		int ans=st.executeUpdate("INSERT INTO marklist(regno,name1,mark) VALUES("+roll+",'"+name+"',"+mark+")");
		System.out.print(ans);
		/*while(rs.next())
		{
		System.out.print("  "+rs.getInt("regno"));
		System.out.print(" "+rs.getString("name1"));
		System.out.println(" "+rs.getInt("mark"));
		}*/
		//rs.close();
		st.close();
		con.close();
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("driver class not found");
		}
		catch(SQLException e)
		{
			System.out.println("sql query or filename error "+e.toString());
		}
		//Connection con=DriverManager.getConnection("JDBC:ODBC:NAVIN","","");
		//Statement st=con.createStatement();
		//int ans=st.executeUpdate("DELETE FROM marklist where name1='"+name+"'");
		//int ans=st.executeUpdate("INSERT INTO marklist VALUES("+roll+",'"+name+"',"+mark+")");
		/*int ans=st.executeUpdate("UPDATE marklist SET mark="+mark+" where regno="+roll);
		System.out.println(ans);
		if(ans>0)
		{
			System.out.println("successfully inserted");
		}
		else
		{
		System.out.println("error");	
		}*/
		
		/*while(rs.next())
		{
		//	System.out.print(" "+rs.getInt(1));
			System.out.print(""+rs.getString(2));
			//System.out.println("mark   "+rs.getInt(3));
		}*/
		//rs.close();
		//st.close();
		//con.close();
	}
}
