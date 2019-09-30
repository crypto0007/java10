import javax.swing.*;
import java.awt.*;
import java.applet.*;

import java.awt.event.*;


public class Cal extends Frame implements ActionListener
{
	Container c=getContentPane();

	Button b[]=new Button[9];
	Button add,mul,div,sub,mod,ans;
	Panel p1=new Panel();
	Panel p2=new Panel();
	TextField t1=new TextField(10);
	public Cal()
	{
		p1.setLayout(new GridLayout(4,4));
		for(int i=0;i<b.length;i++)
		{
			p1.add(b[i]);
			b[i].setText(i);
			b[i].addActionListener(this);

		}
		add=new Button("+");
		mul=new Button("*");
		div=new Button("+");
		sub=new Button("-");
		mod=new Button("%");
		ans=new Button("ans");
		p1.add(add);
		p1.add(mul);
		p1.add(div);
		p1.add(sub);
		p1.add(mod);
		p1.add(ans);
		add.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		sub.addActionListener(this);
		mod.addActionListener(this);
		ans.addActionListener(this);
		c.add(p1);


	}
	public void actionPerformed(ActionEvent e)
	{


	}
	public static void main(String a[])
	{
		Cal c=new Cal();
		c.setVisible(true);
		//c.setSize(400,500);

	}


}