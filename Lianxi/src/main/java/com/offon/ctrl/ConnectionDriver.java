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
		  System.out.println("���ݿ���������ʧ�ܣ�");
		e.printStackTrace();
	}
     try {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lianxi?useUnicode=true&characterEncoding=utf8&serverTimezone=UTC","root","root");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		   System.out.println("���ݿ�����ʧ�ܣ�");
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
				System.out.print("��ţ�"+id+";");
				System.out.print("������"+name+";");
				System.out.print("���룺"+password+";");
				System.out.print("���䣺"+age+";");
				System.out.println("�Ա�"+sex+";");
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