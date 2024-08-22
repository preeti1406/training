import java.io.*;
import java.util.*;
class clock
{
public static void main(String args[])throws Exception
{
Scanner sc=new Scanner(System.in);
int hr,min,s,i,j,k;
System.out.println("Enter current time");
hr=sc.nextInt();
min=sc.nextInt();
s=sc.nextInt();
System.out.println();
for(i=hr;i<24;i++)
{
for(j=min;j<60;j++)
{
for(k=s;k<60;k++)
{
System.out.print(i+":"+j+":"+k+"\r");
Thread.sleep(1000);
}
k=0;
}
j=0;
}
}
}