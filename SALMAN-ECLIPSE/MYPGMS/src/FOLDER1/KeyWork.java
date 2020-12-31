package FOLDER1;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

class KeyGUI extends JFrame implements MouseMotionListener 
{
	JLabel l1,l2;
	JTextField t1;
	String ans="";
	char c;
	KeyGUI()
	{
		setTitle("KeyListener");
		setLayout(null);
		l1=new JLabel("Enter Name:");
		l2=new JLabel("...........:");
		t1=new JTextField(29);
		
		t1.addMouseMotionListener(this);
		
		l1.setBounds(100,100,100,30);
		t1.setBounds(200,100,200,30);
		l2.setBounds(200,200,200,30);
		
		add(l1);add(t1);add(l2);		
	}
	/*@Override
	public void keyPressed(KeyEvent ke) {
		// TODO Auto-generated method stub
		l2.setText("key pressed");
		
	}
	@Override
	public void keyReleased(KeyEvent ke) {
		// TODO Auto-generated method stub
		l2.setText("key Released  " + ans.toUpperCase());
		t1.setText("");
		t1.setText(ans.toUpperCase());
		
	}
	@Override
	public void keyTyped(KeyEvent ke) {
		// TODO Auto-generated method stub
		l2.setText("key Typed");
		c=ke.getKeyChar();
		if((c>='A' && c<='Z') ||(c>='a' && c<='z'))
		ans=ans+c;
	}*/
	/*
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouser clicked");
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouser entered");
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouser exited");
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouser pressed");
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouser released");
	}*/
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouse dragged");
	}
	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		l2.setText("mouse moved");
	}	
}

public class KeyWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f1=new KeyGUI();
		f1.setSize(600, 500);
		f1.show();		
	}

}
