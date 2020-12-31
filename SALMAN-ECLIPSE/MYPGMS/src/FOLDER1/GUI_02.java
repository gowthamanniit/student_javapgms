package FOLDER1;

//import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.*;

class TestGUI2 extends JFrame
{
	JButton b1,b2,b3,b4,b5,b6,b7,b8;
	TestGUI2()
	{
	    //setLayout(new BorderLayout());
		
		setLayout(new GridLayout(2,4));
		b1=new JButton("add");
	    b2=new JButton("sub");
	    b3=new JButton("mul");
	    b4=new JButton("div");
	    b5=new JButton("add");
	    b6=new JButton("sub");
	    b7=new JButton("mul");
	    b8=new JButton("div");
	    
	    /*add(b1,BorderLayout.EAST);
	    add(b2,BorderLayout.WEST);
	    add(b3,BorderLayout.SOUTH);
	    add(b4,BorderLayout.NORTH);*/
	    
	    add(b1);add(b2);add(b3);add(b4);
	    add(b5);add(b6);add(b7);add(b8);
	    
	}
}

public class GUI_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f1=new TestGUI2();
		f1.setSize(600, 500);
		f1.setResizable(false);
		f1.show();
		
		
		
	}

}
