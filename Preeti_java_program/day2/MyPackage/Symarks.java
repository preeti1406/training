import java.io.*;
import java.util.*;
public class Symarks
{
Scanner sc=new Scanner(System.in);
int math;
int comp;
void accept()
{
System.out.println("Enter the math score:");
math=sc.nextInt();
System.out.println("Enter the comp score:");
comp=sc.nextInt();
}
void display()
{
System.out.println("Math Score: "+math);
System.out.println("Comp Score: "+comp);
}
}
