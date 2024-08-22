import java.io.*;
import java.sql.*;
class demo_jdbc
{
public static void main(String args[])throws Exception
{

		
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/demo","root","P@ssw0rd");
Statement st=con.createStatement();
st.execute("create table test_demo(t_no int primary key,t_name varchar(20));");
st.close();
con.close();
	
}
}