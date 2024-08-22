import java.util.*;
class demo_string_token
{
public static void main(String args[])
{
StringTokenizer st=new StringTokenizer("Smile, the world smiles with you");
int count=st.countTokens();
System.out.println("No.of tokens:"+count);
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}