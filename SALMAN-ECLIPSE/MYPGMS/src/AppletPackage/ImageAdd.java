//<applet code="ImageAdd.class" width="600" height="600"></applet>
package AppletPackage;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class ImageAdd extends Applet{
	Image img;
	int i=1;
	public void init()
	{
		img=getImage(getCodeBase(), "Gowtham--.jpg");				
	}
	public void paint(Graphics g)
	{
		i=i+6;
		g.drawImage(img,100+i,200,100,100,this);
		if(i>=800)
			i=0;		
		repaint(); // 1. clear 2. paint
		try
		{
		Thread.sleep(20);
		}
		catch(Exception e) {}
		}

}