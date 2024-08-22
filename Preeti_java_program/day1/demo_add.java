import java.io.*;
import java.util.*;
class country
{
String c_name;
void accept()
{
System.out.println("Enter country name");
Scanner sc=new Scanner(System.in);
c_name=sc.next();
}
void display()
{
System.out.println("Country name"+c_name);
}
}
class state extends country
{
String s_name;
void accept()
{
super.accept();
System.out.println("Enter State name");
Scanner sc=new Scanner(System.in);
s_name=sc.next();
}
void display()
{
super.display();
System.out.println("State name"+s_name);
}
}
class demo_add
{
public static void main(String ars[])
{
state add1=new state();
add1.accept();
add1.display();
}
}