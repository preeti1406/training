import java.io.*;
import java.util.*;
class rev_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,rev=0,i;
System.out.println("Enter the number");
num=sc.nextInt();
for(i=num;i>0;)
{
rev=rev*10+(i%10);
i=i/10;
}
System.out.println("The reverse number is "+rev);
}
}