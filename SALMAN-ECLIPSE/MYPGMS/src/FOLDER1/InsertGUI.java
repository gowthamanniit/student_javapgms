package FOLDER1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class InsertDB extends JFrame implements ActionListener
{
	JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JTextField t1,t2,t3;
	InsertDB()
	{
		setTitle("Databae Insert");
		setLayout(null);
		l1=new JLabel("Enter Empno:");
		l2=new JLabel("Enter Empname:");
		l3=new JLabel("Enter Empsalary:");
		t1=new JTextField(20);
		t2=new JTextField(20);
		t3=new JTextField(20);
		
		
		
		b1=new JButton("Insert");
		b2=new JButton("Search");
		b3=new JButton("Clear");		
		
		l1.setBounds(100,100,100,30);t1.setBounds(200,100,100,30);
		l2.setBounds(100,200,100,30);t2.setBounds(200,200,100,30);
		l3.setBounds(100,300,100,30);t3.setBounds(200,300,100,30);
		
		b1.setBounds(100,400,100,30);
		b2.setBounds(200,400,100,30);
		
	
		b1.addActionListener(this); // calling
		b2.addActionListener(this); // calling

		
		add(l1);add(l2);add(l3);
		
		add(t1);add(t2);add(t3);
		add(b1);add(b2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int eno=Integer.parseInt(t1.getText());
		String ename=t2.getText();
		int esal=Integer.parseInt(t3.getText());
		
		if(ae.getSource()==b1) // insert
		{
			try
			{
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				//System.out.println("sql driver accepted");
	Connection con=DriverManager.getConnection("jdbc:sqlserver://localhost\\sqlexpress;database=emp", "sa", "789");
				//System.out.println("connection success");
				
				Statement st=con.createStatement();
			int ans=st.executeUpdate("insert into edetails values("+eno+",'"+ename+"',"+esal+")");
			if(ans==1)
				JOptionPane.showMessageDialog(null,"successfully inserted");
			t1.setText("");
			t2.setText("");
			t3.setText("");
				st.close();
				con.close();				
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(null,"error= "+e.toString());
			}
			
		}
		if(ae.getSource()==b2)  // search
		{
			
		}
	}
}
public class InsertGUI {
	public static void main(String[] args) {
		JFrame f1=new InsertDB();
		f1.setSize(500,600);
		f1.setVisible(true);
	}
}