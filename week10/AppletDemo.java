import java.applet.Applet;
import java.awt.Graphics;

public class AppletDemo extends Applet{
	public void paint(Graphics g){
		g.drawString("Hello world", 50, 50);
	}
}
/*
	<applet code = "AppletDemo.class" width="500" height="300"> </applet>
 */
