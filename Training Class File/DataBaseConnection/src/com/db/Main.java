package com.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
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

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnect db = new DBConnect();
		db.getData();

	}

}
