package busRev;
 import java.sql.*;

import java.sql.DriverManager;

public class dbConnection {
    public static Connection getConnecton() throws Exception{
    	 return DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
     }
}
