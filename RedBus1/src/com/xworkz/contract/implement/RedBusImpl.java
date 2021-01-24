package com.xworkz.contract.implement;

public class RedBusImpl implements RedBusContract {

	@Override
	public void maxBooking() {
		System.out.println("maxBookin invoked");
		
	}

	@Override
	public void open() {
		System.out.println("open invoked");
		
	}

	@Override
	public void close() {
		System.out.println("close invoked");
		
	}
		
	

}
