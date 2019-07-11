package com.knewton.academy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Statement;
import java.sql.*;


@SpringBootApplication
public class AcademyApplication {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		SpringApplication.run(AcademyApplication.class, args);
//	      Class.forName("com.mysql.cj.jdbc.Driver");
//	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demos","root","");
//	        Statement st = con.createStatement();
//	       // st.execute("create table jp(id varchar(30),pass varchar(50))");
////	        st.execute("INSERT INTO `student`(`maths`, `science`) VALUES ('400','30')");
//	       ResultSet rs =st.executeQuery("select * from student");  
//	while(rs.next())  
//	System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  ");
//	ResultSet sr =st.executeQuery("select * from student");
//	while(sr.next())
//	System.out.println(sr.getString(1)+" "+ sr.getString(2));
//	con.close();          
	        
	        
		
	}

}
