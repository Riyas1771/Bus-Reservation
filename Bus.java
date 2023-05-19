package busRev;

import java.security.PrivateKey;

public class Bus {
	private int bus_no;
	private boolean ac;
	private int capacity;
	
	public Bus(int no,boolean ac,int cap) {
		this.bus_no=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getBus_no() {
		return bus_no;
	}

	public void setBus_no(int bus_no) {
		this.bus_no = bus_no;
	}

	public boolean isAc() {
		return ac;
	}

	public void setAc(boolean ac) {
		this.ac = ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void displayBusInfo() {
		System.out.println("busno:"+bus_no+" ac:"+ac+" capacity:"+capacity);
	}

	

}
