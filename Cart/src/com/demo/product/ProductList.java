package com.demo.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.demo.item.item;
import com.demo.productElement.Product;

public class ProductList {

	public List<Product> ListProduct(){
		List<Product>List=new ArrayList<>();
		Connection con;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
    		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/junCart?serverTimezone=UTC","root","15900222580");
    		String query="Select * from Product";
    		stmt=con.createStatement();
    		rs=stmt.executeQuery(query);
    		while(rs.next()) {
    			List.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3)));
    		}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return List;
	}
	public item searchProduct(int id) {
		item it=null;
		Connection con;
		ResultSet rs;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
    		con= DriverManager.getConnection("jdbc:mysql://localhost:3306/junCart?serverTimezone=UTC","root","15900222580");
    		String query="select * from Product where ID="+id;
    		Statement stmt=con.createStatement();
    		rs=stmt.executeQuery(query);
    		while(rs.next()) {
    			it=new item(rs.getInt(1),rs.getString(2),1,rs.getInt(3));
    		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return it;
		
	}
}
