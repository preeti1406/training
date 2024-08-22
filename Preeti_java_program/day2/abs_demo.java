import java.io.*;
import java.util.*;
abstract class Test_demo_abs
{
abstract void display();
}
class abs_demo extends Test_demo_abs
{
void display()
{
System.out.println("Your seeing the demo of Abstract class");
}
void show()
{
System.out.println("Show method");
}
public static void main(String args[])
{
abs_demo d=new abs_demo();
d.display();
d.show();
}
}
