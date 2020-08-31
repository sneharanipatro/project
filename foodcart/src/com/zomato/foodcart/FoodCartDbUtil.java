package com.zomato.foodcart;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class FoodCartDbUtil {
	
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException {
		
		String url= "jdbc:mysql://localhost:3306/food";
		String password="abcd";
		String userName="root";
		
		ArrayList<Food> food=new ArrayList<>();
		//load the mysql driver
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//get a connection
		
		Connection cn = DriverManager.getConnection(url, userName, password);
		
		//create a statement
		
		Statement stmt = cn.createStatement();
		
		//execute the statement & loop over the result set
		
		ResultSet rs = stmt.executeQuery("select * from foodcart");
		
		while(rs.next())
		{
			
			int id = rs.getInt(1);
			String items = rs.getString(2);
			double price = rs.getDouble(3);
			Food f = new Food(id, items, price);
			food.add(f);
		}
		
		return food;
		
	}

}
