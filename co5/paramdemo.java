import java.awt.*;
import java.applet.*;
/*
<applet code="paramdemo" width=300 height=100>
<param name=num1 value=10>
<param name=num2 value=20>
</applet>
*/
public class paramdemo extends Applet
{
  String param;
  int total;
  public void start()
    {
       param=getParameter("num1");
       int val1=Integer.parseInt(param);
       int val2=Integer.parseInt(param);
       total=val1+val2;
    }
    public void paint(Graphics g)
    {
    g.drawString("Total"+String.valueOf(total),10,10);
    }
}

