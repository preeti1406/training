import java.io.*;
import java.util.*;
class table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,i,j;
System.out.println("Enter number till table you want");
num=sc.nextInt();
for(i=2;i<=num;i++)
{
for(j=1;j<=10;j++)
{
System.out.println(i+" x "+j+" = "+i*j);
}
System.out.println("------------------");
}
}
}