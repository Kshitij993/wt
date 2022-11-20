import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

public class background_colour extends Applet
 {
  public void init()
   {
    resize(1000,1000);
    setBackground(Color.BLUE);
   }
  public void paint(Graphics g)
   {
    g.drawString("Kshitij Kumar Sharma",500,500);
   }
 }
 
