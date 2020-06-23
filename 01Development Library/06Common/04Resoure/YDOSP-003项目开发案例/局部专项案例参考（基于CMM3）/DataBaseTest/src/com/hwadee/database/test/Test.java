package com.hwadee.database.test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {
	public static void main(String[] args) throws Exception{
		try {
			String[] config = getSqlserverConfig();
			String driver   = config[0];
			String url = config[1];
			String username = config[2];
			String password = config[3];
			
			System.out.println("开始连接Sqlserver....................");
			Connection conn = getConnection(username,password,url,(Driver)Class.forName(driver).newInstance());
			System.out.println("连接成功Sqlserver....................");
			closeConn(conn);
			System.out.println("连接关闭Sqlserver....................");
			
			config = getOracleConfig();
			driver = config[0];
			url = config[1];
			username = config[2];
			password = config[3];
			
			System.out.println("开始连接Oracle....................");
			conn = getConnection(username,password,url,(Driver)Class.forName(driver).newInstance());
			System.out.println("连接成功Oracle....................");
			closeConn(conn);
			System.out.println("连接关闭Oracle....................");
			//ins.close();
			
		} catch (IOException e) {
			throw new Exception("不能读取配置！",e);
		} catch (ClassNotFoundException e) {
			throw new Exception("未发现驱动！",e);
		} catch (SQLException e) {
			throw new Exception("数据库连接失败！",e);
		} catch (InstantiationException e) {
			throw new Exception("数据库连接失败！",e);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean closeConn(Connection conn){
		boolean isDone=false;
		try {
			conn.close();
			isDone=true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return isDone;
	}
	
	public static Connection getConnection(String username,String pwd,String url,Driver driver) throws SQLException{
		DriverManager.registerDriver(driver);
		System.out.println("当前驱动是:"+driver.getClass().getName()+",version:"+driver);
		Connection conn = DriverManager.getConnection(url, username, pwd);
		return conn;
	}
	
	public static String[] getSqlserverConfig() throws IOException{
		Properties props = new Properties();
		props.load(props.getClass().getResourceAsStream("/jdbc.properties"));
		String driver   = props.getProperty("sqlserver.jdbc.driver");
		String url = props.getProperty("sqlserver.jdbc.url");
		String username = props.getProperty("sqlserver.jdbc.username");
		String password = props.getProperty("sqlserver.jdbc.password");
		return new String[]{driver,url,username,password};
	}
	
	public static String[] getOracleConfig() throws IOException{
		Properties props = new Properties();
		props.load(props.getClass().getResourceAsStream("/jdbc.properties"));
		String driver   = props.getProperty("oracle.jdbc.driver");
		String url = props.getProperty("oracle.jdbc.url");
		String username = props.getProperty("oracle.jdbc.username");
		String password = props.getProperty("oracle.jdbc.password");
		return new String[]{driver,url,username,password};
	}
}
