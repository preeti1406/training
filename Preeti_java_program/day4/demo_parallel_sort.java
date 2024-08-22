import java.io.*;
import java.util.*;
class demo_parallel_sort
{
public static void main(String args[])
{
int arr[]={5,8,12,3,2,25,11,7};
System.out.println("Array");
for(int i:arr)
System.out.println(i);
Arrays.parallelSort(arr);
System.out.println("After sorting");
for(int i:arr)
System.out.println(i);
}
}