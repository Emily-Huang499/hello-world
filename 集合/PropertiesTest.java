package com.indi.collection.test;

import java.util.Properties;

public class PropertiesTest {

	public static void main(String[] args) {
		Properties pro = new Properties();
		
		pro.setProperty("url", "http://baodu.com");
		pro.setProperty("no", "9870");
		pro.setProperty("username", "Emily");
		pro.setProperty("password", "0123456");

		String url = pro.getProperty("url");
		String no = pro.getProperty("no");
		String uname = pro.getProperty("username");
		String pwd = pro.getProperty("password");
		
		System.out.println("url" + "=" + url);
		System.out.println("no" + "=" + no);
		System.out.println("username" + "=" + uname);
		System.out.println("password" + "=" + pwd);
		
		
		
	}

}
