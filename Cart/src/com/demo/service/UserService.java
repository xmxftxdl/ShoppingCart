package com.demo.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.demo.users.User;

public class UserService {
	Connection con;
	public UserService() {
	}
	public boolean login(User user) {
		try {
			String uname=user.getUsername();
			String upassword=user.getPassword();
			if(uname.equals("Admin")&&upassword.equals("Admin")) {
				return true;
			}
			else
				return false;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
}