package busRev;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args)  {
		
	BusDAO busdao=new BusDAO();
	try {
	busdao.DisplayBusInfo();
		String userOpt = "y";
		Scanner scanner = new Scanner(System.in);
	
		
		
		while(userOpt.equalsIgnoreCase("y")) {
			System.out.println("Enter y to Book and n to exit");
			userOpt = scanner.next();
			if(userOpt.equalsIgnoreCase("y")) {
				Booking booking = new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookingdao=new BookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Sorry. Bus is full. Try another bus or date.");
			}
		}scanner.close();
	}catch(Exception e) {
		System.out.println(e);}
	}

}