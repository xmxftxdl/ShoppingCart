package com.demo.Items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.demo.item.item;

public class Items {
	public List<item> ListItem(){
		List<item>List=new ArrayList<>();
		Connection con;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
    		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cartList?serverTimezone=UTC","root","15900222580");
    		String query="select * from item";
    		stmt=con.createStatement();
    		rs=stmt.executeQuery(query);
    		while(rs.next()) {
    			List.add(new item(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getInt(4)));
    		}
		} catch (Exception e) {
	 		e.printStackTrace();
		}
		
		return List;
		
	}
	public static boolean addCart(item i){
		Connection con;
		PreparedStatement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
    		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cartList?serverTimezone=UTC","root","15900222580");
    		int ID=i.getID();
    		String name=i.getName();
    		int Number=i.getNumber();
    		int price=i.getPrice();
    		int total=price;
    		String query="insert into item (ID,Name,Number,price,total) values (?,?,?,?,?)"+"ON DUPLICATE KEY UPDATE Number=Number+1,total=Number*price";
    		stmt=con.prepareStatement(query);
    		stmt.setInt(1,ID);
    		stmt.setString(2,name);
    		stmt.setInt(3, Number);
    		stmt.setInt(4, price);
    		stmt.setInt(5, total);
    		return stmt.execute();
		} catch (Exception e) {
	 		e.printStackTrace();
	 		return false;
		}
		
	}
}

