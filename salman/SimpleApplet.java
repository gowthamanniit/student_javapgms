//<applet code="SimpleApplet.class" width="500" height="600"></applet>
import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
public class SimpleApplet extends Applet implements ActionListener
{

	Button b1,b2;
	TextField t1;
	public void init()
	{	
		setLayout(null);
		Label l1=new Label("enter Your Name:");
		t1=new TextField(20);
		 b1=new Button("clickeme");
		 b2=new Button("clickeme");
		
		l1.setBounds(100, 100,100, 30);
		t1.setBounds(210, 100,100, 30);
		b1.setBounds(210, 250,100, 30);
		b2.setBounds(100, 250,100, 30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(l1);
		add(t1);		
		add(b1);add(b2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
			JOptionPane.showMessageDialog(null, "button1 pressed"+t1.getText());
		else
			JOptionPane.showMessageDialog(null, "button2 pressed");
	}
}
