import java.io.*;
import java.util.*;
class demo1
{
	void display()
	{
		System.out.println("You have entered class 1");
	}
}
class demo2 extends demo1
{
	void display()
	{
		System.out.println("You have entered class 2");
	}
}
class Demo_overriding
{

public static void main(String args[])
{
demo2 d=new demo2();
d.display();

}
}