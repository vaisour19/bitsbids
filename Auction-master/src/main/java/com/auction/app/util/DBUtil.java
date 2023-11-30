package com.auction.app.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection connection=null; 
	public static Connection getConnection() throws SQLException
	{
		if(connection!=null)
		{
			return connection;
		}
		else
		{
			String driver="com.mysql.cj.jdbc.Driver";
			String url="jdbc:mysql://localhost:3306/auction1?createDatabaseIfNotExist=true";
			String user="root";
			String password="123456";
			
			try
			{
				Class.forName(driver);
				connection=DriverManager.getConnection(url,user,password);
			}
			catch(Exception e)
			{
				
			}
		}
		return connection;
		
	}

}
