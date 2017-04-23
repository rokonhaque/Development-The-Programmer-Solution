package com.db;

import java.sql.*;
import java.sql.DriverManager;
import java.util.Properties;

//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;

public class DBConnect 
{
	
		private Connection conn = null;
		private Statement st;
		private ResultSet rs;
		public DBConnect()
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("success");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tanidb1","root","");
				st = conn.createStatement();
				
			}catch(Exception e){
				System.out.println("error is:" +e);
			}
			
		}
		public void getData()
		{
			try{
				String query = "select * from stdinfo";
				rs = st.executeQuery(query);
				while(rs.next())
				{
					String name = rs.getString("name");
					System.out.println("Name:" +name);
				}
				
				
			}catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	

}
