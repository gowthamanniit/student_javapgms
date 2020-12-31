//<applet code="ImageDemo" width="600" height="600"></applet>
import java.applet.Applet;
//import java.awt.Graphics;
import java.awt.*;

public class ImageDemo extends Applet {  
	  
	Toolkit tk=Toolkit.getDefaultToolkit();
	Image picture;  
	  
	  public void init() {  
	    picture =tk.getImage("photo2.jpg");	    
	  }  
	    
	  public void paint(Graphics g) {  
	    //for(int i=0;i<50;i+=5){  
		  g.drawString("gowthama",30,50);
	      g.drawImage(picture, 30,30, this);  
	  
	      //try{Thread.sleep(1000);}catch(Exception e){}  
	    //}  
	  }   

}
