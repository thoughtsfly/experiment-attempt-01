package com.thoughtsfly.testdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaClientH2 {
 public static void main(String[] args) throws SQLException, ClassNotFoundException{
	 System.out.println("hello");
	  Class.forName("org.h2.Driver");
      Connection conn = DriverManager.getConnection("jdbc:h2:~/learnH2", "tfc", "tfc");
      // add application code here
      System.out.println(conn);
      Statement statement = conn.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from firsttable");
      String str = null;
      
      while(resultSet.next()){
    	   str = resultSet.getInt(1)+resultSet.getString(2);
      }
      System.out.println(str);
      conn.close();
  }
 }

