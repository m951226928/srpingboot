package com.offon.ctrl;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.bytebuddy.dynamic.scaffold.MethodRegistry.Prepared;

public class ConnectionDriver {
	 Connection conn = null;
	    ResultSet rs = null;
	public void show(){
	 try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		  System.out.println("数据库驱动加载失败！");
		e.printStackTrace();
	}
     try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lianxi?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC","root","root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		   System.out.println("数据库连接失败！");
		e.printStackTrace();
	}
}
	public void QueryData(String sql){
		show();
		try {
			PreparedStatement prepareCall = conn.prepareStatement(sql);
			ResultSet rs = prepareCall.executeQuery();
			while(rs.next()){
				String id=rs.getString("id");
				String name=rs.getString("name");
				String password=rs.getString("code");
				String age=rs.getString("abbr");
				String sex=rs.getString("cqccode");
				System.out.print("编号："+id+";");
				System.out.print("姓名："+name+";");
				System.out.print("密码："+password+";");
				System.out.print("年龄："+age+";");
				System.out.println("性别："+sex+";");
			}
			rs.close();
			prepareCall.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}