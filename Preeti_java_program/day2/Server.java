import java.net.*;
import java.io.*;
class Server
{
public static void main(String args[])throws Exception
{
ServerSocket ss=new ServerSocket(9999);
DataInputStream dis=new DataInputStream(System.in);
Socket s=ss.accept();
DataInputStream fromClient=new DataInputStream(s.getInputStream());
PrintStream toClient=new PrintStream(s.getOutputStream());
String msg;
while(true)
{
System.out.println(fromClient.readLine());
msg=dis.readLine();
toClient.println("Server::"+msg);
}

}
}