import java.io.*;
import java.util.*;
class Demo_vector
{
public static void main(String args[])
{
Vector v=new Vector(2);
int n1=v.capacity();
System.out.println("Capacity of vector:"+n1);
v.add(12);
v.add(23);
v.add(54);
v.add(11);
v.add(23);
v.add(51);
int n2=v.capacity();
System.out.println("New Capacity:" +n2);

}
}