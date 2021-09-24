import java.awt.*;
import java.applet.*;
/*
<applet code="maxnumb" width=380 height=200>
<param name=num1 value=30>
<param name=num2 value=50>
<param name=num3 value=80>
</applet>
*/
public class maxnumb extends Applet
{
  String param;
  int max;
  public void init()
   {
     setBackground(Color.pink);
     setForeground(Color.yellow);
   }
 public void start()
  {
  param=getParameter("num1");
  int val1=Integer.parseInt(param);
  param=getParameter("num2");
  int val2=Integer.parseInt(param);
  param=getParameter("num3");
  int val3=Integer.parseInt(param);
    if(val1>val2)
      {
      if(val1>val3)
        {
         max=val1;
        }
     else
       {
         max=val3;
        }
      }
    else
     {
    if(val2>val3)
     {
     max=val2;
     }
    else
     {
   max=val3;
   }
   }
}
public void paint(Graphics g)
{
  g.drawString("Largest number is:"+String.valueOf(max),100,150);
}
}
  
  
