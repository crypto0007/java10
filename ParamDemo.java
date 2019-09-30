import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class ParamDemo extends Applet implements ActionListener
{
	Button btn;
	Label l1;
	int n1,n2;
	public void init()
	{
		 n1=Integer.parseInt(getParameter("n1"));
		 n2=Integer.parseInt(getParameter("n2"));
		 btn=new Button("SUM");
		 l1=new Label();
		 add(btn);
		 add(l1);
		 btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		l1.setText(String.valueOf(n1+n2));
	}
}