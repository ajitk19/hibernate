package luv2Code.hibernateDemo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String jdbcUrl = "jdbc:mysql://localhost:3306/posbackendapi?useSSL=false";
    	String userId = "root";
    	String pass = "Welcome@123";
    	try {
        Connection conn = DriverManager.getConnection(jdbcUrl , userId , pass);
        System.out.println("connection successfull !!!");
    	}
    	catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
