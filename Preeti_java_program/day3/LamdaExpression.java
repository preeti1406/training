import java.io.*;
import java.util.*;
public class LamdaExpression
{
public static void main(String args[])
{
List<String> list=new ArrayList<String>();
list.add("Ankit");
list.add("Sanket");
list.add("Riyaz");
list.add("Rounak");
list.forEach((i)->System.out.println(i)
);

}
}
