package busRev;
import java.util.*;
import java.util.Date;
import java.sql.*;


public class BookingDAO {
	public int getBookedCount(int BusNo,Date date) throws Exception{
		String query="select count(passenger_name) from busres.booking where bus_no=? and travel_date=?";
		Connection con=dbConnection.getConnecton();
		PreparedStatement pt=con.prepareStatement(query);
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		pt.setInt(1, BusNo);
		pt.setDate(2, sqlDate);
		ResultSet rs=pt.executeQuery();
		rs.next();
		return rs.getInt(1);
	}
	public void addBooking(Booking booking) throws Exception{
		String query="insert into busres.booking values(?,?,?);";
		Connection con=dbConnection.getConnecton();
		java.sql.Date sqlDate=new java.sql.Date(booking.date.getTime());
		PreparedStatement pt=con.prepareStatement(query);
		pt.setString(1, booking.passengerName);
		pt.setInt(2, booking.busNo);
		pt.setDate(3, sqlDate);
		pt.executeUpdate();
	}


}
