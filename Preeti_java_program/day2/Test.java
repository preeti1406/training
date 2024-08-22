import java.awt.*;
import java.awt.event.*;
class Test extends Frame implements ActionListener
{
Test()
{
setSize(400,400);
setVisible(true);
Button b1=new Button("Click it");
setLayout(new FlowLayout());
setBackground(Color.yellow);
add(b1);
b1.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
System.out.println("Button Clicked");
}
public static void main(String args[])
{
new Test();
}
}