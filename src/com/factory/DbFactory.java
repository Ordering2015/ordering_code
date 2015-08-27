package com.factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DbFactory {

	Connection conn=null;
	public Connection getOracleCon()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger" );
			System.out.println("conection established");
		}
		catch(ClassNotFoundException c)
		{
			System.out.println(c);
		}
		catch(SQLException s)
		{
			System.out.println(s);
		}	
		return conn;
	}
	public void closeOracleCon()
	{
		if(this.conn!=null)
		{
			try
			{
				this.conn.close();
			}
			catch(SQLException s)
			{
				System.out.println(s);
			}
		}
	}
}
