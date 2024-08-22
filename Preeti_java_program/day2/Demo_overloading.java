import java.io.*;
import java.util.*;
class Demo_overloading
{
void area(int l,int b)
{
int a;
a=l*b;
System.out.println("Area of rectangle is "+a);
}
void area(int s)
{
	int a;
a=s*s;
System.out .println("Area of the square is "+a);
}
void area(double r)
{
double a;
a=3.14*r*r;
System.out.println("Area of the circle is "+a);
}
public static void main(String args[])
{
Demo_overloading d=new Demo_overloading();
d.area(12,6);
d.area(4);
d.area(14.1);
}
}