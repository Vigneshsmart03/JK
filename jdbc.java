import java.sql.*;
import java.io.*;
public class jdbc {		
        public static void main(String args[]){
	try{
	        //step1 load the driver class
	        Class.forName("com.mysql.cj.jdbc.Driver");		
	        //step2 create the connection object
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","Prasanth@007");			
                //step3 create the statement object
	        Statement stmt=con.createStatement();
	
	//step4 execute query
	//ResultSet rs=stmt.executeQuery("create table employee (empid number(4), empname varchar2(25))");
	 stmt.executeUpdate("Update into dep_info set dep_name='EEE' where dep_code=2");
	 //stmt.executeUpdate("update employee set empname=‘Aravind' where empid=120");
	 //ResultSet rs=stmt.executeQuery("select * from dep_info");
	 //while(rs.next())
	 //System.out.println(rs.getInt(1)+" "+rs.getString(2));
	//ResultSet rs=stmt.executeQuery("delete from employee");
	//step5 close the connection object
	con.close();		
	}catch(Exception e){ System.out.println(e);} 		
       } 	
}