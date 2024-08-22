import java.io.*;
import java.util.*;
class Stack_demo
{
public static void main(String args[])
{
Stack s=new Stack();
s.push(12);
s.push(34);
s.push(10);
System.out.println(s);
s.pop();
System.out.println(s);
System.out.println(s.peek());
}
}