import java.applet.Applet;
import java.awt.*;
/*
<applet code="rect" width="400" height="500">
</applet>
*/
public class rect extends Applet
{
 public void init()
{
   setBackground(Color.pink);
} 
public void paint(Graphics g)
{
g.setColor(Color.yellow);
g.drawLine(10,10,50,10);
g.drawRect(70,10,35,50);
g.drawOval(150,10,100,100);
}
}
