package FOLDER1;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.*;

class Combo extends JFrame implements ItemListener
{
	JComboBox cb;
	JLabel l1,l2;
	Combo()
	{
		l1=new JLabel("Selct Month");
		l2=new JLabel(".............");
		
		cb=new JComboBox();	
		cb.addItem("january");
		cb.addItem("february");
		cb.addItem("march");
		cb.addItem("april");
		cb.addItem("may");		
		
		l1.setBounds(100, 100, 150, 30);
		cb.setBounds(100, 200, 150, 30);
		l2.setBounds(100, 400, 150, 30);
		cb.addItemListener(this);
		
		add(l1);add(cb);add(l2);		
	}
	
	public void itemStateChanged(ItemEvent arg0) {
	 String ans=cb.getSelectedItem()+""; 
		l2.setText(ans);
	}
	
	
}

public class GUIEventHand {
	public static void main(String[] args) {
		JFrame f1=new Combo();
		f1.setSize(600,600);
		f1.show();

	}
}