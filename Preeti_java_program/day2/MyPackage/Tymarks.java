import java.io.*;
import java.util.*;
public class Tymarks
{
Scanner sc=new Scanner(System.in);
int ele;
int stat;
void accept()
{
System.out.println("Enter the ele score:");
ele=sc.nextInt();
System.out.println("Enter the stat score:");
stat=sc.nextInt();
}
void display()
{
System.out.println("Electronics Score: "+ele);
System.out.println("Stats Score: "+stat);
}
}