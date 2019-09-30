import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TrafficSignal extends Applet implements Runnable
{
	Thread t;
	int a=0;
	public void init()
	{
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			while(true)
			{
				a=1;
				repaint();
				t.sleep(5000);

				a=2;
				repaint();
				t.sleep(5000);

				a=3;
				repaint();
				t.sleep(5000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}

	public void paint(Graphics g)
	{
		if(a==1)
		{
			g.setColor(Color.RED);
			g.fillOval(100,50,50,50);
			g.setColor(Color.BLACK);
			g.drawOval(100,105,50,50);
			g.drawOval(100,160,50,50);
		}

		if(a==2)
		{
			g.drawOval(100,50,50,50);
			g.setColor(Color.YELLOW);
			g.fillOval(100,105,50,50);
			g.setColor(Color.BLACK);
			g.drawOval(100,160,50,50);
		}

		if(a==3)
		{
			g.drawOval(100,50,50,50);
			g.drawOval(100,105,50,50);
			g.setColor(Color.GREEN);
			g.fillOval(100,160,50,50);
		}

	}
}