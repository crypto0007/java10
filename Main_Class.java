import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Traffic extends Applet implements Runnable
{
	Thread t;
	int a=1;

	public void init()
	{
		t=new Thread();
		t.start();

	}
	public void run()
	{
		try
		{
			System.out.println("IN RUN");
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
			System.out.println(e);
		}

	}

	public void paint(Graphics g)
	{
		g.drawOval(100,50,50,50);
		g.drawOval(100,110,50,50);
		g.drawOval(100,170,50,50);

		if(a==1)
		{
			g.setColor(Color.RED);
			g.fillOval(100,50,50,50);
			//g.setColor(Color.whit);
			g.drawOval(100,110,50,50);
			g.drawOval(100,170,50,50);

		}
		if(a==2)
		{

			g.drawOval(100,50,50,50);
			g.setColor(Color.YELLOW);
			g.fillOval(100,110,50,50);
			g.drawOval(100,170,50,50);

		}
		if(a==3)
		{

			g.drawOval(100,50,50,50);
			g.drawOval(100,110,50,50);
			g.setColor(Color.GREEN);
			g.fillOval(100,170,50,50);

		}


	}


}

