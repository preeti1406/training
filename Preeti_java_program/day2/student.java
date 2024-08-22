import MyPackage.Tymarks;
import MyPackage.Symarks;
import java.io.*;
import java.util.*;
class student 
{
String name;
student(String name)
{
this.name=name;
}
public static void main(String args[])
{
Symarks s1=new Symarks();
s1.accept();
s1.display();
}
}