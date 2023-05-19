package busRev;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;

public class BusDAO {
  
	public void DisplayBusInfo()  throws Exception {
		String query = "select * from busres.bus;";
		Connection con=dbConnection.getConnecton();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.print("BusNO:"+rs.getInt(1));
			if(rs.getInt(2)==0) {
				System.out.print(" Ac:no");
			}else {System.out.print(" Ac:Yes");}
			System.out.print(" Capacity:"+rs.getInt(3));
			System.out.println();
		}System.out.println("------------------------------");}
		
    public int getCapacity(int id) throws Exception{
    	String query = "select capacity from busres.bus where id="+id ;
		Connection con=dbConnection.getConnecton();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
    }
	}

	

