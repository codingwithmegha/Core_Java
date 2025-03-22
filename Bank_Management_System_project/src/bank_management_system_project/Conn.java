//Register a Driver
//Create Connection
//Create statement
//Execute query
//Close connection

package bank_management_system_project;

import java.sql.*;

public class Conn {
    Connection c;
    Statement s;
public Conn(){
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");  
         //Create Connection
            c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","password");
            
            //Create Statement
            s=c.createStatement();
    }catch (Exception ae){
        System.out.println(ae);
    }
    
}    
    
}
