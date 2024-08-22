import java.io.*;
import java.util.*;
class demo_array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[][]=new int[3][3];
System.out.println("Enter elements of 3d array");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
arr[i][j]=sc.nextInt();
}
}
System.out.println();
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
}
}