import java.io.*;
import java.util.*;
class demo_string
{
public static void main(String args[])
{
String s1="Hello ";
System.out.println(s1);
String s2=s1.concat("Nice to meet you");
System.out.println(s2);
String s3=s2.toUpperCase();
System.out.println(s3);
String s4=s3.replace("HELLO","HI");
System.out.println(s4);
}
}