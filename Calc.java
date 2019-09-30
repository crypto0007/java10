import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calc extends Frame implements ActionListener
{
	//Container c=getContentPane();
	Button add,sub,mul,div,mod,ans;
	Button b[]=new Button[10];
	TextField t1;
	Panel p1,p2,p3;
	public Calc()
	{
		p1=new Panel(new GridLayout(1,1));
		p2=new Panel(new GridLayout(4,4));
		t1=new TextField(20);
		p1.add(t1);
		for(int i=0;i<=9;i++)
		{
			p2.add(b[i]);
			b[i].setText(i);
			b[i].addActionListener(this);
		}
		add=new Button("+");
		sub=new Button("-");
		mul=new Button("*");
		div=new Button("/");
		mod=new Button("%");
		ans=new Button("=");
		Frame f=new Frame("Calculator");
		f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		for(int i=0;i<=9;i++)
		{
			if(e.getActionCommand.equals(i))
			{
				t1.setText(i);
			}
		}
	}
}