package Task1;
import java.sql.*;
//1.import
//2.a.load the buffer
//    b.register the buffer
//3.establish connection
//4.write the statements
//5.execute the query
//6.process the result
//7.close

public class JDBC {

	public static void main(String[] args) throws Exception
	{
		try
		{
		String url ="jdbc:mysql://localhost:3306/students";
		String uname="root";
		String pass ="root";
		String query="select * from students";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next())
		{
		String res=rs.getString("sid") + "  |  " +rs.getString("sname") + "  |  " +rs.getString("slname");
		System.out.println(res);
		}
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
