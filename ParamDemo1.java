import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ParamDemo1 extends Applet
{
	Color c;
	public void init()
	{
		 System.out.println(getParameter("bg"));
		 c=Color.getColor(getParameter("bg"));
		 System.out.println(c);
		 setBackground(c);
	}
	public void paint(Graphics g)
	{
		//setBackground(c);
	}
}