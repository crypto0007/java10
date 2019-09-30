import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class ParamDemo extends JApplet implements ActionListener
{
		int n1,n2,ans=0;
		Button b;
		Color c;

	public void init()
	{
		 //n1=Integer.parseInt(getParameter("n1"));
		 //n2=Integer.parseInt(getParameter("n2"));
		// b=new Button("CLICK");
		// add(b);
		// b.addActionListener(this);
		//System.out.println(getParameter("n1"));
		 c=Color.getColor(getParameter("n1"));
		 Container content = getContentPane();
                content.setBackground(c);

	}
	public void paint(Graphics g)
	{
		//g.drawString(String.valueOf(ans),100,200);
		//setBackground(c);
	}
	public void actionPerformed(ActionEvent e)
	{
		ans=n1+n2;
		repaint();
	}
}