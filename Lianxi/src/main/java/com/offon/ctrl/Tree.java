package com.offon.ctrl;


public class Tree {

	public static void main(String[] args) {
		ConnectionDriver b = new ConnectionDriver();
		
		b.QueryData("SELECT * FROM ccic_realm");
	}
}
