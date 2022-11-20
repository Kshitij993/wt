import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.*;
public class q1 extends Applet
 {
  int r=0;
  double area;
  public void paint(Graphics g)
   {
    
    String msg;
    Font f1=new Font("Serif",Font.BOLD,15);
    Font f2=new Font("Elephant",Font.BOLD,15);
    Font f3=new Font("Aharoni",Font.BOLD,15);
    r=Integer.parseInt(getParameter("radius"));
    area=(double)(3.14*r*r);
    g.drawOval(150,150,r,r);
    g.setColor(Color.GREEN);
    g.setFont(f1);
    g.drawString("Area="+area,100,90);
    g.setColor(Color.BLUE);
    g.setFont(f2);
    g.drawString("Area="+area,100,110);
    g.setColor(Color.RED);
    g.setFont(f3);
    g.drawString("Area="+area,100,130);
   }
 }
