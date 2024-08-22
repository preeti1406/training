import java.io.*;
import java.util.*;
class even_odd
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number to check if it is odd or even");
num=sc.nextInt();
if(num%2==0)
System.out.println("Number is even");
else
System.out.println("Number is odd");
}
}