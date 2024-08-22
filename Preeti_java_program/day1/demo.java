import java.io.*;
import java.util.*;
class demo
{
static int num;
String name;
public demo(int num,String name)
{
this.num=num;
this.name=name;
}
void display()
{
System.out.println("No."+num+" Name: "+name);
}
static void display1()
{
System.out.print("Num"+num);
}
public static void main(String args[])
{
demo d=new demo(12,"Preeti");
d.display();
demo.display1();
}
}