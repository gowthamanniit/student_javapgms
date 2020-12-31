package FOLDER1;
import javax.swing.*;
class TestGUI extends JFrame
{
 TestGUI()
 {
	setTitle("SimpleGUI");
	//setLayout(new FlowLayout());
	setLayout(null);
	
	/*JLabel l1=new JLabel("Enter UserName");
	JLabel p1=new JLabel("Enter Password");
	JTextField t1=new JTextField(20);
	JButton b=new JButton("clickme");
	JPasswordField p=new JPasswordField();	*/
	
/*	JLabel addlab=new JLabel("Enter Your Address");
	JTextArea addr=new JTextArea();*/

	/*JLabel checkLab=new JLabel("Select Your Course:");
	JCheckBox c1=new JCheckBox("C");
	JCheckBox c2=new JCheckBox("C++");
	JCheckBox c3=new JCheckBox("JAVA");*/

/*	JLabel radLab=new JLabel("Select Gender:");
	JRadioButton g1=new JRadioButton("Male");
	JRadioButton g2=new JRadioButton("Female");
	JRadioButton g3=new JRadioButton("Others");*/
	
	// initialization method array
/*	String months[]= {"karur","tricy","namakkal","salem"};
	JList li=new JList(months);

	//or method  runtime 
	DefaultListModel dlist=new DefaultListModel();
	dlist.addElement("usa");
	dlist.addElement("londan");
	dlist.addElement("asia");
	dlist.addElement("japan");
	li.setModel(dlist);*/
	
	
	JComboBox cb=new JComboBox();	
	cb.addItem("january");
	cb.addItem("february");
	cb.addItem("march");
	cb.addItem("april");
	cb.addItem("may");
	
	
	JOptionPane.showMessageDialog(null, "successfully credited rs.1000");
	
/*	l1.setBounds(100, 100, 100, 30);
	t1.setBounds(250, 100, 200,30);	
	p1.setBounds(100, 150, 100, 30);
	p.setBounds(250, 150, 200, 30);
	b.setBounds(250, 200, 100, 30);*/
/*	addlab.setBounds(100, 300, 100, 30);
	addr.setBounds(250, 300, 150, 100);*/
	/*	checkLab.setBounds(100, 350, 150, 30);
	c1.setBounds(250, 350, 50, 30);
	c2.setBounds(300, 350, 50, 30);
	c3.setBounds(350, 350, 50, 30);*/
	
/*	ButtonGroup bg=new ButtonGroup();
	radLab.setBounds(100, 350, 150, 30);
	g1.setBounds(250, 350, 100, 30);
	g2.setBounds(350, 350, 100, 30);
	g3.setBounds(450, 350, 100, 30);*/
	
//	li.setBounds(100, 100,100, 100);
	cb.setBounds(100, 200, 100, 30);
/*	add(l1); 
	add(b);
	add(p);
	add(t1);
	add(p1);*/
//	add(addlab); add(addr);
//	add(checkLab);add(c1); add(c2); add(c3);

	/*add(radLab);bg.add(g1); bg.add(g2); bg.add(g3);
	add(g1);add(g2); add(g3);*/
	
  //  add(li);
	add(cb);
 }
}

public class GUI_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f1=new TestGUI();
		f1.setSize(500,600);
		f1.setResizable(false);
		f1.show();
	}

}
