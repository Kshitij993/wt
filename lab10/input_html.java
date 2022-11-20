import java.applet.Applet;
import java.awt.Graphics;

public class input_html extends Applet
 {
  public void paint(Graphics g)
   {
    int x=0;
    int y=0;
    String msg;
    x=Integer.parseInt(getParameter("xpos"));
    y=Integer.parseInt(getParameter("ypos"));
    msg=getParameter("msg");
    g.drawString(msg,x,y);
   }
 }
