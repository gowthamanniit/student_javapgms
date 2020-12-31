package FOLDER1;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;


/*
 * Event MOdel:
           3 types
           	1) Event Source(obj)         -- object .....ex: JButton b1, JTextField t1,....
           	2) Event Listener(calling)    -- interface --ex: b1.addActionListener(this)
           	3) Event Handler(called)     -- method    --ex: public void actionPerfomed(ActionEvent ae)
           				def: is a method that is invoked by an event listener(calling).
 * */

class GUI3 extends JFrame implements FocusListener  
{	
	//JButton b1,b2,b3;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	GUI3()
	{
		setTitle("event handling");
		setLayout(null);
		l1=new JLabel("Enter No.1:");
		l2=new JLabel("Enter No.2:");
		l3=new JLabel("............");
		t1=new JTextField(20);
		t2=new JTextField(20);
		//t3=new JTextField(20);
		
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		
		
		//b1=new JButton("Add");
		//b2=new JButton("Sub");
		//b3=new JButton("Mul");		
		
		l1.setBounds(100,100,100,30);t1.setBounds(200,100,100,30);
		l2.setBounds(100,200,100,30);t2.setBounds(200,200,100,30);
		//b1.setBounds(100,300,100,30);
		//b2.setBounds(200,300,100,30);
		//b3.setBounds(300,300,100,30);
		
		l3.setBounds(100,400,100,30);//t3.setBounds(200,400,100,30);
		
		//b1.addActionListener(this); // calling
		//b2.addActionListener(this); // calling
		//b3.addActionListener(this); // calling
		
		add(l1);add(l2);add(l3);	
		//add(b1);add(b2);add(b3);
		add(t1);add(t2);//add(t3);
	}
	public void focusGained(FocusEvent fe) {		
		//l3.setText("cursor entered");		
	}
	public void focusLost(FocusEvent fe) {
		if(fe.getSource()==t2)
		{
			int v1=Integer.parseInt(t1.getText().trim());
			int v2=Integer.parseInt(t2.getText().trim());			
			l3.setText("TOtal = "+(v1+v2));
		}
	}

	/*public void actionPerformed(ActionEvent ae) // called
	{
		//JOptionPane.showMessageDialog(null,"Button Pressed");
		//String v1=t1.getText();
		int v1=Integer.parseInt(t1.getText().trim());
		//String v2=t2.getText();
		int v2=Integer.parseInt(t2.getText().trim());
		
		if(ae.getSource()==b1)
			t3.setText(v1+v2+"");
		if(ae.getSource()==b2)
			t3.setText(v1-v2+"");
		if(ae.getSource()==b3)
			t3.setText(""+(v1*v2));
			
	}*/	
}

public class EventHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f1=new GUI3();
		f1.setSize(600,700);
		f1.show();
	}

}
