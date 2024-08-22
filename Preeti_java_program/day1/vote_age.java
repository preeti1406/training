import java.io.*;
import java.util.*;
class vote_age
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int age;
System.out.println("Enter your age");
age=sc.nextInt();
if(age>18 && age<100)
System.out.println("Eligible for vote");
else
System.out.println("Not eligible for voting");
}
}