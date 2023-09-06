package cs425_pgadmin_connection;

import java.sql.Connection;
import java.sql.DriverManager;

//public class connection {
//	
//	public static void main(String[] args) {
//		connection obj = new connection();
//		obj.get_connection();
//	}
//	
//	public Connection get_connection() {
//		
//		Connection connection = null;
//		try {
//			
//			Class.forName("org.postgresql.Driver");
//			
//			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/group16","postgres","Sasi@123");
//			
//			if(connection!=null) {
//				System.out.println("Connection Established");
//			}else {
//				System.out.println("Connection Failed");
//			}
//			
//		}catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		return connection;
//	}
//}

import java.sql.*;  

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("org.postgresql.Driver");  
            c =DriverManager.getConnection("jdbc:postgresql://localhost:5432/group16","postgres","Sasi@123");    
            s =c.createStatement();  
        
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    } 
    public static void main(String args[])
    {
        new conn();
        System.out.println("Database Connected");
    }  
}  