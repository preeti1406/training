import java.sql.*;
class JdbcDemo2
{
public static void main(String args[])throws Exception
{
//Loading Driver
Class.forName("com.mysql.jdbc.Driver");

//Providing Connection 
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","P@ssw0rd");

//Using Statement Interface
Statement st=con.createStatement();

//processing query using statement method
//st.execute("create table test_demo(t_no int primary key,t_name varchar(20));");
st.execute("insert into test_demo values(3,'Mansi');");
System.out.println("Record Inserted");

//closing objects
st.close();
con.close();
}
}